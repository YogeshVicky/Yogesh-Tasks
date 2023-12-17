/*
 * import java.io.*; public class practice { public static void main(String
 * []args) { String name = "Yogesh Vicky logi"; char ch;
 * 
 * //char [] arr = name.toCharArray();
 * 
 * for(int i=0; i<name.length(); i++) {
 * 
 * ch = name.charAt(i);
 * 
 * System.out.println(ch);
 * 
 * 
 * }
 * 
 * } }
 */
  
 

/*
 * import java.io.*;
 * 
 * class practice {
 * 
 * public static void main(String []args) {
 * 
 * String name="abUdeAngJunfTklMN";
 * 
 * int count=0;
 * 
 * char []letters=name.toCharArray();
 * 
 * for(int i=0; i<letters.length;i++) {
 * 
 * if( letters[i] >='\u0041' && letters[i]<='\u005A') { count++; }
 * 
 * }
 * 
 * System.out.println(" no of Uppercase letters " + count);
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * }
 */

import java.io.*;
import java.util.*;

class practice

{
public static void main(String []args)
{

Scanner s=new Scanner(System.in);

System.out.println("enter the starting index for substring ");

int startindex=s.nextInt();

System.out.println("enter no of letters to be fetch");

int noofletters=s.nextInt();

System.out.println("enter a name");

String name1=s.next();

char []letters = name1.toCharArray();

int count=letters.length;

String result="";

for(int i=1; i<=noofletters;i++)
{

result=result+letters[startindex];
startindex++;

}

System.out.println( " original string: "+name1+" start index: " + startindex+" no of letters : "+noofletters+" substring : " +result);





}



}




















