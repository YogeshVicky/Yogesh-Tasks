class A{
	public void m1() {
		System.out.println(1111);
	}
}

class B extends A{
	void m1() {
		System.out.println(2222);
	}
}
public class aptitude {
	public static void main (String [] args) {
		/*String [][] argcopy = new String[2][2];
		int x;
		
		argcopy[0]=args;
		
		x=argcopy[0].length;
		for(int y=0; y<x; y++) {
			System.out.print(" " + argcopy[0][y]); 
		}*/
		
		B bb = new B();
		bb.m1();
		
				
	}

}
