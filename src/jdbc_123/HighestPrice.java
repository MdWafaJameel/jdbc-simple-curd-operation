package jdbc_123;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HighestPrice {
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
						String insertQuery="insert into product1(id,name,color,price) values (200, 'mobile','red',13000),(300, 'fan','blue',1400),(400, 'AC','green',35000),(500, 'mobile','red',20000)";
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
