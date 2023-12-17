import java.io.*;
public class pattern6 {
public static void main(String[] args) {
	
	int count = 1;
	for(int i=1; i<5; i++) {
		
		for(int j=i; j<4; j++) {
			System.out.print(" ");
		}
		System.out.println(count*count);  //11*11 =121
		
		count = count*10+1;   //1*10+1 =11    11*10+1 =111 
		
		
	}
}
}
