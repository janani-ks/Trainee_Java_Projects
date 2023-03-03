package allprojects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect {
	String pass="Janani7@";
	Connection con;
	private static Connect si = null;
	private Connect() {	
	}
	public static Connect getInstance(){
        if (si == null)
            si = new Connect(); 
        return si;
	}
	void newconnect() {	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
  			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root",pass);
  			Statement stmt=con.createStatement();
            Database.display.println("inserting records");
            String sql="Insert into detail values(44,'nivi')";
            stmt.executeUpdate(sql);
		}
		catch(Exception e){
			Database.display.println(e);
   		 }
		
	}
	 void close() {
		try {
			Database.display.println("Closes all open connection");
		 con.close();
		 }
		catch(Exception e){
			Database.display.println(e);
		}
}

}
