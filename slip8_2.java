import java.io.*;
class Demo
{
   public static void main(String args[])throws Exception
   {
      File f1=new File("c:\\users\\vaishanavi\\appData\\local\\programs\\python\\python312");
      if(f1.isDirectory())
      {
         String s1[]=f1.list();
         for(int i=0;i<s1.length;i++)
         {
            String fname=s1[i];
            if(fname.endsWith(".txt"))
               System.out.println(s1[i]);
         }
      }
   }
}
            