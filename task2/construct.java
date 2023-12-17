import java.util.*;

public class construct {

	public static void main(String[] args) {
		 
	  ArrayList al = new ArrayList();
		
	  al.add("E");
	  al.add("D");
	  al.add("C");
	  al.add("B");
	  al.add("A");
	  
	  System.out.println(al);
	  
	  Collections.sort(al);
	  System.out.println(al);
	  System.out.println(Collections.binarySearch(al,"A"));
	  
	 
	}

}
