import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.*;
class smarks extends JInternalFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5;
JTextField tf1,tf2,tf3,tf4,tf5;
JTable jt;
JButton b1;
JScrollPane js;
String user="";
Connection conn;
Statement stat;
smarks(String u)
{
super("Marks",true,true,true,true);
user=u;
setSize(500,500);
setLayout(null);
l1=new JLabel("Name");
l2=new JLabel("Roll No.");
l3=new JLabel("Deptt");
l4=new JLabel("Semester");
l5=new JLabel("Sessional");
tf1=new JTextField(15);
tf2=new JTextField(15);
tf3=new JTextField(15);
tf4=new JTextField(15);
tf5=new JTextField(15);
b1=new JButton("Show");
l1.setBounds(30,40,80,20);
l2.setBounds(30,70,80,20);
l3.setBounds(30,100,80,20);
l4.setBounds(30,130,80,20);
l5.setBounds(30,160,80,20);
tf1.setBounds(130,40,120,20);
tf2.setBounds(130,70,120,20);
tf3.setBounds(130,100,120,20);
tf4.setBounds(130,130,120,20);
tf5.setBounds(130,160,120,20);
b1.setBounds(200,200,80,20);
b1.addActionListener(this);
add(l1);
add(l2);
add(l3);
add(l4);
add(tf1);
add(tf2);
add(tf3);
add(tf4);
add(tf5);
add(l5);
add(b1);
tf1.setEditable(false);
tf3.setEditable(false);
tf2.setEditable(false);
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
//new smarks();
}
public void actionPerformed(ActionEvent e)
{
String str[]=new String[4];
String mn[]=new String[4];
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

String col[]={"Subjects","Marks"};
Object obj[][]=new Object[4][2];
int ss=1;
for(int i=0;i<4;i++)
{
String str2="select  sub1_marks,sub2_marks,sub3_marks,sub4_marks from marks1 where  sem='"+tf4.getText()+"' and rollno='"+tf2.getText()+"' and sessionals='"+tf5.getText()+"'";
ResultSet rs3=stat.executeQuery(str2);
if(rs3.next())
{
obj[i][0]=str[i];
mn[i]=rs3.getString(ss);
obj[i][1]=mn[i];
ss++;
}
}
jt=new JTable(obj,col);
js=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
add(js);
js.setBounds(80,240,300,200);

}
catch(Exception eee)
{
System.out.println(eee);
}
}
}
}