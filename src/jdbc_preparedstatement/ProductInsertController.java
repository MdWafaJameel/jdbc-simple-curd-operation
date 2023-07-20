package jdbc_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;
public class ProductInsertController {
     public static void main(String[] args) {
		Connection connection =null;
		try
		{
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
//			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/JDBC830";
			String user="root";
			String pass="Yasmeen251200";
			connection=DriverManager.getConnection(url,user,pass);
		String insertquery="insert into product1 values(?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(insertquery);
		ps.setInt(1, 100);
		ps.setString(2,"marker");
		ps.setString(3, "red");
		ps.setDouble(4, 60);
		ps.execute();
		System.out.println("=============Data Stored==============");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try 
			{
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
