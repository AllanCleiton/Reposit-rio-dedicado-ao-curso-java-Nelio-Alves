package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbIntegretyException;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			
			conn.setAutoCommit(false);
			
			int rows1 = st.executeUpdate("update seller set BaseSalary = 2090 where DepartmentId = 1");
			
			/*int n =1;
			if(n<2) {
				throw new DbIntegretyException("Fake error");
			}*/
			
			int rows2 = st.executeUpdate("update seller set BaseSalary = 1090 where DepartmentId = 2");
					
			
			conn.commit();
			
			System.out.println("Rows1 = " + rows1);
			System.out.println("Rows2 = " + rows2);
		}catch(SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				throw new DbIntegretyException(e1.getMessage());
			}
			e.getMessage();
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		

	}

}
