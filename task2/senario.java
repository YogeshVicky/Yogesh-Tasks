import java.util.*;
public class senario {
public static void main(String[]args) {

Scanner sc = new Scanner(System.in);
System.out.println("Type the sentence: ");
String name = sc.nextLine();
String res =" ";

String [] sent = name.split(" ");

for(int i=0; i<sent.length; i++) {
	
	if(sent[i].equalsIgnoreCase("a") && sent[i].equalsIgnoreCase("z"))	{
		
		char [] letter = sent[i].toCharArray();
		
		if(letter[i]==letter[0]) {
			char up = Character.toUpperCase(letter[i]);
			res=res+up;
		}
			
		}
	
}

	



	
}
}