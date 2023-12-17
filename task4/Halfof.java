import java.io.*;
import java.util.*;

class Half
{
  public float hal(int num)
{
   float result = (float)1/2*(float)num + num;
   return result;
}
}

class Halfof
{
  public static void main(String[]args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number: ");
  int num = sc.nextInt();
  
  Half h1 = new Half();
  float result1 = h1.hal(num);

 System.out.println("Result is: " + result1);
  
  
}
}