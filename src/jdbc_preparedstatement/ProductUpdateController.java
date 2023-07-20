package jdbc_preparedstatement;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class ProductUpdateController {
     public static void main(String[] args) {
    	 Connection connection =null;
 		try
 		{
 			Driver driver=new Driver();
 			DriverManager.registerDriver(driver);
// 			Class.forName("com.mysql.cj.jdbc.Driver");
 			String url="jdbc:mysql://localhost:3306/JDBC830";
 			String user="root";
 			String pass="Yasmeen251200";
 			connection=DriverManager.getConnection(url,user,pass);
 			String updatequery="update product1 set name=? where id=?";
 			PreparedStatement ps=connection.prepareStatement(updatequery);
 			ps.setString(1,"iphone");
 			ps.setInt(2, 200);
 			ps.executeUpdate();
 			System.out.println("=============Data updated==============");
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
