import java.io.*;

class armsno
{
public static void main(String []args)
{
int i,n,rem,sum=0;
System.out.println("**Armstrong Numbers**");


for(i=1000;i>=1;i--)
{
n=i;

while(n>0)
{
rem=n%10;               

sum=sum+(rem*rem*rem);

n=n/10;
}


if(sum==i)
{
System.out.println(i);
}
sum=0;
}
}
}