import java.util.*;
class InvalidDataException extends Exception
{
   public String toString()
   {
      return "Invalid PAN Number or Mobile Number";
   }
}
class Demo
{
   public static void main(String args[])
   {
      try
      {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter PAN Number:");
         String pan=sc.next();
         int i;
         for(i=0;i<5;i++)
         {
            if(!Character.isUpperCase(pan.charAt(i)))
               throw new InvalidDataException();
         }
         for(i=5;i<9;i++)
         {
            if(!Character.isDigit(pan.charAt(i)))
               throw new InvalidDataException();
         }
         if(!Character.isUpperCase(pan.charAt(9)))
            throw new InvalidDataException();
         System.out.println("Enter Mobile Number:");
         String mob=sc.next();
         if(mob.length()!=10)
            throw new InvalidDataException();
         for(i=0;i<9;i++)
         {
            if(!Character.isDigit(mob.charAt(i)))
               throw new InvalidDataException();
         }
         System.out.println("PAN Number:"+pan);
         System.out.println("Mobile Number:"+mob);
       }
        catch(Exception e)
        {
           System.out.println("Error:"+e); 
        }
    }
}