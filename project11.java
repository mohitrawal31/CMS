import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class project11 extends JFrame implements ActionListener
{
JMenuBar jm;
JMenu m1,m2,m5;
JMenuItem i2,i3,i7,i8,i10,i1,i11;
JPanel p1,p2;
JLabel l1;
JButton b1;

JDesktopPane pane=new JDesktopPane();

String user="";
project11(String u)
{
user=u;
b1=new JButton("Back");
setSize(500,500);
setTitle("Admin's Page");
setLayout(null);
jm=new JMenuBar();
p1=new JPanel();
p2=new JPanel();
l1=new JLabel("Flash University");
m1=new JMenu("Home");
m2=new JMenu("Admission");
m5=new JMenu("Subject Details");
i2=new JMenuItem("New Admission");      
i2.addActionListener(this);
i3=new JMenuItem("Modify Details");   
i3.addActionListener(this);
i1=new JMenuItem("Re-Admission");
i1.addActionListener(this);
i7=new JMenuItem("Add Subjects");                 
i7.addActionListener(this);
i8=new JMenuItem("Show Subjects");              
i8.addActionListener(this);
i10=new JMenuItem("Change Password");      
i10.addActionListener(this);
i11=new JMenuItem("Sign Up");
i11.addActionListener(this);

m1.add(i10);
m1.add(i11);
m2.add(i2);
m2.add(i3);
m2.add(i1);
m5.add(i7);
m5.add(i8);
jm.add(m1);
jm.add(m2);
jm.add(m5);
l1.setBounds(20,30,200,40);
ImageIcon mm=new ImageIcon("mycollege.jpg");
JLabel h=new JLabel(mm);

p1.add(l1);
p2.add(jm);
add(p1,"North");
add(p2,"West");
add(b1);
b1.setBounds(20,20,80,20);    
b1.addActionListener(this);
setContentPane(pane);
setJMenuBar(jm);
h.setBounds(0,0,500,490);
add(h);
setVisible(true);
}
public static void main(String a[])
{
new project11("");
}

public void actionPerformed(ActionEvent ee)
{
if(ee.getSource()==i10)
{
project2 obj1=new project2(user);
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
if(ee.getSource()==i11)
{
project3 obj15=new project3();
pane.add(obj15);
try
{
obj15.setMaximum(true);
}
catch(Exception e)
{
obj15.show();
}
}
if(ee.getSource()==i7)
{
project7 obj3=new project7();
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

if(ee.getSource()==i2 || ee.getSource()==i3 )
{
project6 obj2=new project6();
pane.add(obj2);
System.out.println("ddd11");
try
{
obj2.setMaximum(true);
}
catch(Exception e)
{
obj2.show();
}
}
if(ee.getSource()==i8)
{
project8 obj4=new project8();
pane.add(obj4);
try
{
obj4.setMaximum(true);
}
catch(Exception e)
{
obj4.show();
}
}
if(ee.getSource()==i1)
{
readmission obj5=new readmission();
pane.add(obj5);
try
{
obj5.setMaximum(true);
}
catch(Exception e)
{
obj5.show();
}
}
if(ee.getSource()==b1)
this.dispose();
}
}