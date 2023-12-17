import java.io.*;
import java.util.*;


class ams
{
 public static void main(String [] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the number: ");
   
   int num = sc.nextInt();
   int count=0;
   int rest = 0;
   for(int a=num; a>0; count++)       
   {
       a=a/10;
   }
   for(int a=num; a>0; a=a/10)
       
   {   
       int remain = a%10;
       rest+= Math.pow(remain,count);
   }
  if(rest==num)
  {
      System.out.println("Amstrong num");
  }
  else{
      System.out.println("not a Amstrong num");
  }
    System.out.println("restult " + rest+ " Number "+ num);
}
  
}