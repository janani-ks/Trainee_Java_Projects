package allprojects;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Shapes {
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	static boolean b=false;
	static double storedouble() {
		try {
			Scanner scan = new Scanner(System.in);
			b = true;
			return scan.nextDouble();
		}
		catch(Exception e) {
			b = false;
			return 0;
		}
	}
    public static void methodCall(){
		double perimeter;
        double area;
        String type = null;
        display.println("Please enter the type you want as same as Displayed : \n \t 1. Triangle \n \t 2. Rectangle \n \t 3. Circle");
        do{
        	try {
        	Scanner scan1 = new Scanner(System.in);
        	type = scan1.nextLine();
        	if(!type.equals("Triangle") && !type.equals("Rectangle")&&!type.equals("Circle")) {
        		throw new InputMismatchException();
        	}
        	break;
        	}
        	catch(InputMismatchException e) {
        		display.print("Enter the Valid Shape type : ");
        	}
        }while(1>0);
        int n;
        switch(type){
            case "Triangle":
            display.println("Enter the Triangle Base,Side and Height :");
            double side;
            while(1>0) {
            	side = storedouble();
            	if(b)
            		break;
            }
            b=false;
            double base;
            while(1>0) {
            	base = storedouble();
            	if(b)
            		break;
            }
            b=false;
            double height;
            while(1>0) {
            	height = storedouble();
            	if(b)
            		break;
            }
            b=false;
            BasicShapes t = new BasicShapes(side,base,height);
            n = 1;
            perimeter=t.perimeter(n);
            area=t.area(n);
            display.println("The perimeter of Triangle = "+perimeter);
            display.println("The area of Triangle = "+area);
            break;
            case "Rectangle":
            display.println("Enter the Rectangle Height and Width:");
            double height1;
            while(1>0) {
            	height1 = storedouble();
            	if(b)
            		break;
            }
            b=false;
            double width;
            while(1>0) {
            	width = storedouble();
            	if(b)
            		break;
            }
            b=false;
            BasicShapes r = new BasicShapes(height1,width);
            n = 2;
            perimeter=r.perimeter(n);
            area=r.area(n);
            display.println("The perimeter of Rectangle  = "+perimeter);
            display.println("The area of Rectangle = "+area);
            break;
            case "Circle":
            display.println("Enter the Circle Radius :");
            double radius;
            while(1>0) {
            	radius = storedouble();
            	if(b)
            		break;
            }
            b=false;
            BasicShapes c = new BasicShapes(radius);
            n = 3;
            perimeter=c.perimeter(n);
            area=c.area(n);
            display.println("The perimeter of Circle = "+perimeter);
            display.println("The area of Circle = "+area);
            break;
            default:
            display.println("Please Enter the choice between the range 1 to 3");
            break;
        }
        display.println("--------------------X---------------------");
}
}


