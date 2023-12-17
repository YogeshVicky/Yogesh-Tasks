import java.io.*;
import java.util.*;

class power{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");

int num = sc.nextInt();

int value1 = (int) Math.sqrt(num);

if (num%value1 == 0)
{
System.out.println("The given number is power of 2");
}
else
{
System.out.println("The given number is not power of 2");
}

}
}