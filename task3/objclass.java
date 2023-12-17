package Task;
import java.util.*;

class magicshow{
	public int age;
	
    public void ticket(int a) {
    	
    	int age =a;
    	
		if(age>18) {
			System.out.println("Ticket Price is 500"+'\n');
		}
		else {
			System.out.println("Ticket price is 300"+'\n');
		}
		
		
	}
}

public class objclass {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter you age: " +'\n');
	int a = sc.nextInt();
	
	magicshow m1 = new magicshow();
     
	m1.ticket(a);
	
	System.out.println("If you want to book ticket select \'Yes\' or select \'No\' to close the page " );
	String decision = sc.next();
	
	if(decision.equalsIgnoreCase("Yes") ) {
	   
		System.out.println('\n' + "Ticket Booked successfully");
		System.out.println("Thank You");
	}
	else if(decision.equalsIgnoreCase("No")) {
		
		System.out.println('\n'+"Booking cancelled successfully");
		System.out.println("Thank You");
	}
	
	
}
}
