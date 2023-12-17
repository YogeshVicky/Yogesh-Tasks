import java.io.*;
import java.util.*;
class sqrt{
    public static void main(String []args){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
       int num = sc.nextDouble();
        
        int i;
        i=1;
        while(i<=num/2)
        {
            if(num/i==i)
            {
                System.out.println("The square root of "+ num + " is = " + i );
            }
           
            i++;
        }
          
    }
}

