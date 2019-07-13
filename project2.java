import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class project2 extends JInternalFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5;
JPasswordField p1,p3,p2;
JTextField t1,t2;
JButton b1,b2;
Connection conn;
Statement stat;
String user="";
project2(String u)
{
super("Change Password",true,true,true,true);
user=u;
setSize(500,500);
setTitle("Project2");
setLayout(null);
l1=new JLabel("CHANGE PASSWORD");
l2=new JLabel("User Login ID");
l3=new JLabel("Old Password");
l4=new JLabel("New Password");
l5=new JLabel("Repeat New Password");
t1=new JTextField(20);
p1=new JPasswordField(10);
p2=new JPasswordField(10);
p3=new JPasswordField(10);
b1=new JButton("Change /Confirm");
b2=new JButton("Cancel /Reset");
t1.setText(user);
t1.setEditable(false);

b1.addActionListener(this);
add(l1); l1.setBounds(250,30,420,70);
add(l2); l2.setBounds(20,110,200,30);
add(t1); t1.setBounds(160,110,300,25);
add(l3); l3.setBounds(20,150,200,30);
add(p1); p1.setBounds(160,150,300,25);
add(l4); l4.setBounds(20,190,200,30);
add(p2); p2.setBounds(160,190,300,25);
add(l5); l5.setBounds(20,230,200,30);
add(p3); p3.setBounds(160,230,300,25);
add(b1); b1.setBounds(30,280,200,20);  b1.addActionListener(this);
add(b2); b2.setBounds(250,280,200,20); b2.addActionListener(this);
try{
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost/mohitrawal","root","mohit@123");
stat=conn.createStatement();
}catch(Exception e1){System.out.println(e1);}
setVisible(true);
}
public static void main(String arr[])
{
//new project2();
}
public void actionPerformed(ActionEvent e)
{
try{
if(e.getSource()==b1)
{
if(p2.getText().equals(p3.getText())==false)
{
JOptionPane.showMessageDialog(this,"Invalid Password");
p1.setText("");
p2.setText("");
p3.setText("");
p1.requestFocus();
}
else
{
String str=t1.getText();
String s1="update adminlogin set pass='"+p2.getText()+"' where id='"+str+"'";
stat.executeUpdate(s1);
JOptionPane.showMessageDialog(this,"Password Changed");
}
}
if(e.getSource()==b2) 
this.dispose();
}
catch(Exception eee)
{
}
}
}