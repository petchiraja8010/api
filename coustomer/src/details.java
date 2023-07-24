import java.sql.*;
public class details {
	public static void main (String[]args) throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/ashwin";
		String username="root";
		String password="8010";
		
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st= con.createStatement();
		String sql="CREATE TABLE Coustomerdetails"+
				"(Id INTEGER not NULL PRIMARY KEY,"+
				 "Name VARCHAR(255) not NULL,"+
				 "Mobile_no VARCHAR(255) UNIQUE,"+
				 "Purchase VARCHAR(255),"+
				 "Quantity INTEGER,"+
				 "Price INTEGER)";
		
		st.executeUpdate(sql);
		System.out.println("table");
	}

}
