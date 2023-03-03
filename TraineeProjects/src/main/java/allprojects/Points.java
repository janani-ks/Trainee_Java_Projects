package allprojects;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Points implements Cloneable {
	double x;
	double y;
	static boolean b1 = false;
	static Scanner scan = new Scanner(System.in);
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	Points(double axis1,double axis2){
		x=axis1;
		y=axis2;
	}
	boolean equals() {
		boolean b;
		if(x==y)
			b = true;
		else
			b = false;
		return b;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  
	static Points cloneobj(double x,double y)throws CloneNotSupportedException{
		Points obj1 = new Points(x,y);
		return (Points)obj1.clone();
	}
	static double storedouble() {
		Scanner scan = new Scanner(System.in);
		try {
			b1 = true;
			return scan.nextDouble();
		}
		catch(Exception e) {
			b1 = false;
			return 0;
		}
	}
	static double loop() {
		double x;
		while(1>0) {
			x = storedouble();
			if(b1)
				break;
		}
		b1 = false;
		return x;
	}
	public static void methodCall() throws CloneNotSupportedException{
		double x;
		double y;
		display.println("Enter x and y axis : ");
		x = loop();
		y = loop();
		Points obj = new Points(x,y);
		display.println("The x and y axis are same : "+obj.equals());
		display.println("Enter new x and y axis : ");
		x = loop();
		y = loop();
        obj = Points.cloneobj(x,y);  
        display.println("The new x and y axis are "+obj.x +" and "+obj.y);
        display.println("--------------------X---------------------");
	}
}


