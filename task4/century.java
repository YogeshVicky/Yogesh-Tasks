import java.io.*;
import java.util.*;

class century{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter the century year: ");
int year = sc.nextInt();

if(year%100!=0)
{
System.out.println("Not a Century Year");
}

if(year%100==0)
{
if(year%400==0)
{
 System.out.println("The given year is century leap year" + year);
}
else
{
 System.out.println("The given year is not a century leap year " + year);
}

}

}
}