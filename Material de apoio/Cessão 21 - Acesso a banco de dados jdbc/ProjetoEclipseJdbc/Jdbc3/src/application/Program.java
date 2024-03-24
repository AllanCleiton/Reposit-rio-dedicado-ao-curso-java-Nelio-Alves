package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement preparador = null;
		
		
		try {
			conn = DB.getConnection();                                                
			preparador = conn.prepareStatement(
					"insert into seller" 
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentID)"
					+ "values"
					+ "(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
			preparador.setString(1, "Carl Purple");
			preparador.setString(2, "carl@gmain.com");
			preparador.setDate(3, new java.sql.Date(sdf.parse("19/03/2024").getTime()));
			preparador.setDouble(4, 3000);
			preparador.setInt(5, 4);
			
			int rowsAffected = preparador.executeUpdate();
			if(rowsAffected > 0) {
				ResultSet rs = preparador.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = "+ id);
				}
				
			}else {
				System.out.println("No rows affected.");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ParseException e){
			e.getStackTrace();
		}
		finally {
			DB.closeStatement(preparador);
			DB.closeConnection();
			
		}

	}

}
