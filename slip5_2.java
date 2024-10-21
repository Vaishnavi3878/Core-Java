import java.io.*;
class Demo
{
   public static void main(String args[])throws Exception
   {
      for(int i=0;i<args.length;i++)
      {
         File f1=new File(args[i]);
         if(f1.isFile())
         {
            String name=f1.getName();
            if(name.endsWith(".txt"))
            {
               f1.delete();
               System.out.println("File is deleted "+f1);
            }
            else
            {
               System.out.println("File Name:"+name+"\nFile Location:"+f1.getAbsolutePath()+"\nFile Size:"+f1.length()+"bytes");
            }
         }
         else
         {
            System.out.println(args[i]+"is not a file");
         }
      }
   }
}