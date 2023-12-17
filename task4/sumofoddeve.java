import java.io.*;
import java.util.*;

class sumofoddeve{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int num = sc.nextInt();

int sum1=0, sum2=0;

int [] arr = new int [num];

for (int i= 0; i<num; i++)
{
  System.out.println("Enter the number: ");
  arr[i] = sc.nextInt();
}

for(int i=0; i<num; i++)
{
if(arr[i]%2==0)
{
  sum1= sum1+arr[i];
}
else if(arr[i]%2!=0)
{
  sum2= sum2+arr[i];
}
}
System.out.println("The sum of even numbers: "+ sum1);
System.out.println("The sum of odd numbers: "+ sum2);

}
}