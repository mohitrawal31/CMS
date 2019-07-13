import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class contactus extends JInternalFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5;
JButton b1;
contactus()
{
super("Contact Us",true,true,true,true);
setSize(450,440);
setTitle("Contact Us");
setLayout(null);
l1=new JLabel("My College" );
l2=new JLabel("Connaught Place, New Delhi 000001" );
l3=new JLabel("Admission Helpline: 011-3991000 Fax: 0172-391212" );
l4=new JLabel("Mobile: +91 99999 44444, +91 99999 55555, +91 99999 99999" );
l5=new JLabel("Toll free; 1800 200 1111 | Website: www.mycollege.edu.in" );
b1=new JButton("ok");

l1.setBounds(40,60,300,20);
l2.setBounds(40,100,300,20);
l3.setBounds(40,140,400,20);
l4.setBounds(40,180,350,20);
l5.setBounds(40,220,350,20);
b1.setBounds(70,280,50,30);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(b1);
b1.addActionListener(this);
setVisible(true);
}
public static void main(String a[])
{
//new contactus();
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
this.dispose();
}
}
}