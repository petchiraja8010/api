import java.sql.*;
public class pharmacy {
	public static void main (String[]args) throws Exception{
		
		
		String url="jdbc:mysql://127.0.0.1:3306/ashwin";
		String username="root";
		String password="8010";
		
		
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st= con.createStatement();
		String sql="CREATE TABLE Medicine"+
				 "(M_id INTEGER not NULL PRIMARY KEY,"+
				 "Medicine_name VARCHAR(255) UNIQUE,"+
				 "Quantity INTEGER,"+
				 "Price INTEGER,"+
				 "Date_of_expiry VARCHAR(255))";
			st.executeUpdate(sql);
			System.out.println("create table");
		}
				
}
