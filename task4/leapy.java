import java.io.*;
import java.util.*;
class leapy{
public static void main(String[]args){
Scanner l = new Scanner(System.in);
System.out.println("Enter the year");
int a = l.nextInt();

if (a%100==0)
{
if (a%400==0)
{
System.out.println(a+"is a leap year");
}
else
{
System.out.println(a+"is not a leap year");
}
}
else
{
if (a%4==0)
{
System.out.println(a+"is a leap year");
}
else
{
System.out.println(a + "is not a leap year");
}

}


}
}