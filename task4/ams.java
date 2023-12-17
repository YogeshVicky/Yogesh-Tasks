import java.io.*;
import java.util.*;


class ams
{
 public static void main(String [] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the number: ");
   
   int num = sc.nextInt();
   int a;
   int count=0;
   int rest = 0;
   for(a=num; a>0; count++)       
   {
       a=a/10;                         
   }
    int b=num;
       
       while(b>0)         
       
   {   
       int remain = b%10;  
       
       rest+= Math.pow(remain,count);  
       
       b=b/10;
       
   }

  if(rest==num)
  {
      System.out.println("Amstrong num");
  }
  else{
      System.out.println("not a Amstrong num");
  }
    System.out.println("Restult " + rest+ " Number "+ num);
}
  
}