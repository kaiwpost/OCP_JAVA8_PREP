package org.sbpdiscovery.java.jdbc;


import java.sql.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * MySQL WILL allow you to scrill through a ResultSet even if it uses
 * ResultSet.TYPE_FORWARD_ONLY (default).
 */
public class JDBCTestMySQL {
	
	private static final String URL = "jdbc:mysql://hiv:3306/IMMUNIZATIONS";
	private static final String USER = "root";
	private static final String PASSWORD = "sbmris3cr3t";

	public static void main(String[] args) {
		
		try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			
			Statement statement = connection.createStatement();
			//Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet resultSet = statement.executeQuery("SELECT CENTER_NAME FROM CENTERS")) {
			
			System.out.println(connection);
			System.out.println(statement.getResultSetType());
			System.out.println(resultSet.getType());

			resultSet.last();
			System.out.println(resultSet.getString("CENTER_NAME"));
			resultSet.previous();
			System.out.println(resultSet.getString("CENTER_NAME"));
			resultSet.previous();
			System.out.println(resultSet.getString("CENTER_NAME"));
			resultSet.previous();
			System.out.println(resultSet.getString("CENTER_NAME"));
			resultSet.absolute(-1);
			System.out.println(resultSet.getString("CENTER_NAME"));
			resultSet.absolute(0);
			resultSet.next();
			System.out.println(resultSet.getString("CENTER_NAME"));
			resultSet.first();
			System.out.println(resultSet.getString("CENTER_NAME"));
			resultSet.relative(2);
			System.out.println(resultSet.getString("CENTER_NAME"));
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
}
