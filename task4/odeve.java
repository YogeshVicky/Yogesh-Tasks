import java.io.*;
import java.util.*;

class odeve{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");

int num = sc.nextInt();
int divi;

divi = num/2;

if(divi*2==num)
{
System.out.println("The given number is even");
}
else
{
System.out.println("The given number is odd");
}

}
}