package com.jdbcdemo;
import java.sql.*;
public class CallableDemo {

	public static void main(String[] args) {
	try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Rakesh@8280");
		System.out.println("Connection Sucessfull ");
		Statement stmt=con.createStatement();
	   // CallableStatement cst=con.prepareCall("{call result(?,?)}");
		//int marks =27;
		//int id=6;
	//	cst.setInt(1,marks);
	//	cst.setInt(2, id);
		//boolean isSuccess=cst.execute();
	//	String insertData="insert into student values(7,'Raju',86,'pass')";
	//	int noOfRows=stmt.executeUpdate(insertData);
		ResultSet rs=stmt.executeQuery("select*from student");
		ResultSetMetaData metadata=rs.getMetaData();
		System.out.println(metadata.getColumnLabel(1)+" "+metadata.getColumnName(2)+" "+metadata.getColumnName(3)+" "+metadata.getColumnName(4));
		System.out.println("------------------------");
		while(rs.next())
			System.out.println(rs.getString(1) +" "+ rs.getString(2) +" " +rs.getString(3) +" " +rs.getString(4));
	} catch (SQLException e) {
	
		e.printStackTrace();
	}

	}

}
