import java.io.*;
import java.util.*;

class maxifloat{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
float num[] = new float[5];
int i;

for(i=0; i<5; i++)
{
System.out.print("Enter the number: ");
num[i] = sc.nextFloat();
}

float max = num[0];

for(i=0; i<5; i++)
{
if(max <num[i])
{
max=num[i];
}
}
System.out.println("The Highest number of the given float is: " + max);
}
}