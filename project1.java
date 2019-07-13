import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class project1 extends JFrame implements ActionListener
{
JLabel l1,l2,l3;
JButton b1,b2,b3;
project1()
{
setSize(500,500);
setLayout(null);
setTitle("project1");
ImageIcon md=new ImageIcon("Experiment Wall_4.jpg");
JLabel lb=new JLabel(md);

l1=new JLabel("WELCOME");
l2=new JLabel("TO");
l3=new JLabel("MY COLLEGE");  
b1=new JButton("Admin Login");
b2=new JButton("Faculty Login");
b3=new JButton("Student Login");

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
l1.setBounds(170,60,180,30);
l2.setBounds(220,100,50,30);
l3.setBounds(170,140,400,30);
b1.setBounds(50,250,130,20);
b2.setBounds(200,250,130,20);
b3.setBounds(340,250,130,20);

lb.setBounds(0,0,500,500);
l1.setFont(new Font("Monotype Corsiva",Font.BOLD,35));
l2.setFont(new Font("Monotype Corsiva",Font.BOLD,35));
l3.setFont(new Font("Monotype Corsiva",Font.BOLD,35));
l1.setForeground(Color.black);
l2.setForeground(Color.black);
l3.setForeground(Color.black);
add(l1);
add(l2);
add(l3);
add(b1);
add(b2);
add(b3);
add(lb);

setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String a[])
{
new project1();
}
public void actionPerformed(ActionEvent e)
{
if (e.getSource()==b2)
new project4("Faculty");
if (e.getSource()==b1)
new project4("Admin");
if (e.getSource()==b3)
new project4("Student");
}
}