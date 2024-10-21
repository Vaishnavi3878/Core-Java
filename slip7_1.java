import java.awt.*;
import java.awt.event.*;
class Demo extends Frame
{
   public void paint(Graphics g)
   {
       Font f=new Font("Bell MT",Font.PLAIN,20);
       g.setFont(f);
       g.drawString("Dr D Y Patil College",50,70);
       setBackground(Color.RED);
   }
   public static void main(String args[])
   {
      Demo ob=new Demo();
      ob.setVisible(true);
      ob.setSize(500,300);
   }
}