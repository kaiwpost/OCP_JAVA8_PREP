package org.sbpdiscovery.java.jdbc;


import java.sql.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Setting up an Apache Derby example database.
 */
public class SetupDerbyDatabase {

	public static void main(String[] args) {
		
		String url = "jdbc:derby:zoo;create=true";
		
		try(Connection connection = DriverManager.getConnection(url);
			Statement statement = connection.createStatement()) {
			
			String sql = new String();
			
			sql =
				"CREATE TABLE SPECIES(" +
					"ID INTEGER PRIMARY KEY, " +
					"NAME VARCHAR(255), " +
					"NUM_ACRES DECIMAL)";
			statement.executeUpdate(sql);
			
			sql =
				"CREATE TABLE ANIMALS(" +
					"ID INTEGER PRIMARY KEY, " +
					"SPECIES_ID INTEGER, " +
					"NAME VARCHAR(255), " +
					"DATE_BORN TIMESTAMP)";
			statement.executeUpdate(sql);

			sql = "INSERT INTO SPECIES VALUES(1, 'African Elephant', 7.5)";
			statement.executeUpdate(sql);
			
			sql = "INSERT INTO SPECIES VALUES(2, 'Zebra', 1.2)";
			statement.executeUpdate(sql);
			
			sql = "INSERT INTO ANIMALS VALUES(1, 1, 'Elsa', '2001-05-06 02:15:00')";
			statement.executeUpdate(sql);
			
			sql = "INSERT INTO ANIMALS VALUES(2, 2, 'Zelda', '2002-08-15 09:12:00')";
			statement.executeUpdate(sql);
			
			sql = "INSERT INTO ANIMALS VALUES(3, 1, 'Ester', '2002-09-09 10:36:00')";
			statement.executeUpdate(sql);
			
			sql = "INSERT INTO ANIMALS VALUES(4, 1, 'Elsa', '2010-06-08 01:24:00')";
			statement.executeUpdate(sql);
			
			sql = "INSERT INTO ANIMALS VALUES(5, 2, 'Zoe', '2005-11-12 03:44:00')";
			statement.executeUpdate(sql);
			
			sql = "INSERT INTO ANIMALS VALUES(6, 2, 'Tobovski', '2015-11-12 06:15:00')";
			statement.executeUpdate(sql);
			
			sql = "INSERT INTO ANIMALS VALUES(7, 1,'Merilee', '2003-01-24 09:14:00')";
			statement.executeUpdate(sql);
			
			sql = "INSERT INTO ANIMALS VALUES(8, 2, 'Kai', '2000-02-12 05:14:00')";
			statement.executeUpdate(sql);
			
			sql = "INSERT INTO ANIMALS VALUES(9, 2, 'Kosta', '2005-09-02 02:50:00')";
			statement.executeUpdate(sql);
			
			sql = "INSERT INTO ANIMALS VALUES(10, 1, 'David', '2005-12-25 11:59:00')";
			statement.executeUpdate(sql);
		}
		catch(SQLException se) {
			se.printStackTrace();
		}

	}

}
