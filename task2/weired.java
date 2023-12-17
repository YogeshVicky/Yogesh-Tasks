import java.util.*;
public class weired {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = sc.nextInt();
	
	if(num%2!=0 || num%2==0 && (num>=6 && num<=20)){	
			
		System.out.println("Weird");
	
		}
	
	else {
		System.out.println("Not Weird");
	}
}
}
