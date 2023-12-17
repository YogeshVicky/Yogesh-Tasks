import java.io.*;
import java.util.*;

class wordcount{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the sentence: ");

String name = sc.nextLine();



String word [] = name.split(" ");

System.out.println("Total number of words in the given sentence is: " + word.length);

}
}
