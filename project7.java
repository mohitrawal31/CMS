import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class project7 extends JInternalFrame implements ItemListener,ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
JTextField tf1,tf2,tf3,tf4,tf5;
JButton b1;
JComboBox cb1,cb2;
Connection conn;
Statement stat;
project7()
{

super("Subject details",true,true,true,true);
setSize(500,500);
setTitle("Add Subject");
setLayout(null);
l1=new JLabel("Subjects");
l2=new JLabel("Dept Name:");
l3=new JLabel("Dept Code:");
l4=new JLabel("Semester:");
l5=new JLabel("Subjects:");
l6=new JLabel();
l7=new JLabel();
l8=new JLabel();
l9=new JLabel();
cb1=new JComboBox();  cb1.addItemListener(this);
cb2=new JComboBox();  cb2.addItemListener(this);
cb1.addItem("CSE");
cb1.addItem("ME");
cb1.addItem("ECE");
cb1.addItem("CIVIL");
cb1.addItem("IT");
cb2.addItem("1");
cb2.addItem("2");
cb2.addItem("3");
cb2.addItem("4");
cb2.addItem("5");
cb2.addItem("6");
cb2.addItem("7");
cb2.addItem("8");
tf1=new JTextField(20);
tf2=new JTextField(20);
tf3=new JTextField(20);
tf4=new JTextField(20);
tf5=new JTextField(20);
b1=new JButton("Save");
b1.addActionListener(this);
add(l1);
l1.setBounds(100,10,180,30);
add(l2);
l2.setBounds(50,50,80,20);
add(cb1);
cb1.setBounds(130,50,200,20);
add(l3);
l3.setBounds(50,80,80,20);
add(tf1);
tf1.setBounds(130,80,200,20);
add(l4);
l4.setBounds(50,110,80,20);
add(cb2);
cb2.setBounds(130,110,200,20);
add(l5);
l5.setBounds(50,140,80,20);
add(l6);
l6.setBounds(130,140,80,20);
add(l7);
l7.setBounds(130,170,80,20);
add(l8);
l8.setBounds(130,200,80,20);
add(l9);
l9.setBounds(130,230,80,20);

add(tf2);
tf2.setBounds(200,140,200,20);
add(tf3);
tf3.setBounds(200,170,200,20);
add(tf4);
tf4.setBounds(200,200,200,20);
add(tf5);
tf5.setBounds(200,230,200,20);
add(b1);
b1.setBounds(100,260,200,20);

try
{
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost/mohitrawal","root","mohit@123");
stat=conn.createStatement();
}
catch(Exception e1)
{
}

setVisible(true);
}
public static void main(String st[])
{
new project7();
}
public void itemStateChanged(ItemEvent e)
{
try{
tf1.setText(cb1.getSelectedItem().toString());

String str=cb1.getSelectedItem().toString()+cb2.getSelectedItem().toString()+"0";
l6.setText(str+"1");
l7.setText(str+"2");
l8.setText(str+"3");
l9.setText(str+"4");
}
catch(Exception eee)
{
}
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try{
String str,s1=cb1.getSelectedItem().toString(),s2=cb2.getSelectedItem().toString();
str="insert into subject values('"+s1+"','"+s2+"','"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"','"+tf5.getText()+"')";
stat.executeUpdate(str);
}
catch(Exception eee)
{
}
}
}
}