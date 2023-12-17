import java.io.*;
public class removespace {
	public static void main(String [] args) {
    String name = "Yogesh Vicky Yovi";
    String space ="";
    
    for(int i=0; i<name.length(); i++) {
    	if(name.charAt(i)!=' ') {
    		
    		space = space+name.charAt(i);
    	}
    	
    	
    }
    System.out.println(space);
 }
}
