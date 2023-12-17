import java.io.*;
import java.util.*;

class suther
{
   private int emp_id;
   private String emp_name;
   private float salary;
   
   public void givedetails()
   {
       Scanner sc = new Scanner(System.in);
       System.out.print('\n'+"Enter your Emp no: ");
       emp_id = sc.nextInt();
       System.out.print("Enter your name: ");
       sc.nextLine();
       emp_name = sc.nextLine();
       System.out.print("Enter your salary: ");
       salary = sc.nextFloat();
   }
   public void showdetails()
   {
       System.out.println('\n'+"Employee Id: "+ emp_id+ '\n'+"Employee Name: "+emp_name+'\n'+ "Your salary is: "+salary);
       
   }
}

class sutherland
{
    public static void main(String[]args)
    {
        suther s1 = new suther();
        suther s2 =new suther();
        suther s3 = new suther();
        
        s1.givedetails();
        s2.givedetails();
        
        s1.showdetails();
        s2.showdetails();
    }
}














