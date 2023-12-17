import java.io.*;
public class split {
public static void main(String[] args) {
	String name = "Yogesh Vicky Kumar Yovi";
	
	String [] spl = name.split(" ");
	
	for(int i=0; i<spl.length; i++)
	{
		System.out.println(spl[i]);
	}
	
	
}
}
