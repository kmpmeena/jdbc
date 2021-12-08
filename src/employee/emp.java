package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class emp{

	public static void main(String[] args) {
		try {
			//connection creaton
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
			
			System.out.println("connection created");
			//create statement
			
			Statement mystate= mycon.createStatement();
//query execute
			int rs=mystate.executeUpdate("INSERT INTO `mydatabase`.`EMPLOYEE` (`idemployee`, `employeedep`, `employeename`) VALUES ('15', 'df', 'jdgf')");   
			System.out.println("record created");		
	
	}catch(Exception e) {
			e.printStackTrace();
			
	}
	}

}
