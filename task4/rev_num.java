import java.io.*;
import java.util.*;

class rev_num{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int rem=0;
        
        while(num>0)
        {
            
           rem = (rem*10) + num%10;
           num= num/10;
        }
        
        System.out.println(rem);
    }
}