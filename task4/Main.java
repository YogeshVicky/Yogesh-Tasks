import java.io.*;
import java.util.*;

class Main{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number");

int num = sc.nextInt();

 int i=0,a=0, b=0, c=1;

while(i<=num)
{

a=b;     
b=c;    //0  1

c=a+b;  //1

System.out.print(a + " ");

i++;
}



}

}