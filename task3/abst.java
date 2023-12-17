abstract class parent {
	public abstract void debt();
	public abstract void marriage();
	
}

class child extends parent{
	
	public void debt() {
		System.out.println("Debt");
	}
	public void marriage() {
		System.out.println("Marriage");
	}
	public void play() {
		System.out.println("play");
	}
	public void grow() {
		System.out.println("grow");
	}
}

class child2 extends parent{
	
	void dis() {
		System.out.println("child2");
	}
	
	public void debt() {
		System.out.println("Debt");
	}
	public void marriage() {
		System.out.println("Marriage");
	}
	
}

public class abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child2 c = new child2();
     child c2 = new child();
     
     c.debt();
     c.marriage();
     c2.play();
     c2.grow();
     c.dis();
	}

}
