import java.sql.*;
public class show {
	public static void main(String[]args)throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/ashwin";
		String username="root";
		String password="8010";
		String Query= "select * from ashwin.medicine";
		
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st= (Statement) con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		
		while(rs.next()) {
			System.out.println("M_id "+rs.getInt(1));
			System.out.println("Medicine_name "+rs.getString(2));
			System.out.println("Quantity "+rs.getInt(3));
			System.out.println("Price "+rs.getInt(4));
		}

}
}