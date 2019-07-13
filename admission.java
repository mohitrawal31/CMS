import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class admission extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7;
JButton b1;
admission()
{
//super("Details ",true,true,true,true);
setSize(450,440);
setTitle("Courses Offered");
setLayout(null);
l1=new JLabel("B.Tech" );
l2=new JLabel("M.Tech" );
l3=new JLabel("B.com" );
l4=new JLabel("BBA" );
l5=new JLabel("MBA" );
l6=new JLabel("CSE, MECH, CIVIL, IT, ECE" );
l7=new JLabel("CLOUD COMPUTING, NETWORKING, ETHICAL HACKING, MECHANICS, ROBOTICS " );
b1=new JButton("ok");

l1.setBounds(40,60,300,20);
l2.setBounds(40,100,300,20);
l3.setBounds(40,140,400,20);
l4.setBounds(40,180,350,20);
l5.setBounds(40,220,350,20);
l6.setBounds(40,60,350,20);
l7.setBounds(40,100,350,20);
b1.setBounds(70,280,50,30);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(b1);
b1.addActionListener(this);
setVisible(true);
}
public static void main(String a[])
{
new admission();
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
this.dispose();
}
}
}