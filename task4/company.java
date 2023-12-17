import java.io.*;
import java.util.*;

interface list1{

void getdetails();
}

interface list2{
void showdetails();
}

class emp implements list1, list2{
    public int empid;
    public String name;
    public char initial;
    public float salary;

public void getdetails(){

Scanner sc = new Scanner(System.in);
System.out.print("Enter ID: ");
 empid = sc.nextInt();
System.out.print("Enter Name: ");
sc.nextLine();
 name = sc.nextLine();
System.out.print("Enter Initial: ");
 initial = sc.next().charAt(0);
System.out.print("Enter Salary: ");
 salary = sc.nextFloat();
}

public void showdetails(){

System.out.println('\n'+"Employee ID:       " + empid +'\n'+ "Employee Name:     " + name +'\n'+ "Empyloyee initial: " + initial +'\n'+ "Employee salary:   " + salary);
}


}

class company{
public static void main(String[]args){

emp e1 = new emp();

e1.getdetails();
e1.showdetails();

}
}


