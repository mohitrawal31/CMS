import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class project12 extends JFrame implements ActionListener
{
JMenuBar jm;
JMenu m1,m2,m4,m5;
JMenuItem i1,i3,i6,i8,i9,i10;
JPanel p1,p2;
JDesktopPane pane=new JDesktopPane();
project12()
{
setSize(500,500);
setLayout(null);
setTitle("Faculty Page");
jm=new JMenuBar();
p1=new JPanel();
p2=new JPanel();
m1=new JMenu("Home");
m4=new JMenu("Marks");
m5=new JMenu("Enquiry");
m2=new JMenu("Attendence");
i10=new JMenuItem("Total Attendence");
i6=new JMenuItem("Subjetc Wise");
i6.addActionListener(this);
i1=new JMenuItem("Display");
i1.addActionListener(this);
i10.addActionListener(this);
i8=new JMenuItem("Contact Us");
i9=new JMenuItem("President's Message");

m1.add(i9);
m2.add(i10);
i9.addActionListener(this);
i8.addActionListener(this);
m4.add(i6);
m4.add(i1);
m5.add(i8);
jm.add(m1);
jm.add(m4);
jm.add(m2);
jm.add(m5);
ImageIcon mm=new ImageIcon("mycollege.jpg");
JLabel h=new JLabel(mm);

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
new project12();
}
public void actionPerformed(ActionEvent ee)
{
if(ee.getSource()==i6)
{
addmarks obj1=new addmarks();
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
if(ee.getSource()==i10)
{
attendence obj16=new attendence();
pane.add(obj16);
try
{
obj16.setMaximum(true);
}
catch(Exception e)
{
obj16.show();
}
}
if(ee.getSource()==i9)
{
president objm=new president();
pane.add(objm);
try
{
objm.setMaximum(true);
}
catch(Exception e)
{
objm.show();
}
}
if(ee.getSource()==i8)
{
contactus obj11=new contactus();
pane.add(obj11);
try
{
obj11.setMaximum(true);
}
catch(Exception e2)
{
obj11.show();
}
}
if(ee.getSource()==i1)
{
disp obj2=new disp();
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
}
}