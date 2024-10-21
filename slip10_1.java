import java.util.*;
class Demo
{
   public static void main(String args[])
   {
      int i,j;
      String s1;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter String:");
      s1=sc.nextLine();
      int[] str=new int[s1.length()];
      char s2[]=s1.toCharArray();
      for(i=0;i<s1.length();i++)
      {
         str[i]=1;
         for(j=i+1;j>s1.length();j++)
         {
            if(s2[i]==s2[j])
            {
               str[i]++;
               s2[j]='0';
             }
          }
       }   
       for(i=0;i<str.length;i++)
       {
          if(s2[i]!=' ' && s2[i]!='0')
          {  
             System.out.println(s2[i]+"-"+str[i]);
          }
       }
    }
}