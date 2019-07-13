import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.*;
class attendence extends JInternalFrame implements ActionListener,ItemListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JButton b1;
JCheckBox cb5,cb6;
JTextField tf1;
JComboBox cb1,cb2,cb3;
JScrollPane js;
JTable jt;
Date d=new Date();
SimpleDateFormat sd=new SimpleDateFormat("dd/MMM/YYYY");
Connection conn;
Statement stat;
attendence()
{
super("Attendence Page",true,true,true,true);
setSize(500,500);
setLayout(null);
b1=new JButton("Save");
l1=new JLabel("Attendence");
l2=new JLabel("Department");
l3=new JLabel("Semester");
l4=new JLabel("Subject");
l5=new JLabel("Date");
l6=new JLabel("");
l7=new JLabel("");
l8=new JLabel("");
l1=new JLabel(" Attendence");
cb5=new JCheckBox("P",true);
cb6=new JCheckBox("A",false);
cb1=new JComboBox(); 
cb2=new JComboBox();
cb3=new JComboBox();

tf1=new JTextField(20);
tf1.setText(sd.format(d));
  
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
add(b1);
add(l1);
add(cb5);
add(cb6);
l1.setBounds(130,10,180,30);
add(l2);
l2.setBounds(50,50,80,20);
add(cb1);
cb1.setBounds(130,50,200,20);
add(l3);
l3.setBounds(50,80,80,20);
add(cb2);
l4.setBounds(50,110,80,20);
l5.setBounds(50,140,80,20);
add(l4);
add(l5);
add(cb3);
add(tf1);
add(cb5);
add(cb6);
cb2.setBounds(130,80,200,20);
cb3.setBounds(130,110,200,20);
tf1.setBounds(130,140,200,20);
b1.setBounds(130,180,80,20);
cb2.addItemListener(this);
cb3.addItemListener(this);
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
setVisible(true);
}
public static void main(String st[])
{
//new attendence();
}

public void actionPerformed(ActionEvent e)
{
TableModel model=jt.getModel();
for(int i=0;i<model.getRowCount();i++)
{
String sb1=model.getValueAt(i,0).toString();
String sb2=model.getValueAt(i,1).toString();
try
{
if(cb3.getSelectedIndex()>0)
{
String ss="insert into attendence values('"+cb2.getSelectedItem()+"','"+sb1+"','"+cb3.getSelectedItem()+"','"+tf1.getText()+"',"+sb2+",'"+cb1.getSelectedItem()+"')";
stat.executeUpdate(ss);
}
}
catch(NullPointerException e2)
{
System.out.println(e2);
}
catch(Exception e1)
{
System.out.println(e1);
}
}
JOptionPane.showMessageDialog(this,"Data Saved");
}
public void itemStateChanged(ItemEvent ee)
{
try
{
if(ee.getSource()==cb2 && ee.getStateChange()==ItemEvent.SELECTED)
{
if(cb2.getSelectedIndex()>0)
{
String str="select sub1,sub2,sub3,sub4 from subject where dname='"+cb1.getSelectedItem()+"' and sem='"+cb2.getSelectedItem()+"'";
ResultSet rs = stat.executeQuery(str);
cb3.removeAllItems();
cb3.addItem("Select");
while(rs.next())
{
cb3.addItem(rs.getString(1));
cb3.addItem(rs.getString(2));
cb3.addItem(rs.getString(3));
cb3.addItem(rs.getString(4));
}
}
}


if(ee.getSource()==cb3 && ee.getStateChange()==ItemEvent.SELECTED)
{
if(cb1.getSelectedIndex()>0 && cb2.getSelectedIndex()>0 && cb3.getSelectedIndex()>0 )
{
int a=0;

String str="select count(*) from data1 where Dept_code='"+cb1.getSelectedItem()+"'";
ResultSet rs1=stat.executeQuery(str);
if(rs1.next())
a=rs1.getInt(1);


String str1="select Roll_no from data1 where Dept_code='"+cb1.getSelectedItem()+"'";
String str2="select sub1,sub2,sub3,sub4 from subject where Dname='"+cb1.getSelectedItem()+"' and sem='"+cb2.getSelectedItem()+"'";
if(jt!=null)
{
remove(js);
repaint();
}
ResultSet rs2=stat.executeQuery(str1);

String col[]={"Roll No","Attendence"};
Object obj[][]=new Object[a][2];
int i=0;
while(rs2.next())
{
obj[i][0]=rs2.getString(1);
obj[i][1]=true;
i++;
}
DefaultTableModel model1=new DefaultTableModel(obj,col);
jt=new JTable(model1)
{
public Class getColumnClass(int column)
{
switch(column)
{
case 0: return String.class;
default: return Boolean.class;
}
}
public boolean isCellEditable(int row,int col1)
{
if(col1==0)
return false;
else
return true;
}
};

js=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
add(js);
js.setBounds(80,230,400,200);
}
}
}
catch(Exception mn)
{
System.out.println(mn);
}
}
}
