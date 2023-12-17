import java.io.*;                      //Write a Java program to find the index of an array element.
import java.util.*;
public class arrayindex {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	
	int [] arr = new int[5];
	
	for(int i=0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	
	System.out.println("Enter the number to find the index");
	int num = sc.nextInt();
	
	for(int i=0; i<arr.length; i++) {
		
		
		if(num==arr[i]) {
			
			System.out.println("Index of "+ '\''+num +'\'' + " is " + '\''+i+'\'');
		}
	}
}
}
