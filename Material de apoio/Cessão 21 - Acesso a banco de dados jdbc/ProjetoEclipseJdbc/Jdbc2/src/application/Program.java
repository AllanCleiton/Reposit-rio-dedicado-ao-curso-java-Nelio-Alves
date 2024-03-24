package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement  preparador = null;
		ResultSet result = null;
		
	
		
		try {
			conn = DB.getConnection();                                                    //Connect with data base
			preparador = conn.createStatement();										  //instance Statement	
			result = preparador.executeQuery("select * from department");				  //Execute a query and save the result in ResultSet
			
			while(result.next()) {
				System.out.println(result.getInt("Id") + ", " + result.getString("Name"));	//Print in the window the lines of result
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(result);
			DB.closeStatement(preparador);
			DB.closeConnection();
		}

	}

}
