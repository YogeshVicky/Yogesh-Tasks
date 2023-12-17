import java.io.*;
import java.util.*;

class leap_count{
public static void main(String []args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the year from: "+ '\n');
int a = sc.nextInt();

System.out.println('\n'+"Enter the year to: "+'\n');
int b = sc.nextInt();

int i;
int c=1;


  System.out.println('\n'+"The number of Leap Year's between "+ "\""+ a +"\"" + " and " +"\""+ b +"\"" + " is" +"."+ '\n');

  for(i=a;i<=b;i++)
{

  if((i%400==0) || (i%4==0) && (i%100 !=0))

{
  System.out.println(c+ ". "+i);
c++;
}
 
}

System.out.println('\n' + "Total number of Leap Year's between " +"\""+ a +"\"" + " and "+"\"" + b +"\""+ " is " +"\""+
(c=c-1)+"\""+".");

}
}