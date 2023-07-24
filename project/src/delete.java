import java.sql.*;
public class delete {
	public static void main(String[]args) throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/ashwin";
		String username="root";
		String password="8010";
		int M_id=10;
		String Query="delete from medicine where M_id= "+M_id;
		
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement st= con.prepareStatement(Query);
		st.executeUpdate();
	

	}

}
