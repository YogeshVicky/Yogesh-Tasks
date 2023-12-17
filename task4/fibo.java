import java.io.*;
import java.util.*;

class fibo
{
  public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the number: ");
   int num = sc.nextInt();
  
   int i=1, a=0, b=0, c=1;

   while(i<=num)
  {
    a=b;                  
    b=c;                  
    c=a+b;                
    
    System.out.print(a+" "); 

    i++; 
  }
 
}
}