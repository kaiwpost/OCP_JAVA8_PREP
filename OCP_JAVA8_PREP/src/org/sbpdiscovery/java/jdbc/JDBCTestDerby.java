package org.sbpdiscovery.java.jdbc;


import java.sql.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Derby WILL NOT allow you to scroll through a ResultSet if it uses
 * ResultSet.TYPE_FORWARD_ONLY (default).
 */
public class JDBCTestDerby {
	
	private static final String URL = "jdbc:derby:zoo";

	public static void main(String[] args) {
		
		try(Connection connection = DriverManager.getConnection(URL);
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				
			//Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT NAME FROM ANIMALS")) {
			
			System.out.println(connection);
			System.out.println(statement.getResultSetType());
			System.out.println(resultSet.getType());

			resultSet.last();
			System.out.println(resultSet.getString("NAME"));
			resultSet.previous();
			System.out.println(resultSet.getString("NAME"));
			resultSet.previous();
			System.out.println(resultSet.getString("NAME"));
			resultSet.previous();
			System.out.println(resultSet.getString("NAME"));
			resultSet.absolute(-1);
			System.out.println(resultSet.getString("NAME"));
			resultSet.absolute(0);
			resultSet.next();
			System.out.println(resultSet.getString("NAME"));
			resultSet.first();
			System.out.println(resultSet.getString("NAME"));
			resultSet.relative(2);
			System.out.println(resultSet.getString("NAME"));
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
}
