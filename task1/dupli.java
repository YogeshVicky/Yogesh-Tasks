import java.io.*;
import java.util.*;

class dupli {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the name: ");

String name = sc.nextLine();
String result = ".";
int count;
int i,j; 

char [] ch = name.toCharArray();

System.out.println("Duplicate characters in the given string is: ");

for( i=0; i<ch.length; i++)
{
	count=0;
	
  for(j=i+1; j<ch.length; j++) 
  
  {
	  if(ch[i]==ch[j] && ch[i]!=' ') {   // e == e
		  count++;   //2
		  ch[j] =' ';   //e= ' '
 }


}
   if(count>0 && ch[i]!=' ') {
	  
	   result=ch[i]+","+result;
	   
   }
   
}
       System.out.println(result);   
}
}