package demo.com.hcl.day8;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class StatementEx {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "12345678");
		
			Statement stmt = conn.createStatement();
			
			//stmt.executeUpdate("insert into students values ('101010', 'John', 'Doe', 'Unknown')");
			
			
			int count = stmt.executeUpdate("update students set FirstName = 'Bradley' where LastName = 'Doe' ");
			System.out.println(count);
			
			ResultSet rs = stmt.executeQuery("select * from students");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
