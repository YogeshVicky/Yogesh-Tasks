import java.io.*;
import java.time.*;
import java.time.format.*;

public class format {
public static void main(String[] args) {
	LocalDateTime dt = LocalDateTime.now();
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE yyyy-MMMM-dd hh:mm:ss");
	
	String result = dt.format(dtf);
	
	System.out.println(result);
	
}
}
