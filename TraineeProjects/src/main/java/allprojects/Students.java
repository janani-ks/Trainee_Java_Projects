package allprojects;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Students{
	private Students() {
		
	}
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	static boolean b = false;
	static double storedouble() {
		Scanner scan = new Scanner(System.in);
		try {
			b = true;
			return scan.nextDouble();
		}
		catch(Exception e) {
			display.print("Enter valid GPA = ");
			b = false;
			return 0;
		}
	}
	static int storeint() {
		Scanner scan = new Scanner(System.in);
		try {
			b = true;
			return scan.nextInt();
		}
		catch(Exception e) {
			display.print("Enter valid GPA = ");
			b = false;
			return 0;
		}
	}
	public static void methodCall() {
		Scanner scan1 = new Scanner(System.in);
		display.println("Enter Student Details : ");
		display.print("Student Name = ");
		String studentname = scan1.nextLine();
		display.print("Student Grade = ");
		String studentgrade = scan1.nextLine();
		display.print("Student GPA = ");
		double gpa;
		while(1>0) {
			gpa = storedouble();
			if(b)
				break;
		}
		b = false;
		Details obj = new Details ( studentname, studentgrade , gpa );
		display.println("Enter the choice you want \n \t1.Update GPA \n\t2.Display GPA");
		int choice = 0;
		while(1>0) {
			choice = storeint();
			if(b)
				break;
		}
		b = false;
		switch(choice) {
		case 1:
		display.print("Student New GPA = ");
		while(1>0) {
			gpa = storedouble();
			if(b)
				break;
		}
		b = false;
        obj.update(gpa);
        break;
		case 2:
        display.println(obj.print());
        break;
        default:
        display.print("Invalid Choice");
		}
		display.println("--------------------X---------------------");
	}
}
