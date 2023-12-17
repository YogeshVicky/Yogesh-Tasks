import java.io.*;
import java.util.*;

class perfect{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int num = sc.nextInt();
int sum = 0;
int a=num;

for(int i = 1; i<a; i++)
{
if(num%i==0)
{
sum = sum+i;
}
}

if(sum==num)
{
System.out.println("Perfect");
}
else
{
System.out.println("Not Perfect");
}
}
}