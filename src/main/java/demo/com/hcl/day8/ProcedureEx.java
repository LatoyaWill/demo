package demo.com.hcl.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class ProcedureEx {

	public static void main(String[] args) {
		
		
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "12345678");
		
			CallableStatement cstmt = conn.prepareCall("{call stuprocedure(456281, 'Kevin', 'Dawson', 'Fifth')}");
			cstmt.execute();
			
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
