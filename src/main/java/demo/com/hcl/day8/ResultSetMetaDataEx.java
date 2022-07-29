package demo.com.hcl.day8;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class ResultSetMetaDataEx {

	public static void main(String[] args) {

		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "12345678");
		
			Statement stmt = conn.createStatement();
			
			DatabaseMetaData dbData = conn.getMetaData();
			System.out.println(dbData.getDatabaseMajorVersion());
			System.out.println(dbData.getDriverName());
			System.out.println(dbData.getMaxConnections());

			
			ResultSet rs = stmt.executeQuery("select * from students");
			
			ResultSetMetaData rsData = rs.getMetaData();
			System.out.println(rsData.getColumnCount());
			System.out.println(rsData.getColumnName(1));
			System.out.println(rsData.getColumnName(2));
			System.out.println(rsData.getColumnName(3));
			System.out.println(rsData.getColumnName(4));

			System.out.println(rsData.getColumnTypeName(1));
			System.out.println(rsData.getColumnTypeName(2));
			System.out.println(rsData.getColumnTypeName(3));
			System.out.println(rsData.getColumnTypeName(4));

			
			
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
