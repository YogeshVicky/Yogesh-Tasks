import java.io.*;
import java.util.*;

class sqrtofany{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int num = sc.nextInt();
float i;

for(i=0.00000f; i*i<num; i+=0.00001);

System.out.println("The square of the " + num + " is: " + i);


}
}