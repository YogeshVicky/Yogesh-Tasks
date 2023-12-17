import java.io.*;
import java.util.*;

abstract class calculation{

public abstract void initial();

public abstract void  sum();

public abstract void  difference();

public abstract void  product();

public abstract void  division();


}

class rewrite extends calculation{

public int a, b, c;

public void initial(){

a=100;
b=20;
}
public void sum(){
c=a+b;
System.out.println("Sum of a and b is: " + c);
}
public void difference(){
c=a-b;
System.out.println("Difference of a and b is: " +c);
}
public void product(){
c=a*b;
System.out.println("Product of a and b is: " + c);
}
public void division(){
c=a/b;
System.out.println("Divition of a and b is: " + c);
}
}


class action {
public static void main(String[]args){

calculation c1 = new rewrite();

c1.initial();
c1.sum();
c1.difference();
c1.product();
c1.division();

}
}