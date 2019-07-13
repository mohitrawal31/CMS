import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class project3 extends JInternalFrame implements ActionListener,ItemListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
JTextField t1,t2,t5,t6,t7,t8,t9;
JRadioButton r1,r2,r3;
ButtonGroup bg=new ButtonGroup();
JButton b1,b2,b3,b4,b5,b6;
JComboBox cb;
JPasswordField t3,t4;
Connection conn;
Statement stmt;
String cb1;
project3()
{
super("Sign Up",true,true,true,true);
setTitle("Sign Up");
setSize(500,500);
setLayout(null);
l1=new JLabel("Name");
l2=new JLabel("User ID");
l3=new JLabel("Password");
l4=new JLabel("Re-enter password");
l5=new JLabel("User Type");
l6=new JLabel("Phone no");
l7=new JLabel("Department");
l8=new JLabel("Create new");
l9=new JLabel("Roll No");
t1=new JTextField(15);
t2=new JTextField(20);
t9=new JTextField(20);
t3=new JPasswordField(16);
t4=new JPasswordField(16);
t5=new JTextField(10);
t6=new JTextField(1);

r1=new JRadioButton("Faculty");
r2=new JRadioButton("Student");
r3=new JRadioButton();
b1=new JButton("Create new");
b2=new JButton("Save user");
b3=new JButton("Back");
cb=new JComboBox();
cb.addItem("Select dept");
cb.addItem("MECH");
cb.addItem("CSE");
cb.addItem("ECE");
cb.addItem("CIVIL");
cb.addItem("IT");

bg.add(r1);
bg.add(r2);
bg.add(r3);
add(l9);
l9.setBounds(15,50,100,20);
add(l1);
l1.setBounds(15,80,100,20);
add(t1);
t1.setBounds(120,80,300,20);
t9.setBounds(120,50,300,20);
add(l2);
l2.setBounds(15,110,100,20);
add(t2);
t2.setBounds(120,110,300,20);
add(l3);
l3.setBounds(15,140,100,20);
add(t3);
t3.setBounds(120,140,300,20);
add(l4);
l4.setBounds(15,170,100,20);
add(t4);
t4.setBounds(120,170,300,20);


add(l5);
l5.setBounds(15,200,100,20);
add(r1);
r1.setBounds(120,200,75,20);

add(r2);
r2.setBounds(200,200,75,20);

add(l6);
l6.setBounds(15,230,100,20);
add(t5);
t5.setBounds(120,230,300,20);

add(l7);
l7.setBounds(15,260,100,20);
add(cb);
cb.setBounds(120,260,100,20);

add(b1);
b1.setBounds(50,310,100,20);
add(b2);
b2.setBounds(175,310,100,20);
add(b3);
add(l9);
add(t9);

b3.setBounds(300,310,100,20);
cb.addItemListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
try
{
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost/mohitrawal","root","mohit@123");
stmt=conn.createStatement();

}
catch(Exception e)
{
System.out.println(e);
}

setVisible(true);

}
public static void main(String ar[])
{
//new project3();
}
void empty()
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t9.setText("");
r3.setSelected(true);
cb.setSelectedItem("Select dept");
t9.requestFocus();
t9.setEditable(true);
t1.setEditable(true);
}
public void actionPerformed(ActionEvent ae)
{
try
{
String type;
if(r1.isSelected())
type="faculty";
else
type="student";
if(ae.getSource()==b1)
{
String str1="select name from data1 where roll_no='"+t9.getText()+"'";
ResultSet rs2=stmt.executeQuery(str1);
if(rs2.next())
{
t1.setText(rs2.getString(1));
}
t9.setEditable(false);
t1.setEditable(false);
}
if(ae.getSource()==b3)
{
this.dispose();
}

if(ae.getSource()==b2)
{
if(validate.checkstring(t1.getText())==false)
{
JOptionPane.showMessageDialog(this,"Invalid User Name");
t1.requestFocus();
}
else if(t3.getText().equals(t4.getText())==false)
{
JOptionPane.showMessageDialog(this,"Invalid Password");
t3.setText("");
t4.setText("");
t3.requestFocus();
}
else if(validate.checknum(t5.getText())==false)
{
JOptionPane.showMessageDialog(this,"Invalid Phone Number");
t5.setText("");
t5.requestFocus();
}
else
{
String str;
if(type=="faculty")
str="insert into project3f values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t5.getText()+"','"+cb1+"')";
else
str="insert into project3s values('" +t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t5.getText()+"','"+cb1+"','"+t9.getText()+"')";

stmt.executeUpdate(str);
JOptionPane.showMessageDialog(this,"Record saved successfully ");
empty();
}
}
}
catch(Exception e1)
{
System.out.println(e1);

}
}
public void itemStateChanged(ItemEvent e)
{
cb1=cb.getSelectedItem().toString();
}
}