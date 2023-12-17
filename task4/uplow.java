import java.io.*;
import java.util.*;

class uplow{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the name: ");
String name = sc.next();
int upper =0;
int lower = 0;

for(int i=0; i<name.length(); i++)
{
char ch = name.charAt(i);

if(ch>='A' && ch<='Z')
{
 upper++;
}
if(ch>='a' && ch<='z')
{
lower++;
}
}

System.out.println("Number of Uppercases: "+ upper);
System.out.println("Number of Lowercases: " +lower);
}
}