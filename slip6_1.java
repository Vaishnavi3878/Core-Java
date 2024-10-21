import java .io.*;
import java.util.*;
class ZeroNumberException extends Exception
{
   public String toString()
   {
      return "Number is Zero";
   }
}
class Demo
{
   public static void main(String args[])
   {
      try
      {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter any Number:");
         int n=sc.nextInt();
         if(n==0)
         {
            throw new ZeroNumberException();
         }
         int last=n%10;
         int first=0;
         while(n>0)
         {
            first=n%10;
            n=n/10;
         }
         System.out.println("Sum of first and last digit of number is:"+(first+last));
      }catch(Exception e)
       {
          System.out.println("Error:"+e);
       }
    }
}