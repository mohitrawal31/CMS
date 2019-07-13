import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
class project6 extends JInternalFrame implements ActionListener,ItemListener
{
JLabel j0,j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9;
JComboBox ch;
String ss,s1,s2,str,s4,str4,s6;
JButton b1,b2,b3,b4,b5;
int a,b,c,ee;
Date d=new Date();
SimpleDateFormat sd=new SimpleDateFormat("dd/MMM/YYYY");
Connection conn;
Statement stmt;
project6()
{
super("Adm",true,true,true,true);
setSize(900,900);
setLayout(null);

ch=new JComboBox();
ch.addItem("-Select-");
ch.addItem("CSE");
ch.addItem("MECH");
ch.addItem("ECE");
ch.addItem("CIVIL");
ch.addItem("IT");
j0=new JLabel("Admission Form");
j1=new JLabel("Admission No.");
j2=new JLabel("Admission Date");
j3=new JLabel("Department Code");
j4=new JLabel("Branch Code");
j5=new JLabel("Roll No.");
j6=new JLabel("Name");
j7=new JLabel("Father's Name");
j8=new JLabel("Mother's Name");
j9=new JLabel("Gender");
j10=new JLabel("Hostel Facility");
j11=new JLabel("Transport Facility");
j12=new JLabel("Phone No.");
j13=new JLabel("Address");
j14=new JLabel("Per Sem.Fee");
j15=new JLabel("Total Fee");
t1=new JTextField(15);
t2=new JTextField(15);
t3=new JTextField(15);
t4=new JTextField(15);
t5=new JTextField(15);
t6=new JTextField(15);
t7=new JTextField(15);
t8=new JTextField(15);
t9=new JTextField(15);
t10=new JTextField(15);
t11=new JTextField(15);
t12=new JTextField(15);
ButtonGroup bg=new ButtonGroup();
ButtonGroup bg1=new ButtonGroup();
ButtonGroup bg2=new ButtonGroup();


r1=new JRadioButton("Yes"); 
r2=new JRadioButton("No");
r3=new JRadioButton("Yes");
r4=new JRadioButton("No");
r5=new JRadioButton("Male");
r6=new JRadioButton("Female");
r7=new JRadioButton();
r8=new JRadioButton();
r9=new JRadioButton();

bg.add(r1);
bg.add(r2);
bg1.add(r3);
bg1.add(r4);
bg2.add(r5);
bg2.add(r6);
bg2.add(r7);
bg1.add(r8);
bg.add(r9);
b1=new JButton("New");
b2=new JButton("Save");
b3=new JButton("Modify");
b4=new JButton("Search");
b5=new JButton("Back");  
b5.addActionListener(this);  
j0.setBounds(250,20,100,30);
j1.setBounds(50,60,150,20);
j2.setBounds(50,90,150,20);
j3.setBounds(50,120,150,20);
j4.setBounds(50,150,150,20);
j5.setBounds(50,180,150,20);
j6.setBounds(50,210,150,20);
j7.setBounds(50,240,150,20);
j8.setBounds(50,270,150,20);
j9.setBounds(50,300,150,20);
j10.setBounds(50,330,150,20);
j11.setBounds(50,360,150,20);
j12.setBounds(50,390,150,20);
j13.setBounds(50,420,150,20);
j14.setBounds(50,450,150,20);
j15.setBounds(50,480,150,20);
t1.setBounds(250,60,150,20);
t2.setBounds(250,90,150,20);
ch.setBounds(250,120,150,20);
t3.setBounds(250,150,150,20);
t4.setBounds(250,180,150,20);
t5.setBounds(250,210,150,20);
t6.setBounds(250,240,150,20);
t7.setBounds(250,270,150,20);
r5.setBounds(250,300,73,20);
r6.setBounds(320,300,100,20);
t8.setBounds(250,390,150,20);
t9.setBounds(250,420,150,20);
t10.setBounds(250,450,150,20);
t11.setBounds(250,480,150,20);
r1.setBounds(250,330,50,20);
r2.setBounds(320,330,50,20);
r3.setBounds(250,360,50,20);
r4.setBounds(320,360,50,20);
b1.setBounds(100,540,100,20);
b2.setBounds(230,540,100,20);
b3.setBounds(350,540,100,20);
b4.setBounds(100,580,100,20);
t12.setBounds(240,580,100,20);
b5.setBounds(350,580,100,20);
add(j0);
add(j1);
add(t1);
add(j2);
add(t2);
add(j3);
add(ch);
add(j4);
add(t3);
add(j5);
add(t4);
add(j6);
add(t5);
add(j7);
add(t6);
add(j8);
add(t7);
add(j9);
add(r5);
add(r6);
add(j10);
add(r1);
add(r2);
add(j11);
add(r3);
add(r4);
add(j12);
add(t8);
add(j13);
add(t9);
add(j14);
add(t10);
add(j15);
add(t11);
add(j15);
add(t11);
add(b1);
add(b2);
add(b3);
add(b4);

add(t12);
add(b5);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
ch.addItemListener(this);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
r4.addActionListener(this);
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

public static void main(String a[])
{
//new project6();
}
public void itemStateChanged(ItemEvent e5)
{
try
{
int n=0;
String s1="select count(*) from data1 where Dept_code='"+ch.getSelectedItem()+"'";
ResultSet rs= stmt.executeQuery(s1);
if(rs.next())
{
n=rs.getInt(1);
n++;
int aa=1000+n;
s6=ch.getSelectedItem()+"-"+String.valueOf(aa);
}
}
catch(Exception e7)
{
System.out.println(e7);
} 
if(ch.getSelectedItem()=="CSE")
{
s4="Cse-001";
t3.setText(s4);
t10.setText("43000");
t4.setText(s6);
}
if(ch.getSelectedItem()=="MECH")
{
s4="Mech-001";
t3.setText(s4);
t10.setText("43000");
t4.setText(s6);
}
if(ch.getSelectedItem()=="ECE")
{
s4="Ece-001";
t3.setText(s4);
t10.setText("43000");
t4.setText(s6);
}
if(ch.getSelectedItem()=="CIVIL")
{
s4="Civil-001";
t3.setText(s4);
t10.setText("43000");
t4.setText(s6);
}
if(ch.getSelectedItem()=="IT")
{
s4="It-001";
t3.setText(s4);
t10.setText("43000");
t4.setText(s6);
}
}

public void actionPerformed(ActionEvent e)
{
if(r1.isSelected())
{
b=Integer.parseInt(t10.getText());
c=b+36000;
if(r3.isSelected())
ee=c+15000;
else
ee=c;
t11.setText(String.valueOf(ee));
}
if(r2.isSelected())
{
b=Integer.parseInt(t10.getText());
c=b;
if(r3.isSelected())
ee=c+15000;
else
ee=c;
t11.setText(String.valueOf(ee));
}

if(e.getSource()==b1)
{
try
{
String s3="Select count(*) from data1";
ResultSet a=stmt.executeQuery(s3);
if(a.next())
t1.setText(String.valueOf(a.getInt(1)+1));
b2.setEnabled(true);
t2.setText(sd.format(d));
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");

t10.setText("");
t11.setText("");
r7.setSelected(true);
r8.setSelected(true);
r9.setSelected(true);
t1.setEditable(false);

}
catch(Exception e3)
{
System.out.println(e3);
}
}
if(e.getSource()==b2)
{
try
{
if(r5.isSelected())
ss="male";
if(r6.isSelected())
ss="female";
if(r1.isSelected())
{
s1="yes";
}
else if(r2.isSelected())
{
s1="no";
}
if(r3.isSelected())
{
s2="yes";
}
else if(r4.isSelected())
{
s2="no";
}
if(validate.checkstring(t5.getText())==false)
{
t1.setText("");
t1.requestFocus();
}
if(validate.checkstring(t6.getText())==false)
{
t1.setText("");
t1.requestFocus();
}
if(validate.checkstring(t7.getText())==false)
{
t1.setText("");
t1.requestFocus();
}
if(validate.checknum(t8.getText())==false)
{
t5.setText("");
t5.requestFocus();
}
else
{
str="insert into data1 values('"+t1.getText()+"','"+t2.getText()+"','"+ch.getSelectedItem().toString()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+ss+"','"+t8.getText()+"','"+t9.getText()+"','"+s1+"','"+s2+"','"+t10.getText()+"','"+t11.getText()+"','1')";
stmt.executeUpdate(str);
JOptionPane.showMessageDialog(this,"Record saved SuccessFully");
ch.setSelectedIndex(0);
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");
t10.setText("");
t11.setText("");
r7.setSelected(true);
r8.setSelected(true);
r9.setSelected(true);
}
}
catch(Exception e2)
{
System.out.println(e2);
}
}
if(e.getSource()==b5)  this.dispose();
if(e.getSource()==b3)
{
try
{
String str2="update data1 set Dept_Code='"+ch.getSelectedItem().toString()+"',Branch_Code='"+t3.getText()+"',Name='"+t4.getText()+"',Fname='"+t5.getText()+"',Mname='"+t6.getText()+"',Contact='"+t7.getText()+"',address='"+t8.getText()+"',hostel='"+s1+"',transport='"+s2+"',Total_Fee='"+t11.getText()+"'where Adm_No='"+str4+"'";
stmt.executeUpdate(str2);
JOptionPane.showMessageDialog(this,"Modification Succesful");
}
catch(Exception e4)
{
System.out.println(e4);
}
}

if(e.getSource()==b4)
{
try
{
str4=t12.getText();
String str5="select * from data1 where Adm_No='"+str4+"'";
ResultSet s5=stmt.executeQuery(str5);
if(s5.next())
{
t1.setText(s5.getString(1));
t2.setText(s5.getString(2));
ch.setSelectedItem(s5.getString(3));
t3.setText(s5.getString(4));
t4.setText(s5.getString(5));
t5.setText(s5.getString(6));
t6.setText(s5.getString(7));
t7.setText(s5.getString(8));
String ss=s5.getString(9);
if(ss.equals("male"))
r5.setSelected(true);
else
r6.setSelected(true);
t8.setText(s5.getString(10));
t9.setText(s5.getString(11));
String sq=s5.getString(12);
if(sq.equals("yes"))
r1.setSelected(true);
else
r2.setSelected(true);
String sq1=s5.getString(13);
if(sq1.equals("yes"))
r3.setSelected(true);
else
r4.setSelected(true);
t10.setText(s5.getString(14));
t11.setText(s5.getString(15));
}
else
JOptionPane.showMessageDialog(this,"No Record Found");
}
catch(Exception e3)
{}
}
}
}