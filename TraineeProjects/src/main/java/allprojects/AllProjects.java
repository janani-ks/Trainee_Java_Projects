package allprojects;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AllProjects {
	public static void main(String [] args) throws InsufficientFundsException, CloneNotSupportedException, FileNotFoundException {
		PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
		char ch = 0;
		do {
		display.println("Enter the choice you want : \n \t 1.Banking Application \n \t 2.Shapes Calculation"
					+ "\n \t 3.Student Details"
					+ "\n \t 4.Database Connection"
					+ "\n \t 5.Basic Point in 2D Space"
					+ "\n \t 6.Creditcard Application"
					+ "\n \t 7.Student Detail's Operations"
					+ "\n \t 8.Hashing Implementation"
					+ "\n \t 9.Calculator Implementation"
					+ "\n \t 10.Contacts Implementation"
					+ "\n \t 11.File Operations"
					+ "\n \t 12.Tic Tac Toe Implementation");
		int choice=0;
		do{
			try {
			Scanner scan = new Scanner(System.in);
			choice = scan.nextInt();
			break;
			}
			catch(Exception e) {
				display.println("Enter the valid number between 1 to 12 :");
			}
		}while(1>0);
		switch(choice) {
		case 1:
			display.print("\n---------------------Banking Application------------------------\n");
			Bank.methodCall();
			break;
		case 2:
			display.print("\n---------------------Shapes Calculation------------------------\n");
			Shapes.methodCall();
			break;
		case 3:
			display.print("\n---------------------Student Details------------------------\n");
			Students.methodCall();
			break;
		case 4:
			display.print("\n---------------------Database Connection------------------------\n");
			Database.methodCall();
			break;
		case 5:
			display.print("\n---------------------Basic Point in 2D Space------------------------\n");
			Points.methodCall();
			break;
		case 6:
			display.print("\n---------------------Creditcard Application------------------------\n");
			Creditcard.methodCall();
			break;
		case 7:
			display.print("\n---------------------Student Detail's Operations------------------------\n");
			StudentTest.methodCall();
			break;
		case 8:
			display.print("\n---------------------Hashing Implementation------------------------\n");
			Hashing.methodCall();
			break;
		case 9:
			display.print("\n---------------------Calculator Implementation------------------------\n");
			Arithmetic.methodCall();
			break;
		case 10:
			display.print("\n---------------------Contacts Implementation------------------------\n");
			Contacts.methodCall();
			break;
		case 11:
			display.print("\n---------------------File Operations------------------------\n");
			ReadFile.methodCall();
			break;
		case 12:
			display.print("\n---------------------Tic Tac Toe Implementation------------------------\n");
			Tic.methodCall();
			break;
		}
		display.print("Do you want to do more operations Y/N (or) y/n : ");
		do{
			try {
			Scanner scan = new Scanner(System.in);
			ch = scan.next().charAt(0);
			if(ch !='y' && ch !='Y' && ch !='n' &&ch !='N') {
				throw new InputMismatchException();
			}
			break;
			}
			catch(Exception e) {
				display.println("Enter the valid value :");
			}
		}while(1>0);
		}while(ch == 'y' || ch == 'Y');
		display.print("---------------------Thank You------------------------");
	}
}
