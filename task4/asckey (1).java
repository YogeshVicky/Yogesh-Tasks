import java.io.*;
import java.util.*;

class asckey{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Character: ");
        
        char ch =sc.next().charAt(0);
        
        int asciivalue = ch;
        
        System.out.println("The ASCII value of the given character: " + asciivalue);
    }
}