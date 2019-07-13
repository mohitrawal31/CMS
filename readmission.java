import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
class readmission extends JInternalFrame implements ActionListener
{
JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;
JTextField t1,t2,t3,t4,t5,t6,t7,t8;
JRadioButton r1,r2,r3,r4,r7,r8;
Date d=new Date();
int b,c,ee;
String s1,s2;
SimpleDateFormat sd=new SimpleDateFormat("dd/MMM/YYYY");
Connection conn;
Statement stmt;
JButton b1,b2,b3;
readmission()
{
super("Re-Admission",true,true,true,true);
setSize(500,500);
setLayout(null);
j1=new JLabel("Roll No");
j2=new JLabel("Date");
j3=new JLabel("Name");
j4=new JLabel("Father's Name");
j5=new JLabel("Semester ");
j7=new JLabel("Sem Fee");
j8=new JLabel("Hostel Facility");
j9=new JLabel("Transport Facility");
j10=new JLabel("Total Fee");
j6=new JLabel("Deptt");
t1=new JTextField(15);
t2=new JTextField(15);
t3=new JTextField(15);
t4=new JTextField(15);
t5=new JTextField(15);
t6=new JTextField(15);
t7=new JTextField(15);
t8=new JTextField(15);
ButtonGroup bg=new ButtonGroup();
ButtonGroup bg1=new ButtonGroup();
r1=new JRadioButton("Yes"); 
r2=new JRadioButton("No");
r3=new JRadioButton("Yes");
r4=new JRadioButton("No");
r7=new JRadioButton();
r8=new JRadioButton();
bg.add(r1);
bg.add(r2);
bg1.add(r3);
bg1.add(r4);
bg.add(r7);
bg1.add(r8);
b1=new JButton("Show");
b2=new JButton("Save");
b3=new JButton("Print");
j1.setBounds(30,30,90,20);
j2.setBounds(30,60,90,20);
j3.setBounds(30,90,90,20);
j4.setBounds(30,120,90,20);
j5.setBounds(30,150,90,20);
j6.setBounds(30,180,90,20);
j7.setBounds(30,210,90,20);
j8.setBounds(30,240,90,20);
j9.setBounds(30,270,100,20);
j10.setBounds(30,300,90,20);
b1.setBounds(60,330,90,20);
b2.setBounds(180,330,90,20);
b3.setBounds(120,370,90,20);
t1.setBounds(120,30,120,20);
t2.setBounds(120,60,120,20);
t3.setBounds(120,90,120,20);
t4.setBounds(120,120,120,20);
t5.setBounds(120,150,120,20);
t6.setBounds(120,180,120,20);
t7.setBounds(120,210,120,20);
t8.setBounds(120,300,120,20);
r1.setBounds(120,240,50,20);
r2.setBounds(180,240,50,20);
r3.setBounds(140,270,50,20);
r4.setBounds(190,270,50,20);
add(j1);
add(j2);
add(j3);
add(j4);
add(j5);
add(j6);
add(j7);
add(j8);
add(j9);
add(j10);
add(b1);
add(b2);
add(r1);
add(r2);
add(r3);
add(r4);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
add(t8);
add(b3);
b2.addActionListener(this);
b1.addActionListener(this);
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
//setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String a[])
{
//new readmission();
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
t2.setText(sd.format(d));
t5.setText("1");
String str=t1.getText();
try
{
String str1="select name,fname,dept_code,sem_fee,hostel,transport from data1 where Roll_no='"+str+"'";
ResultSet rs= stmt.executeQuery(str1);
if(rs.next())
{
String str2=rs.getString(1);
t3.setText(str2);
String str3=rs.getString(2);
t4.setText(str3);
String str5=rs.getString(3);
t6.setText(str5);
String str6=rs.getString(4);
t7.setText(str6);
String str8=rs.getString(5);
if(str8.equals("yes"))
r1.setSelected(true);
else if(str8.equals("no"))
r2.setSelected(true);
String str9=rs.getString(6);
if(str9.equals("yes"))
r3.setSelected(true);
else if(str9.equals("no"))
r4.setSelected(true);
}
}
catch(Exception ee)
{
}
}

if(e.getSource()==b2)
{
try
{
String str7="insert into readm values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+s1+"','"+s2+"','"+t8.getText()+"')";
stmt.executeUpdate(str7);
JOptionPane.showMessageDialog(this,"Record saved SuccessFully");
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
r7.setSelected(true);
r8.setSelected(true);
t1.requestFocus();
}
catch(Exception eee)
{
}
}
if(e.getSource()==b3)
{

if(r1.isSelected())
{
b=Integer.parseInt(t7.getText());
c=b+36000;
s1="yes";
if(r3.isSelected())
{
ee=c+15000;
s2="yes";
}
else
{
ee=c;
s2="no";
}
t8.setText(String.valueOf(ee));
}
if(r2.isSelected())
{
b=Integer.parseInt(t7.getText());
c=b;
s1="no";
if(r3.isSelected())
{
ee=c+15000;
s2="yes";
}
else
{
ee=c;
s2="no";
}
t8.setText(String.valueOf(ee));
}
}
}
}