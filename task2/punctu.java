
public class punctu {

	  static public void main(String[] args) {
		String name ="Hello! welcome%";
		
		char [] let = name.toCharArray();
		int count=0;
		
		
		  for(int i=0; i<let.length; i++) { 
			  if(let[i]>'a' || let[i]<'z' || let[i]>'A' || let[i]<'Z') {
		  
		  count++; } }
		 
		 System.out.println(count); 
	}

}
