import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class project5 extends JFrame implements ActionListener
{
JMenuBar jm;
JMenu m1,m2;
JMenuItem i3,i4,i5,i6;
JPanel p1,p2;
JLabel l1;
JDesktopPane pane=new JDesktopPane();
String user1="";
project5(String u)
{
user1=u;
setSize(500,500);
setTitle("Student Page");
setLayout(null);
jm=new JMenuBar();
p1=new JPanel();
p2=new JPanel();
l1=new JLabel("My College");
m1=new JMenu("Home");
m2=new JMenu("Report"); 
i3=new JMenuItem("Attendence Report");
i4=new JMenuItem("Marks Report");
i6=new JMenuItem("Change Password");
m1.add(i6);
m2.add(i3);
m2.add(i4);
jm.add(m1);
jm.add(m2);
i3.addActionListener(this);
i4.addActionListener(this);
i6.addActionListener(this);
l1.setBounds(50,30,200,40);
ImageIcon mm=new ImageIcon("mycollege.jpg");
JLabel h=new JLabel(mm);
p1.add(l1);
p2.add(jm);
add(p1,"North");
add(p2,"West");
setContentPane(pane);
setJMenuBar(jm);
h.setBounds(0,0,500,490);
add(h);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String a[])
{
new project5("");
}

public void actionPerformed(ActionEvent ee)
{
if(ee.getSource()==i6)
{
changepass obj1=new changepass(user1);
pane.add(obj1);
try
{
obj1.setMaximum(true);
}
catch(Exception e)
{
obj1.show();
}
}
if(ee.getSource()==i3)
{
sattendence obj2=new sattendence(user1);
pane.add(obj2);
try
{
obj2.setMaximum(true);
}
catch(Exception e)
{
obj2.show();
}
}
if(ee.getSource()==i4)
{
smarks obj3=new smarks(user1);
pane.add(obj3);
try
{
obj3.setMaximum(true);
}
catch(Exception e)
{
obj3.show();
}
}
}
}