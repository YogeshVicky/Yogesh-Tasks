import java.io.*;
import java.util.*;
class rev_str{
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the Word: ");
        String word = sc.next();
        String word2 = "";
        
        int i;
        
        for(i=word.length()-1;i>=0;i--){
            
           word2 = word2 + word.charAt(i);
        }
        
        
        if(word2.equals(word)){
        
         System.out.println(word+" is a Palindrome");
        }
         else{
         System.out.println(word+" is Not a Palindrome");
         }
    }
}