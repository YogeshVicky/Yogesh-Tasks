import java.io.*;
public class pattern11{
	public static void main(String[]args) {
		for(int i=0; i<4; i++) {
			int ch =65;
			for(int j=3; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print((char) (ch + k)); // 66
			}
				for(int l=i-1; l>=0; l--) {
					System.out.print((char) (ch+l));
				
			}
			System.out.println();	
		}
		
	}
}
