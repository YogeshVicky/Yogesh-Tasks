import java.io.*;
import java.util.*;

class amicable
{
 public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the 1st number: ");
   int a = sc.nextInt();
   System.out.print("Enter the 2nd number: ");
   int b = sc.nextInt();
  
   int i,count1=0, count2=0;

   for(i=1; i<a; i++)
   {
      
     if(a%i==0)
     
     {
        count1 =count1 + i;
      }
 
   }

   for(i=1; i<b; i++)

    {
       if(b%i==0)
       {
          count2 =count2 + i;
       }
    }
 
if (a==count2 && b==count1)
{
   System.out.println("The given number's are "+a + " & " +b+ " Amicable Number's");
}

else
{
   System.out.println("The given number's are not "+a + " & " +b+ " Amicable Number's");
}



}
}