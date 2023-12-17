import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

class bankdetails {

	public String customername;
	public long customerId;

	public void details(String name, long accnum) {

		this.customername = name;

		System.out.println('\n' + "Hello " + name + "  Acc no: " + accnum);
		System.out.println("Welcome To YOVI Bank");

		System.out.println('\n' + "Enter the number for the following actions" + '\n' + "1. Deposit" + '\n'
				+ "2. WithDraw" + '\n' + "3. Check Balance" + '\n' + "4. Exit");

	}
}

class deposit extends bankdetails {

	private float deposit;

	public void setDeposit(float depo, float balance) {

		this.deposit = depo + balance;
		System.out.println("Amount of Rs: " + depo + " was Credited in your account");
	}

	public float getDeposit() {

		return this.deposit;

	}
}

class withdraw extends deposit {

	public float withdraw_amount(float widraw, float balance) {

		if (widraw < balance) {
			if (balance > 500) {
				balance = balance - widraw;
				System.out.println("Amount of Rs: " + widraw + " was debited from your Account");

				return balance;
			}

			else {
				System.out.println("Sorry Insufficient Balance");
				return 0;
			}
		}

		else {

			System.out.println("Sorry Insufficient Balance");
			return 0;
		}
	}
}

class checkbalance extends withdraw {
	public void balance_check(float balance) {
		System.out.println("Current balance in your Account is  Rs: " + balance);
	}
}

class bank // Main class
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LocalDateTime lt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-YYYY hh:mm");
		System.out.println(lt.format(dtf));

		System.out.print("Enter your Account Number: ");
		long accnum = sc.nextLong();
		sc.nextLine();

		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		bankdetails bd = new bankdetails();

		bd.details(name, accnum);

		deposit dt = new deposit();
		withdraw wd = new withdraw();
		checkbalance cb = new checkbalance();

		float balance = 0;
		boolean exit = false;

		while (!exit) {
			try {

				int num = sc.nextInt();

				if (num == 1) {
					try {

						System.out.print("Enter the amount to deposit: ");
						float depo = sc.nextFloat();

						dt.setDeposit(depo, balance);

						balance = dt.getDeposit();

					} catch (InputMismatchException ex) {
						System.out.println("Enter amount in numbers");
						sc.nextLine();

					}

				}

				else if (num == 2) {
					try {

						System.out.print("Enter the amount to withdraw: ");
						float widraw = sc.nextFloat();
						balance = wd.withdraw_amount(widraw, balance);
					}

					catch (InputMismatchException ex) {
						System.out.println("Enter amount in numbers");
						sc.nextLine();
					}

				}

				else if (num == 3) {

					cb.balance_check(balance);

				}

				else if (num == 4) {

					System.out.println("Thanks for choosing YOVI Bank");
					System.out.println("Please contact us for future assistance");

					exit = true;

				}

				else {
					try {
						System.out.println("Enter the numbers from '1' to '4' only");
					} catch (InputMismatchException ex) {
						System.out.println("Enter only numbers");
						sc.nextLine();
					}
				}

			} catch (InputMismatchException ex) {
				System.out.println("Enter only numbers");
				sc.nextLine();
			}
		}

	}
}
