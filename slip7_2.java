import java.util.*;
class CricketPlayer
{
   int pid,totalRuns,inningsPlayed,notOuttimes;
   String pname;
   float avg;
   void accept()
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Player ID:");
      pid=sc.nextInt();
      System.out.print("Enter Player Name:");
      pname=sc.next();
      System.out.print("Enter Player Total Runs:");
      totalRuns=sc.nextInt();
      System.out.print("Enter Player Innings:");
      inningsPlayed=sc.nextInt();
      System.out.print("Enter Player Not Out Times:");
      notOuttimes=sc.nextInt();
      System.out.println();
      avg=totalRuns/(inningsPlayed-notOuttimes);
   }
   void display()
   {
      System.out.println("Player ID:"+pid);
      System.out.println("Player Name:"+pname);
      System.out.println("Player Total Runs:"+totalRuns);
      System.out.println("Player Innings:"+inningsPlayed);
      System.out.println("Player Not Out Times:"+notOuttimes);
      System.out.println("Player Average:"+avg);
   }
   public static void main(String args[])
   {
      float max;
      int index;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter how many Players:");
      int n=sc.nextInt();
      CricketPlayer ob[]=new CricketPlayer[n];
      for(int i=0;i<n;i++)
      {
         ob[i]=new CricketPlayer();
         ob[i].accept();
      }
      max=ob[0].avg;
      index=0;
      for(int i=1;i<n;i++)
      {
         if(max<ob[i].avg)
         {
            max=ob[i].avg;
            index=1;
         }
       }
       ob[index].display();
   }
}
      