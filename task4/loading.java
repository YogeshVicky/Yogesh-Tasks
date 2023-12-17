import java.io.*;

class load{
 private float a, b, c;
 private int a1, b1, c1;

public load(float x, float y){

   a=x;
   b=y;
}

public load(int x1, int y1){
    
    
    a1=x1;
    b1=y1;
    
}

public void division(){

   c=a/b;
   
   System.out.println("The result is = "+ c);
   

}
public void division1(){
    c1=a1/b1;
    System.out.println("The result is = "+ c1);
}
}

class loading{

  public static void main(String[]args){

   load l1 = new load(1000f, 300f);
   load l2 = new load(16,8);
   
    l1.division();
    l2.division1();
}
}