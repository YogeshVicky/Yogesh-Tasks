class student <t>{
	public t rollno;
	
	
	public student (t rno) {
		this.rollno = rno;
	}
	
	public t getroll() {
		
		return this.rollno;
	}
}





public class generics {
public static void main(String [] args) {
	student<Integer> s1 = new student<Integer>(100);
	
	int a = s1.getroll();
	
	System.out.println(a);
}
}
