import java.io.*;
public class pattern8 {
public static void main(String[] args) {
	char ch = 'A';
	
	for(int i=1; i<=5; i++) {
		for(int j=i; j<5; j++) {
			System.out.print(" ");
			
		}
		for(int k=1; k<=i; k++) {
			System.out.print(ch + " ");
			ch++;
			
		}
		
		System.out.println();
	}
}
}
