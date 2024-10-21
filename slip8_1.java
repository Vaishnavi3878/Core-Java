import java.util.*;
interface Shape
{
   final float pi=3.14F;
   float area();
}
class Circle implements Shape
{
   float radius;
   Circle(float r)
   {
      radius=r;
   }
   public float area()
   {
      return pi*radius*radius;
   }
}
class Sphere implements Shape
{
   float radius;
   Sphere(float r)
   {
      radius=r;
   }
   public float area()
   {
      return 4*pi*radius*radius;
   }
}
class Demo
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the Radius:");
      float r=sc.nextFloat();
      Circle ob1=new Circle(r);
      System.out.println("Area of Circle:"+ob1.area());
      Sphere ob2=new Sphere(r);
      System.out.println("Area of Sphere:"+ob2.area());
   }
}
