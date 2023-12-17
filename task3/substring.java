import java.io.*;

import java.util.*;

class substring
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

for(int i=startindex; i<=noofletters;i++)
{

result=result+letters[i];
startindex++;

}

System.out.println( " original string: "+name1+" start index: " + startindex+" no of letters : "+noofletters+" substring : " +result);





}



}


