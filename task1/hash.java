import java.io.*;
import java.util.*;
/*public class hash {
public static void main(String[]args) {            //array list - duplicate allowed - diff datatypes allowed
	
	ArrayList list = new ArrayList();
	
	list.add(558755);
	list.add('s');
	list.add("Yogesh");
	list.add( 889900.778);
	list.add(true);
	list.add(558755);
	
	list.remove("Yogesh");
	
	for(Object b : list ) {
		System.out.println(b);
	}
	
}
}*/

/*class hash{
	public static void main(String [] args) {
		List<Integer> list = new ArrayList<Integer>();   //List - duplicate allowed - diff datatypes not allowed
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		
		for(Object i : list) {
			System.out.println(i);
		}
}
}*/

/*class hash{
	public static void main(String [] args) {
		HashSet<Integer> hash = new HashSet<Integer>();   // Hashset  duplicate not allowed - diff datatypes not allowed-
		                                                      order will change (Ex: 20,10,30)
		
		hash.add(10);
		hash.add(20);
		hash.add(30);
		hash.add(10);
		hash.add(20);
		
		for(Object b : hash) {
			System.out.println("Hashset" + b);
		}
	
	}
}*/

/*class hash{
	public static void main (String[]args){
		TreeSet <Integer> tree = new TreeSet<Integer>();   // Treeset  duplicate not allowed - diff datatypes not allowed-
		                                                      order will not change (Ex: 10,20,30)
		
		tree.add(10);
		tree.add(20);
		tree.add(30);
		tree.add(10);
		tree.add(20);
		
		for(Object o: tree) {
			System.out.println("Hashtree" + o);
		}
		
		
		
	}
}*/

/*class hash {
	public static void main(String [] args) {
		HashMap <Character, String> list = new HashMap<Character, String>(); 
		
		list.put('S',"Yogesh");
		list.put('Y',"Viki");
		list.put('K',"SY");
		list.put('V',"Yogesh");
		
		for(Map.Entry x : list.entrySet()) {
			System.out.println(x.getKey()+". " + x.getValue());
		}
	}
}*/


class hash{
	public static void main(String [] args) {
		
		TreeMap <Float,Character> list = new TreeMap<Float,Character>();
		
		list.put(1.0f,'A');
		list.put(3.0f,'B');
		list.put(2.0f, 'C');
		
		list.remove(2.0f,'C');
		
		for(Map.Entry x : list.entrySet()) {
			System.out.println(x.getKey()+". "+ x.getValue());
		}
	}
}
















