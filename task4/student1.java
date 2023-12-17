import java.io.*;   // No para, no return //

class student1
{
  public void addition ()
  {
    int a=100, b=200;
    int c = a + b;
    System.out.println("Result "+ c);
      
  }

}

class sample1
{
    public static void main(String []args)
    {
        student1 st = new student1();
        
        st.addition();
        
    }
}