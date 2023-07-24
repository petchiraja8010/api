import java.sql.*;
public class Insert {
	public static void main(String[]args) throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/ashwin";
		String username="root";
		String password="8010";
		String Query= "insert into Coustomerdetails  values(?,?,?,?,?,?)";
		
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement st= con.prepareStatement(Query);
		st.setInt(1,10);
		st.setString(2,"kani"); 
		st.setString(3,"7898480970");
		st.setString(4, null);
		st.setInt(5, 0);
		st.setInt(6, 0);
		st.executeUpdate();
	}

}
