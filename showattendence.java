import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.*;
class showattendence extends JFrame implements ActionListener,ItemListener 
{
JLabel l1,l2,l3,l4,l6;
JComboBox c1,c2,c3;
JTextField tf1,tf2;
JButton b1;
JTable jt;
JScrollPane js;
Connection conn;
Date d=new Date();
Calendar c=Calendar.getInstance();
int q=0,w=0;
SimpleDateFormat sd=new SimpleDateFormat("dd/MMM/YYYY");
Date d1;
SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/YYYY");
Statement stat;
showattendence()
{
setSize(500,500);
setLayout(null);
l1=new JLabel("Deptt");
l2=new JLabel("Semester");
l3=new JLabel("Subject");
l4=new JLabel("Date");
l6=new JLabel("To");
tf1=new JTextField(15);
tf2=new JTextField(15);
c1=new JComboBox();
c2=new JComboBox();
c3=new JComboBox();
b1=new JButton("Show");
c1.addItem("Select");
c1.addItem("CSE");
c1.addItem("MECH");
c1.addItem("CIVIL");
c1.addItem("IT");
c1.addItem("ECE");
c2.addItem("Select");
c2.addItem("1");
c2.addItem("2");
c2.addItem("3");
c2.addItem("4");
c2.addItem("5");
c2.addItem("6");
c2.addItem("7");
c2.addItem("8");
c3.addItem("Select");
add(l1);
add(l2);
add(l3);
add(l4);
add(l6);
add(c1);
add(c2);
add(c3);
add(tf1);
add(tf2);
add(b1);
tf2.setText(sd.format(d));
l1.setBounds(30,40,90,20);
l2.setBounds(30,70,90,20);
l3.setBounds(30,100,90,20);
l4.setBounds(30,130,90,20);
tf1.setBounds(100,130,90,20);
l6.setBounds(200,130,90,20);
tf2.setBounds(240,130,90,20);
b1.setBounds(150,170,90,20);
c1.setBounds(100,40,150,20);
c2.setBounds(100,70,150,20);
c3.setBounds(100,100,150,20);
b1.addActionListener(this);
c2.addItemListener(this);
try
{
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost/mohitrawal","root","mohit@123");
stat=conn.createStatement();
}
catch(Exception e1)
{
System.out.println(e1);
}
q=c.get(Calendar.MONTH);
w=c.get(Calendar.YEAR);
GregorianCalendar ge=new GregorianCalendar(w,q,1);
d1=ge.getTime();
tf1.setText(sdf.format(d1));

setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String s[])
{
new showattendence();
}

public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b1 && c1.getSelectedIndex()>0 && c2.getSelectedIndex()>0 && c3.getSelectedIndex()>0 )
{
try
{
int a=0;
if(jt!=null)
{
remove(js);
repaint();
}

String str="select count(rollno) from attendence where Deptt='"+c1.getSelectedItem()+"' and sem='"+c2.getSelectedItem()+"' and subject='"+c3.getSelectedItem()+"'";

ResultSet rs1=stat.executeQuery(str);
if(rs1.next())
a=rs1.getInt(1);
System.out.println(a);
if(a>0)
{
String str2="select rollno,sum(attendence) from attendence where Deptt='"+c1.getSelectedItem()+"' and sem='"+c2.getSelectedItem()+"' and subject='"+c3.getSelectedItem()+"' group by rollno";

String col[]={"Roll No","Attendence"};
Object obj[][]=new Object[a][2];
int i=0;
ResultSet rs3=stat.executeQuery(str2);
while(rs3.next())
{
obj[i][0]=rs3.getString(1);
obj[i][1]=rs3.getString(2);
i++;
}
jt=new JTable(obj,col);
js=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
add(js);
js.setBounds(80,200,300,200);
}
}
catch(Exception eee)
{
System.out.println(eee);
}
}
}
public void itemStateChanged(ItemEvent ee)
{
try
{
if(ee.getSource()==c2 && ee.getStateChange()==ItemEvent.SELECTED)
{
if(c2.getSelectedIndex()>0)
{
String str="select sub1,sub2,sub3,sub4 from subject where dname='"+c1.getSelectedItem()+"' and sem='"+c2.getSelectedItem()+"'";
ResultSet rs = stat.executeQuery(str);
c3.removeAllItems();
c3.addItem("Select");
while(rs.next())
{
c3.addItem(rs.getString(1));
c3.addItem(rs.getString(2));
c3.addItem(rs.getString(3));
c3.addItem(rs.getString(4));
}
}
}
}
catch(Exception e)
{
}
}
}


