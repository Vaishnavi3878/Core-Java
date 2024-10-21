public class slip14_1
{
    int power(int x, int y)
    {
       if(y==0)
         return 1;
       else
          return x*power(x,y-1);
    }
    public static void main(String args[])
    {
       slip14_1 ob=new slip14_1();
       System.out.println("Base to Power:"+ob.power(2,5));
    }
}