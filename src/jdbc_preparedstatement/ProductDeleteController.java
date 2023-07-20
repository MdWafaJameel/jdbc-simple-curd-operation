package jdbc_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ProductDeleteController {
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
			String deletequery="delete from product1 where id=?";
			PreparedStatement ps=connection.prepareStatement(deletequery);
			ps.setInt(1, 500);
			ps.executeUpdate();
			System.out.println("=============Data Updated=============");
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				connection.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
}
}
