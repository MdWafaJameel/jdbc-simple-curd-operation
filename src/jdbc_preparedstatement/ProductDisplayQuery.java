package jdbc_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class ProductDisplayQuery {
    public static void main(String[] args) {
		Connection connection=null;
		try
		{
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			String url="jdbc:mysql://localhost:3306/JDBC830";
			String user="root";
			String pass="Yasmeen251200";
			
			connection=DriverManager.getConnection(url,user,pass);
			String displayquery="select * from product1";
			PreparedStatement ps=connection.prepareStatement(displayquery);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
			 int id=rs.getInt(1);
			 String name=rs.getString(3);
			 String color=rs.getString(2);
			 Double price=rs.getDouble(4);
			 System.out.println("product id= "+id);
			 System.out.println("product name= "+name);
			 System.out.println("product color= "+color);
			 System.out.println("product price= "+price);
			 System.out.println("=================================");
			}
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
