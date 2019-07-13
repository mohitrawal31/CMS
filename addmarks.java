import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;
class addmarks extends JInternalFrame implements ActionListener,ItemListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JButton b1;
JComboBox cb1,cb2,cb3;
JScrollPane js,js1;
JTable jt,jt2;
Connection conn;
Statement stat;
//Object obj2[][];
addmarks()
{
super("add marks",true,true,true,true);
setSize(1000,500);
setLayout(null);
b1=new JButton("Save");
l1=new JLabel("Add Marks");
l2=new JLabel("Department");
l3=new JLabel("Semester");
l4=new JLabel("Type");
l5=new JLabel("");
l6=new JLabel("");
l7=new JLabel("");
l8=new JLabel("");
l1=new JLabel("ENTER MARKS");
cb1=new JComboBox(); 
cb2=new JComboBox(); 
cb3=new JComboBox(); 
b1.addActionListener(this);
cb1.addItem("Select");
cb1.addItem("CSE");
cb1.addItem("MECH");
cb1.addItem("CIVIL");
cb1.addItem("IT");
cb1.addItem("ECE");
cb2.addItem("Select");
cb2.addItem("1");
cb2.addItem("2");
cb2.addItem("3");
cb2.addItem("4");
cb2.addItem("5");
cb2.addItem("6");
cb2.addItem("7");
cb2.addItem("8");
cb3.addItem("Select");
cb3.addItem("ST1");
cb3.addItem("ST2");
cb3.addItem("ST3");
add(b1);
add(l1);
l1.setBounds(130,10,180,30);
add(l2);
l2.setBounds(50,50,80,20);
add(cb1);
cb1.setBounds(130,50,200,20);
add(l3);
l3.setBounds(50,80,80,20);
add(cb2);
cb2.setBounds(130,80,200,20);
add(l4);
l4.setBounds(50,110,80,20);
add(cb3);
cb3.setBounds(130,110,200,20);
add(l5);
l5.setBounds(50,150,80,20);
b1.setBounds(200,150,80,20);
cb2.addItemListener(this);

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
//new addmarks();
}
public void actionPerformed(ActionEvent e)
{

TableModel model=jt2.getModel();
try
{

for(int i=0;i<model.getRowCount();i++)
{
String sb1=model.getValueAt(i,0).toString();
String sb2=model.getValueAt(i,1).toString();
String sb3=jt.getValueAt(i,0).toString();
String sb4=model.getValueAt(i,2).toString();
String sb5=model.getValueAt(i,3).toString();
if(cb3.getSelectedIndex()>0)
{
String str3="select count(*) from marks1 where dept_code='"+cb1.getSelectedItem()+"' and sem='"+cb2.getSelectedItem()+"' and rollno='"+sb3+"'";
ResultSet rss=stat.executeQuery(str3);
int g=0;
if(rss.next())
g=rss.getInt(1);
if(g>0)
{
}
else
{
String ss="insert into marks1 values('"+cb1.getSelectedItem()+"',"+cb2.getSelectedItem()+",'"+sb3+"','"+col2[0]+"',"+sb1+",'"+col2[1]+"',"+sb2+",'"+col2[2]+"',"+sb4+",'"+col2[3]+"',"+sb5+",'"+cb3.getSelectedItem()+"')";
System.out.println(ss);
stat.executeUpdate(ss);
}
}
}
}
catch(NullPointerException e1)
{
JOptionPane.showMessageDialog(this,"Enter all records");
}

catch(Exception e1)
{
JOptionPane.showMessageDialog(this,e1);
}

}

String col2[]=new String[4];

public void itemStateChanged(ItemEvent ee)
{
if(ee.getSource()==cb2 && ee.getStateChange()==ItemEvent.SELECTED && cb1.getSelectedIndex()>0 && cb2.getSelectedIndex()>0 )
{
try 
{
int a=0;

String str="select count(*) from data1 where Dept_code='"+cb1.getSelectedItem()+"'";
ResultSet rs1=stat.executeQuery(str);
if(rs1.next())
a=rs1.getInt(1);


String str1="select Roll_no,Name from data1 where Dept_code='"+cb1.getSelectedItem()+"'";
String str2="select sub1,sub2,sub3,sub4 from subject where Dname='"+cb1.getSelectedItem()+"' and sem='"+cb2.getSelectedItem()+"'";
if(jt!=null && jt2!=null)
{
remove(js);
remove(js1);
repaint();
}
ResultSet rs2=stat.executeQuery(str1);

String col[]={"Roll No","Name"};
Object obj[][]=new Object[a][2];
Object obj2[][]=new Object[a][4];
int i=0;
while(rs2.next())
{
obj[i][0]=rs2.getString(1);
obj[i][1]=rs2.getString(2);
i++;
}

ResultSet rs3=stat.executeQuery(str2);
if(rs3.next())
{
col2[0]=rs3.getString(1);
col2[1]=rs3.getString(2);
col2[2]=rs3.getString(3);
col2[3]=rs3.getString(4);
}





String str4="select * from marks1 where dept_code='"+cb1.getSelectedItem()+"' and sem='"+cb2.getSelectedItem()+"'";
int j=0;
ResultSet rs4=stat.executeQuery(str4);
while(rs4.next())
{
obj2[j][0]=rs4.getString(5);
obj2[j][1]=rs4.getString(7);
obj2[j][2]=rs4.getString(9);
obj2[j][3]=rs4.getString(11);
j++;
}
/*
jt2=new JTable(obj2,col2);

js1=new JScrollPane(jt2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

add(js1);

*/



jt=new JTable(obj,col);
jt2=new JTable(obj2,col2);
js=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
js1=new JScrollPane(jt2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

add(js);
add(js1);
js.setBounds(80,200,400,200);
js1.setBounds(500,200,600,200);
}

catch(Exception eee)
{
System.out.println(eee);
}
}
}
}