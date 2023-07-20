package jdbc_123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class lowestprice {
	public static void main(String[] args) {
		Connection connection=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url ="jdbc:mysql://localhost:3306/JDBC830";
			String user="root";
			String pass="Yasmeen251200";
					connection =DriverManager.getConnection(url,user,pass);
					Statement statement =connection.createStatement();
					String insertQuery="insert into product3(id,name,color,price) values (102, 'marker','blue',30),(103, 'pen','red',20)";
					statement.execute(insertQuery);
					System.out.println("Data===================inserted=================");
		}catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}finally {
			try {
				if(connection!=null)
				{
					connection.close();	
				}
				else
				{
					System.out.println("pls first establish connection");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

}
}
