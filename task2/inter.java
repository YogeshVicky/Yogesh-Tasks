abstract class Face{
	abstract void eat ();
	
	public void love() {
		System.out.println("Hello");
	}
	
}

class test extends Face{
	public void eat() {
		System.out.println("hi");
	}
}
public class inter {

	public static void main(String[] args) {
		test t = new test();
		
		t.love();
		t.eat();
		
		int name=0, salary=0, empid=0;
		
		 String query = "update suther set name='" + name +"', salary= " + salary + "where empid="+ id + ";" ;
		 String query1 = "insert into employee values("+empid+",'"+name+"',"+salary+");" ;

	}

}
