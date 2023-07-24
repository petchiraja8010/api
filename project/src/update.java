import java.sql.*;
public class update {
	public static void main (String[]args) throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/ashwin";
		String username="root";
		String password="8010";
		String updateSQL= "UPDATE medicine SET Quantity=? WHERE M_id=?";
		try(Connection con=DriverManager.getConnection(url, username, password);
				PreparedStatement st= con.prepareStatement(updateSQL)){
			st.setInt(1,45);
			st.setInt(2,2);
			st.executeUpdate();
			
			
		}
	}

}
