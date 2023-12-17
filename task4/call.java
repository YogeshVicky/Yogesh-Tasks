import java.io.*;
 
class constructor{

   private int a, b, c;

public constructor()
{
  a=100;
  b=200;
}

public void product()
{
   c = a*b;
   System.out.println("The product of a*b is = " + c);
  
}
}

class call{
public static void main(String[]args){

    constructor c1 = new constructor();
    c1.product();
}
}