import java.io.*;
public class upperandlower {
public static void main(String[] args) {
	
	String name1 = "yogesh";
	String name2 = "VICKY";
	
	String up = name1.toUpperCase();
	String lw = name2.toLowerCase();
	
	StringBuilder sb = new StringBuilder(up);
	sb.append(lw);
	int count = sb.length();
	
	System.out.println(sb);
	System.out.println("Length of the String is: " + count);
	
}
}
