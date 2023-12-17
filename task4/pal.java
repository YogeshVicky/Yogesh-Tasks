import java.io.*;
import java.util.*;
class pal{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        int dup, rem = 0;
        
        dup = num;
        
        while(dup>0){
            
            rem = (rem*10) + dup%10;
            dup/=10;
        }
        
        if(num==rem){
            System.out.println(num + " is a Palindrome number");
        }
        else{
            System.out.println(num + " is not a palindrome number");
        }
    }
}