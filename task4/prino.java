import java.io.*;


class prino
{
public static void main(String[]args)
{
int j, i, count=0, val=0;
    
    

for(j=1000; j>=1; j--)
{            
count=0;

for(i=1; i<=j; i++)  
{

if(j%i==0)
{
count++;
}

}

if(count==2)
{
val=val+1;
  System.out.println(j);
}
  
}
 System.out.println("Total number of prime number between 1 to 1000 in reverse " + '\n'+ val);

}
}