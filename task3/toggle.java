import java.io.*;
import java.util.*;
public class toggle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String line = sc.nextLine();
		String result = " ";
		
		char [] letters = line.toCharArray();
		
		for(int i=0; i<letters.length; i++) {
			
			if(letters[i]>= 65 && letters[i]<= 90) {
				
				result = result + (char)(letters[i]+32);
			}
			else if(letters[i]>=97 && letters[i]<=122) {
				
				result = result + (char)(letters[i]-32);
			}
			else if(letters[i]==32) {
				result = result + letters[i];
			}
		}
		System.out.println("Toggle of the given sentence: "+ result + " ");
	}

}
