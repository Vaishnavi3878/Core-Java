import java.util.*;
class Demo
{
   static int temp;
   public static void main(String args[])
   {
      int n,d,s=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Number:");
      n=sc.nextInt();
      temp=n;
      while(temp>0)
      {
        d=temp%10;
        s=s+(d*d*d);
        temp=temp/10;
      }
      if(n==s)
      {
         System.out.println(n+" Is Armstrong Number:");
      }
      else
      {
         System.out.println(n+" Is Not Armstrong Number:");
      }
   }
}