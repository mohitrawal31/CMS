import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class president extends JInternalFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
JButton b1;
president()
{
super("President",true,true,true,true);
setSize(1100,600);
setTitle("Contact Us");
setLayout(null);
l1=new JLabel("World class infrastructure and well qualified faculty coupled with a devoted student community makes CGC, a hallowed place for");
l5=new JLabel("professional education. Located in the vicinity of the City  New Delhi, My College offers an inspiring atmosphere for professional education");
l6=new JLabel("knowledge expansion, and planning career achievement."); 
l7=new JLabel("The My College students are not only known for academic brilliance, but are also taught to make meaningful contribution to the society as responsible");
l8=new JLabel("citizens. Our alumni have earned a name for themselves by scripting spectacular success stories in various walks of life. We constantly endeavor to");
l9=new JLabel("infuse the same winning spirit in all our students. ");
l10=new JLabel("A mention must be made of our placement cell that leaves no stone unturned to ensure that topmost companies visit us year after year."); 
l11=new JLabel("These companies hire hundreds of students from My College campuses. A high success rate in placements propels us onward to make more earnest efforts to");
l12=new JLabel("ensure still better placements for our students. ");
l13=new JLabel("I welcome the young students to the family of My College. I sincerely hope that you will have a satisfying and fulfilling learning experience with us. " );
l2=new JLabel("Dr.Voldemort" );
l3=new JLabel("President" );
l4=new JLabel("My College" );
b1=new JButton("ok");

l1.setBounds(40,20,1100,150);
l5.setBounds(40,40,1100,150);
l6.setBounds(40,60,1100,150);
l7.setBounds(40,80,1100,150);
l8.setBounds(40,100,1100,150);
l9.setBounds(40,120,1100,150);
l10.setBounds(40,140,1100,150);
l11.setBounds(40,160,1100,150);
l12.setBounds(40,180,1100,150);
l13.setBounds(40,200,1100,150);
l2.setBounds(40,300,1100,70);
l3.setBounds(40,320,1100,70);
l4.setBounds(40,340,1100,70);
b1.setBounds(70,400,50,30);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(l11);
add(l12);
add(l13);
add(b1);
b1.addActionListener(this);
setVisible(true);
}
public static void main(String a[])
{
//new president();
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
this.dispose();
}
}
}