/*Write a Java program that repeatedly asks the user for a password 
until the correct password is entered. The correct password is "Java2023".*/

package Task;   
import java.io.*;
import java.util.*;

public class task1{
	public static void main(String [] args) throws MyException {
		boolean password = false;
		while(!password){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the password: ");
			String pass = sc.next();
			
			if(pass.equals("Java2023")) {
				System.out.println("Correct Password");
				password = true;
			}
			else {
				MyException ex = new MyException("Enter the valid password");
				
				throw ex;
				
			}
			
		}
		
		catch(MyException ex) {
			 System.out.println(ex.getMessage());
		}
		
		}
}
}

class MyException extends Exception{
	

public  MyException( String pass) {
	// TODO Auto-generated method stub
	super(pass);
	

}
}




