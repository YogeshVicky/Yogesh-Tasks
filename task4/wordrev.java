import java.io.*;
import java.util.*;

class wordrev{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the sentence: ");

String word = sc.nextLine();

String empty = "";

String temp [] = word.split(" ");

for(int i = temp.length-1; i>=0; i--)
{
 empty = empty + temp[i]+ " ";

}

System.out.println(empty);


}
}
