import java.sql.*;
public class insert {
	public static void main(String[]args)throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/ashwin";
	String username="root";
	String password="8010";
	String Query= "insert into medicine values(?,?,?,?,?)";
	
	Connection con=DriverManager.getConnection(url, username, password);
	PreparedStatement st= con.prepareStatement(Query);
	st.setInt(1,10);
	st.setString(2,"antibiotics"); 
	st.setInt(3,40);
	st.setInt(4,8);
	st.setString(5,"24dec");
	st.executeUpdate();

}
}