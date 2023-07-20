package jdbc_123;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class displayquerybyprepared {
	public static void main(String[] args) {
		Connection connection = null;

		try {
			// step-1 load/Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 create connection
			
			String url = "jdbc:mysql://localhost:3306/jdbc-preparedstatement";
			String user = "root";
			String pass = "Yasmeen251200";
			
			connection=DriverManager.getConnection(url, user, pass);
			
			//step-3 create statement 
			String displayquery = "select * from product";
			
			PreparedStatement preparedStatement=connection.prepareStatement(displayquery);
			 resultset
			 while(resultset.next())
			 {
				 int id = resultset.getI
			 }
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
