import java.io.*;

class myclass1 extends Thread{

public void run(){

try{

   for(int i=1; i<=5; i++){

   System.out.println("Yogesh : " + i);
   Thread.sleep(1000);
}
}

catch(InterruptedException ex){
}

}
}

class myclass2 extends Thread{

public void run(){

try{

 for(int i=1; i<=5; i++){

  System.out.println("Vicky : " + i);
  Thread.sleep(1000);
}
}

catch(InterruptedException ex){
}

}
}


class nool{

public static void main(String[]args){

myclass1 m1 = new myclass1();
myclass2 m2 = new myclass2();

m1.start();
m2.start();

}
}