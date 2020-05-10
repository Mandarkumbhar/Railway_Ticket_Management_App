package com.corejava.railwayDAO;

import java.sql.*;


public class RailwayDB {
	public static Connection getConnection() 
			  throws Exception
			  {
				  Class.forName("com.mysql.jdbc.Driver");
				  Connection  conn = DriverManager.getConnection(
						  "jdbc:mysql://localhost:3306/mandar",
						  "root","root");
				  
				  return conn;
			  }

}
