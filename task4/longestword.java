import java.io.*;
import java.util.*;

class longestword{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the sentence: ");

String sent = sc.nextLine();

String word [] = sent.split(" ");

String max = word[0];

int i=1;

while(i<word.length)
{
if(word[0].length()< word[i].length())
{
max = word[i];
}
i++;
}

System.out.println("\""+max+"\""+ " is the longest word in the given sentence with the characters of " + "\""+max.length()+"\"");

}
}