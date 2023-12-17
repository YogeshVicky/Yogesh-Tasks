import java.io.*;
import java.util.*;

class agustic{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();

int sum1=0, sum2=0, sum3=0;
int temp1, temp2, temp3;
int rem1, rem2, rem3;
int val1=0, val2=0, val3=0, valn=0;

temp1 = n;

while(temp1>100){
rem1 = temp1%100;
sum1 = sum1+rem1;
temp1= temp1/100;

}
val1 = sum1+temp1;
System.out.println("1 + 23 = " + val1);

temp2=n;

while(temp2>100){
rem2=temp2%10;
sum2=sum2+rem2;
temp2 = temp2/10;

}
val2 = sum2+temp2;
System.out.println("12 + 3 = " + val2);

temp3 = n;

while(temp3>0){
rem3 = temp3%10;
sum3 = sum3+rem3;
temp3=temp3/10;

}
val3 = sum3;
System.out.println("1+2+3  = " + val3);
System.out.println(n);

valn = val1+val2+val3+n;

System.out.println("The Agustic value of the given number " +"\""+n+"\"" + " is "+ val1+" + "+val2+" + "+val3+" + "+n+" = "+ "\""+valn+"\"");

}
}










