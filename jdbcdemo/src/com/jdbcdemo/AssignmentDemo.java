package com.jdbcdemo;

import java.sql.*;

public class AssignmentDemo {

	public static void main(String[] args) {
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Rakesh@8280");
			System.out.println("Connected Successfully ");
			Statement st=connection.createStatement();
			System.out.println("Done");
			//Table Creation//
			String createQuery="Create table flm(id int, name varchar(20))";
			//Inserting Data Into Table//
			String insertData="insert into flm values(16,'Naresh')";
			//Deleting Data From The Table//
			int deleteData=st.executeUpdate("delete from flm where id=16");
			System.out.println(deleteData+ " Deleted ");
			int noOfRows=st.executeUpdate(insertData);
			System.out.println(noOfRows +" Affected ");
			System.out.println("Displaying FLM Table Data");
			System.out.println("_________________________");
			//Reading The Data//
			ResultSet rs=st.executeQuery("select*from flm");
			ResultSetMetaData metadata=rs.getMetaData();
			System.out.println(metadata.getColumnLabel(1)+" "+metadata.getColumnName(2));
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			System.out.println("******************");
			
			
		connection.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
			
		}
	

	}

}
