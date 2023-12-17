import java.io.*;
import java.util.*;

class prno{

int  count =0;

public void divi(int num){

for(int i =1; i<=num; i++)
{
if(num%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println("Prime");
}
else
{
System.out.println("Not a Prime");
}
}
}

class primenum{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int num = sc.nextInt();

prno p1 = new prno();

p1.divi(num);


}
}