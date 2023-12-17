import java.io.*;
public class pattern2 {
	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++) {
			char ch = 'E';
			
			for(int k=1; k<=i; k++) {
				System.out.print(" ");
			}
			
			for(int j=5; j>=i; j--) {
				System.out.print(ch + " " );
				
				ch--;
			}
			
		 
			
			System.out.println();
			
		}
	}

}
