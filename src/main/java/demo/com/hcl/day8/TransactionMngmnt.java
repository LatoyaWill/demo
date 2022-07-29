package demo.com.hcl.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionMngmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "12345678");
		
			Statement stmt = conn.createStatement();
			
			//disable auto commit 
			conn.setAutoCommit(false);
			
			stmt.execute("insert into training.students values (772607, 'Jamorie', 'Bates', 'Eighth')");
			System.out.println("Student registered successfully");
			
			stmt.executeUpdate("insert into file_table values (836251, 125, 'JamorieBates Transcript')");
			System.out.println("Success..file inserted");
			
			conn.commit();
			
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
