import java.io.*;


class revs{
public static void main(String[]args){

String name = "YOGESH";
String dup = "";
String n = name;

for(int i=n.length()-1; i>=0; i--)
{
 dup = dup + n.charAt(i);
}
System.out.println(dup);
}
}