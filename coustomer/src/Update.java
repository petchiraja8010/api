import java.sql.*;
public class Update {
	public static void main (String[]args) throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/ashwin";
		String username="root";
		String password="8010";
		String updateSQL= "UPDATE Coustomerdetails SET Name=? WHERE Id=?";
		try(Connection con=DriverManager.getConnection(url, username, password);
				PreparedStatement st= con.prepareStatement(updateSQL)){
			st.setString(1,"mayan");
			st.setInt(2,7);
			st.executeUpdate();
		}
	}

}
