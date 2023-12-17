import java.io.*;
import java.util.*;

class trycatch {
	public static void main(String[] args) {
		trycatch tc = new trycatch();
		tc.divide();
		tc.add();

	}

	public void add() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numbers for Addition: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int result = num1 + num2;
			System.out.println("Sum of given numbers for: " + result);
		}

		catch (InputMismatchException ex) {
			System.out.println("Enter only Numbers");
			add();

		}

		finally {
			System.out.println("Database closed can handle by others");
			System.out.println("Thank You");

		}

	}

	public void divide() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numbers for Division: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println("Division of given numbers: " + result);
		} catch (ArithmeticException ex) {
			System.out.println("Can't divide by Zero");
			divide();
		} catch (InputMismatchException ex) {
			System.out.println("Enter only Numbers");
			divide();
		} catch (Exception ex) {
			System.out.println("Unknown Reasons");
			divide();
		}

	}

}
