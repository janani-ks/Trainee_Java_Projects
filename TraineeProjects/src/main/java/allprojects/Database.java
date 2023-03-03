package allprojects;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Database {
	 static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	 private Database() {
		 
	 }
	 public static void methodCall(){
			Connect c = Connect.getInstance();
	   	    c.newconnect();
	   	    c.close();
		  }
}
