package com.jdbcDemo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private String url="jdbc:mysql://localhost:3306/data1";
	private String userId="root";
	private String password="Dgp@9019";
	
	private Connection connection;
	private DriverManager DriverManage;
 public DBConnection()
 {
	try {
		//step1:Register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2:Get Connection Object
		this.connection=DriverManager.getConnection(url,userId,password);
					
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
  public Connection getConnection()
  {
	  return this.connection;
  }
}









