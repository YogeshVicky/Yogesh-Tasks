import java.io.*;
import java.util.*;

class rev_str{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String word = sc.next();
        
        int i;
        
        for(i=word.length()-1; i>=0; i--){
            
            System.out.print(word.charAt(i));
        }    
    }
}