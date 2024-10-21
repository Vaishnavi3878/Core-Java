import java.io.*;
class Demo
{
   public static void main(String args[]) throws IOException
   {
      char ch;
      FileReader f1=new FileReader("a.txt");
      FileWriter f2=new FileWriter("b.txt");
      int c;
      while((c=f1.read())!=-1)
      {
         ch=(char)c;
         if(Character.isDigit(ch)==false)
         {
            f2.write(c);
         }
      }
      f1.close();
      f2.close();
   }
}
