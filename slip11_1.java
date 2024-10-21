import java.io.*;
class Demo 
{
   public static void main(String args[])throws Exception
   {
      int a,b,n;
      System.out.println("1.Additon\n2.Substraction\n3.Multiplication\n4.Division\nEnter Your Choice:");
      DataInputStream dr = new DataInputStream(System.in);
      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
      System.out.print("Enter Your Choice : ");
      n=Integer.parseInt(dr.readLine());
      switch(n)
      {
          case 1:System.out.println(a+"+"+b+"="+(a+b));
                 break;
          case 2:System.out.println(a+"-"+b+"="+(a-b));
                 break;
          case 3:System.out.println(a+"*"+b+"="+(a*b));
                 break;
          case 4:System.out.println(a+"/"+b+"="+(a/b));
                 break;
      }
    }
}

