import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class project4 extends JFrame implements ActionListener
{
JLabel l1,l2,l3;
JButton b1,b2;
JTextField tf1;
JPasswordField tf2;
Connection conn;
Statement stat;
public static String utype="";
project4(String user)
{
utype=user;
setSize(500,500);
setTitle("LOGIN PAGE");
setLayout(null);
l1=new JLabel(user+" LOGIN");
l2=new JLabel("User Id");
l3=new JLabel("Password");
b1=new JButton("login");
b1.addActionListener(this);
b2=new JButton("Cancel");
b2.addActionListener(this);
tf1=new JTextField(20);
tf2=new JPasswordField(20);

add(l1);
l1.setBounds(150,10,180,30);
add(l2);
l2.setBounds(50,50,80,20);
add(tf1);
tf1.setBounds(130,50,200,20);
add(l3);
l3.setBounds(50,80,80,20);
add(tf2);
tf2.setBounds(130,80,200,20);
add(b1);
b1.setBounds(80,120,80,20);
add(b2);
b2.setBounds(190,120,80,20);
try{
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost/mohitrawal","root","mohit@123");
stat=conn.createStatement();
}
catch(Exception e1)
{
System.out.println(e1);
}
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}

public static void main(String st[])
{
new project4(utype);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try{
String str=tf1.getText();
String s1="";
if(utype.equals("Admin"))
s1="select pass from adminlogin where id='"+str+"'";
else if(utype.equals("Faculty"))
s1="select password from project3f where userid='"+str+"'";
else if(utype.equals("Student"))
s1="select password from project3s where userid='"+str+"'";
else
{
}

ResultSet rs=stat.executeQuery(s1);
if(rs.next())
{ 
if((rs.getString(1)).equals(tf2.getText()))
{
if(utype.equals("Admin"))
new project11(tf1.getText());
if(utype.equals("Faculty"))
new project12();
if(utype.equals("Student"))
new project5(tf1.getText());
dispose();
}
else
{  
JOptionPane.showMessageDialog(this,"Invalid Username or Password");
tf1.setText("");
tf2.setText("");
tf1.requestFocus();
}
/*else
{
JOptionPane.showMessageDialog(this,"Invalid Username");
tf1.setText("");
tf1.requestFocus();
}*/
}
}
catch(Exception eds){System.out.println(eds);}
}
if(e.getSource()==b2)
this.dispose();
}
}