import java.io.*;

class parent{
public int a, b, c;

public void initial(){
  a=100;
  b= 11;
}
}

class child1 extends parent{

public void addition(){
 c= a+b;
System.out.println("Sum of a and b is = " + c);

}
}

class child2 extends child1{
public void sub(){
 c=a-b;
System.out.println("Subtraction of a and b is = " + c);

}
}

class child3 extends child2{
public void product(){
c=a*b;
System.out.println("Product of a and b is = " + c);
}
}

class child4 extends child3{
public void divi(){

c = a/b;

System.out.println("Divition of a and b is = " +c);
}
}

class head{
public static void main(String[]args){


child4 c4 = new child4();

c4.initial();
c4.addition();
c4.sub();
c4.product();
c4.divi();

}
}














