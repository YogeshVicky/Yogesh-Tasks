import java.io.*;
import java.util.*;
public class countchar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line: ");
		String line = sc.nextLine();
		int count1=0, count2 =0, count3 = 0, count4 = 0, count5=0;
		
		char [] letters = line.toCharArray();
		
		for(int i=0; i<letters.length; i++) {
			if(letters[i]>= 65 && letters[i]<=90) {
				count1++;
			}
			else if(letters[i]>= 97 && letters[i]<=122) {
				count2++;
			}
			else if(letters[i]>= 49 && letters[i]<=58) {
				count3++;
			}
			else if(letters[i]!= 32){
				count4++;
			}
			else {
				count5++;
			}
		}
		System.out.println("Number of Uppercase :"+ count1);
		System.out.println("Number of Lowercase: "+ count2);
		System.out.println("Number of integers: "+ count3);
		System.out.println("Number of Special Characters: "+ count4);
		System.out.println("Number of Spaces: "+ count5);
	}

}
