 import java.io.*;
public class pattern9 {
public static void main(String[] args) {
	int count = 1;
	for(int i=1; i<5; i++ ) {
		
		for(int j=i; j<4; j++) {
			System.out.print(" ");
			}
		
		
		for(int k=1; k<5; k++) {
			System.out.print(count);
			count=count*100+1;
		break;
		}
		System.out.println();
	}

}
}
