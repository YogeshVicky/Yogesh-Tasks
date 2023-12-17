import java.io.*;
import java.util.*;
public class removelement {               //Write a Java program to remove a specific element from an array.
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers");
	
	int[] arr = new int [5];
	
	
	
	for(int i=0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	
	System.out.println("Enter the number to remove");
	int num = sc.nextInt();
	
	for(int i=0; i<arr.length; i++) {
		
		
		 if(num!=arr[i]) {
			
			System.out.print(arr[i] + ", ");
}
        
}
	
	  
	

	
}
}














