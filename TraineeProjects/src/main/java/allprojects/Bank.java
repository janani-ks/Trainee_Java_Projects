package allprojects;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	static long accountnumber;
	static double amount = 0;
	static double depositeamount;
	static double withdrawamount;
	private Bank() {
		
	}
	static void storebalance() {
		do {
		Scanner scan = new Scanner(System.in);
		try {
    	amount = scan.nextDouble();
    	break;
		}
		catch(InputMismatchException e) {
			display.print("Enter Valid Amount : ");
		}}while(1>0);
	}
	static void storenumber() {
		do {
		Scanner scan = new Scanner(System.in);
		try {
    	accountnumber = scan.nextLong();
    	break;
		}
		catch(InputMismatchException e) {
			display.print("Account Number : ");
		}}while(1>0);
	}
	public static void methodCall() throws InsufficientFundsException{
    	Scanner scan = new Scanner(System.in);
    	Scanner scan1 = new Scanner(System.in);
    	String holdername;
    	int choice;
    	display.println("Enter the Details to create account :");
    	display.print("Account Number : ");
    	storenumber();
    	display.print("Account Holder's Name : ");
    	holdername =  scan.nextLine();
    	display.print("Balace Amount : ");
    	storebalance();
        Account obj = new Account(accountnumber , holdername ,amount);
        display.println("Enter the choice you want :\n 1.Deposite\n 2.Withdraw \n 3.Check Balance Enquiry");
        choice = scan1.nextInt();
        switch(choice) {
        case 1:
        	display.println("Enter the amount to deposite:");
        	storebalance();
        	obj.deposite(depositeamount);
        	break;
        case 2:
        	display.println("Enter the amount to withdraw:");
        	storebalance();
        	try {
                obj.withdraw(withdrawamount);
            }
            catch (InsufficientFundsException e) {
                display.println("Sorry, but you are short $" + e.getAmount());
            }
        	break;
        case 3:
        	display.print("YOUR CURRENT BALANCE IS "+obj.display());
        	break;
        default:
        	display.println("Invalid choice");
        }
        display.println("\n---------Thank You----------");
    }

}
