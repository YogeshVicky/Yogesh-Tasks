import java.io.*;
import java.util.*;

class factorial
{
public static void main(String[]args)
{
  Scanner s1 = new Scanner(System.in);
  int n, i, fact=1;
  System.out.print("Enter the number: ");
  n= s1.nextInt();
  
  for(i=1; i<=n; i++)
{
    fact = fact*i;
}

   System.out.println("The factorial of " + n+ " is = "+ fact);
}
}