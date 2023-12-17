
class paramet{
	public String name;

	public void noret() {
		
		this.name = "";
		
	}
	
}

class para extends paramet{
	
public String replace (String a, String b){
	
	this.name="Yogesh";
	
String rep = name.replace(a,"").replace(b, "h Vicky");
		
		return rep;
	}	
}


public class string {                                      //Create a method to replace a character in a given string. 
	                                                       //Eg. replace(index, val) you have to pass 2 parameters. 
public static void main(String[] args) {
	
	para p = new para();
	paramet p1 = new paramet();
	

	String a = "";
	String b = "h";
	
	String result = p.replace(a,b);
	
	System.out.println(result);
}
}
