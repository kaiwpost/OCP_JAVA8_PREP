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
			//Statement statement = connection.createStatement();
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet resultSet = statement.executeQuery("SELECT NAME FROM ANIMALS")) {
			
			System.out.println(connection);
			System.out.println(statement.getFetchSize());
			System.out.println(resultSet.getFetchSize());
			
			System.out.println(resultSet.absolute(0));
			System.out.println(resultSet.absolute(5));
			System.out.println(resultSet.previous());
			System.out.println(resultSet.relative(-2));
			System.out.println(resultSet.relative(100));
			
			System.out.println(resultSet);
			
			resultSet.absolute(0);
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
}
