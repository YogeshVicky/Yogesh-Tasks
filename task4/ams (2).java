import java.io.*;
import java.util.*;

class ams
{
 public static void main(String [] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the number: ");
   
   int num = sc.nextInt();
  
  int a, b=0, strn=num;

 while(num>0)
 {
  a = num%10;

  b= b + (a*a*a);

  num=num/10;

  }

 if(strn==b)

  {
     System.out.println("Amstrong number");
  }

  else
  {
   System.out.println("Not a Amstrong number");
  }
 System.out.println(b);
}

}