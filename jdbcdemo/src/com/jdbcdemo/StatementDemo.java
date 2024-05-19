package com.jdbcdemo;

import java.sql.*;

public class StatementDemo {

	public static void main(String[] args) {
	try {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Rakesh@8280");
		System.out.println("Connection Successfull ");
		java.sql.Statement statement=connection.createStatement();
		
		System.out.println("Employee Data ");
		ResultSet re=statement.executeQuery("select*from employee");
	    ResultSetMetaData metadata=re.getMetaData();
	    System.out.println(metadata.getColumnCount());
	    System.out.println(metadata.getColumnName(1)+" "+metadata.getColumnName(2)+" "+metadata.getCatalogName(3)+metadata.getColumnName(4));
	
	    while(re.next())
	    	System.out.println(re.getInt(1) +"   "+  re.getString(2)  +"   "+  re.getString(3)  +"   "+  re.getString(4));
	 // int result=statement.executeUpdate("insert into employee values (10,'Sonthosh',3,'Bank Holder')");
	//   int result1=statement.executeUpdate("delete from employee where empid=23");
	  
	//   System.out.println(result+"records inserted");
	//   System.out.println(result1 +"records affected");
	    	connection.close();
	} catch (SQLException e) {
	
		e.printStackTrace();
		
	}
	
	

	}

	
	}


