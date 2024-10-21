import java.awt.*;
import java.awt.event.*;
class MouseDemo extends Frame implements MouseListener,MouseMotionListener
{
   TextField t1;
   MouseDemo()
   {
      setVisible(true);
      setSize(500,500);
      setLayout(new FlowLayout());
      t1=new TextField(30);
      add(t1);
      addMouseListener(this);
      addMouseMotionListener(this);
   }
   public void mouseClicked(MouseEvent me)
   {
      t1.setText("X position="+me.getX()+"Y position="+me.getY());
   }
   public void mouseEntered(MouseEvent me)
   {}
   public void mouseReleased(MouseEvent me)
   {}
   public void mouseExited(MouseEvent me)
   {}
   public void mousePressed(MouseEvent me)
   {}
   public void mouseMoved(MouseEvent me)
   {
      t1.setText("X position="+me.getX()+"Y position="+me.getY());
   }
   public static void main(String args[])
   {
      MouseDemo ob=new MouseDemo();
   }
}