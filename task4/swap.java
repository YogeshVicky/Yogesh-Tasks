import java.io.*;
import java.util.*;

class swap{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter value of a: ");
int a= sc.nextInt();
System.out.print("Enter value of b: ");
int b = sc.nextInt();

a= a-b;

b= a+b;

a=-(a-b);

System.out.println("a = " + a);
System.out.println("b= " + b);


}
}