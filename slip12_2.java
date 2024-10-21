import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
   Label l1,l2,l3;
   TextField t1;
   List lst1;
   Button b1;
   Demo()
   {
      setVisible(true);
      setSize(500,400);
      setLayout(new FlowLayout());
      l1=new Label("Multiplication Table");
      l2=new Label("Enter Number");
      l1=new Label("Result");
      t1=new TextField(10);
      lst1=new List(10);
      b1=new Button("Calculate");
      add(l1);
      add(l2);
      add(l3);
      add(t1);
      add(b1);
      b1.addActionListener(this);
   }
   public void actionPerformed(ActionEvent ae)
   {
      if(ae.getSource()==b1)
      {
         String num=t1.getText();
         int n=Integer.parseInt(num);
         for(int i=1;i<=10;i++)
         {
            lst1.add(n+"x"+i+"="+n*i);
         }
      }
   }
   public static void main(String args[])
   {
      Demo ob=new Demo();
   }
}
      