package demo.com.hcl.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStmntEx {

	public static void main(String[] args) {
		
Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "12345678");
		
			PreparedStatement inPstmt = conn.prepareStatement("insert into training.students values (?, ?, ?, ?)");
			inPstmt.setInt(1,  Integer.parseInt(args[0]));
			inPstmt.setString(2, args[1]);
			inPstmt.setString(3, args[2]);
			inPstmt.setString(4, args[3]);
			int count = inPstmt.executeUpdate();
					
			/*inPstmt.executeUpdate("update students set FirstName = 'Dennis' where LastName = 'Doe' ");
			inPstmt.setString(1, args[2]);
			inPstmt.setInt(2,  Integer.parseInt(args[3]));*/
			
			System.out.println(count);
			
			PreparedStatement pstmt = conn.prepareStatement("select * from students");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getInt("StudentId") + " " + rs.getString("FirstName") + " " + rs.getString("LastName") + " " + rs.getString("Grade"));

			}
					
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
