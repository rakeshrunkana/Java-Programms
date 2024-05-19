package com.jdbcdemo;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
public class Statementwork {

	public static void main(String[] args) {
try {
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Rakesh@8280");
	System.out.println("Connected To The DataBase ");
	Statement stmt=con.createStatement();
	//String createQuery="create table school(code int,branch varchar(45))";
	//String insertData="insert into school values(5,'Kakinada')";
    // stmt.execute(insertData);
   //String updateData="update school set branch = 'Gajuwaka' where code=4";
//	stmt.execute(updateData);
//	String deleteData="delete from school where code=5";
//	stmt.execute(deleteData);
    //String alterData="alter table school modify column branch varchar(100)";
    //stmt.execute(alterData);
	
	ResultSet rs=stmt.executeQuery("select*from school");
	ResultSetMetaData metadata=rs.getMetaData();
	System.out.println(metadata.getColumnName(1)+" "+metadata.getColumnName(2));
	while(rs.next())
		System.out.println(rs.getString(1)+"  "+rs.getString(2));
	    
	
   
} catch (SQLException e) {
	
	e.printStackTrace();
}

	}

}
