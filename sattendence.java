import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.*;
class sattendence extends JInternalFrame implements ActionListener
{
JLabel l1,l2,l3,l4;
JTextField tf1,tf2,tf3,tf4;
JTable jt;
JButton b1;
JScrollPane js;
String user="";
Connection conn;
Statement stat;
sattendence(String u)
{
super("Attendence",true,true,true,true);
setSize(500,500);
setLayout(null);
user=u;
l1=new JLabel("Name");
l2=new JLabel("Roll No.");
l3=new JLabel("Deptt");
l4=new JLabel("Semester");
tf1=new JTextField(15);
tf2=new JTextField(15);
tf3=new JTextField(15);
tf4=new JTextField(15);
b1=new JButton("Show");
l1.setBounds(30,40,80,20);
l2.setBounds(30,70,80,20);
l3.setBounds(30,100,80,20);
l4.setBounds(30,130,80,20);
tf1.setBounds(130,40,120,20);
tf2.setBounds(130,70,120,20);
tf3.setBounds(130,100,120,20);
tf4.setBounds(130,130,120,20);
b1.setBounds(200,170,80,20);
b1.addActionListener(this);
tf1.setEditable(false);
tf3.setEditable(false);
tf2.setEditable(false);
add(l1);
add(l2);
add(l3);
add(l4);
add(tf1);
add(tf2);
add(tf3);
add(tf4);
add(b1);
try
{
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost/mohitrawal","root","mohit@123");
stat=conn.createStatement();
String mnm="select name,department,rollno from project3s where userid='"+user+"'";
ResultSet rs2=stat.executeQuery(mnm);
if(rs2.next())
{
tf1.setText(rs2.getString(1));
tf3.setText(rs2.getString(2));
tf2.setText(rs2.getString(3));
}
}
catch(Exception e1)
{
System.out.println(e1);
}
setVisible(true);

}
public static void main(String a[])
{
//new sattendence();
}
public void actionPerformed(ActionEvent e)
{
String str[]=new String[4];
if(e.getSource()==b1)
{ 
try
{
int a=0;
if(jt!=null)
{
remove(js);
repaint();
}
String str1="select sub1,sub2,sub3,sub4 from subject where Dname='"+tf3.getText()+"' and sem='"+tf4.getText()+"'";


ResultSet rs1=stat.executeQuery(str1);
if(rs1.next())
{
str[0]=rs1.getString(1);
str[1]=rs1.getString(2);
str[2]=rs1.getString(3);
str[3]=rs1.getString(4);
}

String col[]={"Subjects","Attendence","Total","%age"};
Object obj[][]=new Object[4][4];
for(int i=0;i<4;i++)
{
String str2="select sum(attendence),count(attendence) from attendence where  sem='"+tf4.getText()+"' and rollno='"+tf2.getText()+"' and subject='"+str[i]+"'";
ResultSet rs3=stat.executeQuery(str2);
if(rs3.next())
{
obj[i][0]=str[i];
obj[i][1]=rs3.getString(1);
obj[i][2]=rs3.getString(2);
String ss=(String)obj[i][1];
if(ss!=null)
{
float at=Float.parseFloat(ss);
float tot=Float.parseFloat((String)obj[i][2]);
float per=(at*100)/tot;
obj[i][3]=Math.round(per);
}
else
{
obj[i][1]="0";
obj[i][3]="0";
}
}
}
jt=new JTable(obj,col);
js=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
add(js);
js.setBounds(80,200,300,200);

}
catch(Exception eee)
{
System.out.println(eee);
eee.printStackTrace();
}
}
}
}