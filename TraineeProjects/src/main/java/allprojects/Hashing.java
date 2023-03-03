package allprojects;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	private String name;
	private int weight;
	Hashing(String n,int w){
		this.name = n;
		this.weight = w;
	}
	void getter() {
		display.println("Fruit Name = "+name);
		display.println("Weight of "+name+" is = "+weight);
		display.println("-----------------");
	}
	public static void methodCall() {
		Hashing h = new Hashing("Graphs",2);
		Hashing h1 = new Hashing("Orange",3);
		Hashing h2 = new Hashing("Pomegranate",8);
		Hashing h3 = new Hashing("Apple",4);
		Hashing h4 = new Hashing("Apple",4);
		display.println("Predefined Equlas method returns "+(h1==h4));
		HashSet<Hashing> a = new HashSet<>();
		a.add(h);
		a.add(h1);
		a.add(h2);
		a.add(h3);
		a.add(h4);
		display.println( a);
		display.println("Overriden Equlas method returns "+(h1.equals(h4)));
		Iterator<Hashing> i=a.iterator();  
        while(i.hasNext())  
        {  
     	   i.next().getter();  
        }
	}
	
	@Override
	public boolean equals(Object b) {
		Hashing x = (Hashing)b;
		return x.name.equals(this.name)&& x.weight==this.weight;
	}
	
	@Override
	public int hashCode() {
		return this.weight*this.name.hashCode();
	}
}
