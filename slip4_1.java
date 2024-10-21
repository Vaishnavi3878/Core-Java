import java.util.*;
class Demo
{
   public static void main(String args[])
   {   
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any String:");
      String s1=sc.nextLine();
      System.out.println("Alternate Characters are:");
      for(int i=0;i<s1.length();i=i+2)
      {
         System.out.print(s1.charAt(i)+" ");
      }
   }
}