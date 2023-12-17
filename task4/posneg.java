import java.io.*;
import java.util.*;

class posneg{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter the length: ");
int len = sc.nextInt();


int sum1=0, sum2=0;

int [] num = new int[len];

for(int i=0; i<len; i++){

System.out.println("Enter the number: ");

num[i] = sc.nextInt();

}


for(int i=0; i<len; i++){

if(num[i]>0)
{

sum1 = sum1+num[i];

}
else if(num[i]<0)
{

sum2= sum2+num[i];
}
}

System.out.println("The sum of positive numbers: " + sum1);
System.out.println("The sum of negative numbers: " + sum2);


}
}