import java.io.*;
import java.util.*;
public class Stringtochar {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String name = sc.nextLine();
		int count1=0, count2 = 0;
		
		char [] letters = name.toCharArray();
		
		for(int i=0; i<letters.length; i++)
		{
			if(letters[i]>='A' && letters[i]<='Z') {
				count1++;
			}
			else if(letters[i]>='a' && letters[i]<='z') {
				count2++;
			}
		}
		System.out.println("Number of Lowercase in the given sentence: " + count1);
		System.out.println("Number of Uppercase in the given sentence: " + count2);
			
	}
}
