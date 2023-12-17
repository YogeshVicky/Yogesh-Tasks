import java.io.*;
import java.util.*;

class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, i, count, num;

        System.out.print("Enter the start number: ");
        a = sc.nextInt();

        System.out.print("Enter the end number: ");
        b = sc.nextInt();

        for (num = a; num <= b; num++) {
            count = 0;

            for (i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(num + " is a prime number");
            }
        }
    }
}