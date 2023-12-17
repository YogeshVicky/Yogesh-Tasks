import java.io.*;
import java.util.*;

class vowels{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the name: ");
String name= sc.nextLine();

name = name.replace("a", "").replace("A", "");
name = name.replace("e", "").replace("E", "");
name = name.replace("i", "").replace("I", "");
name = name.replace("o", "").replace("O", "");
name = name.replace("u", "").replace("U", "");

System.out.println(name);

}
}