import java.io.*;
import java.time.*;
public class dateandtime {
public static void main(String [] args) {
	LocalTime lt =LocalTime.now();
	System.out.println(lt);
	
	LocalDate ld = LocalDate.now();
	System.out.println(ld);
	
	LocalDateTime dt = LocalDateTime.now();
	System.out.println(dt);
	
	
}
}
