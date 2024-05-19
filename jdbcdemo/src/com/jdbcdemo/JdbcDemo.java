package com.jdbcdemo;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class JdbcDemo {



	public static void main(String[] args) throws SQLException {
	Connection connection = DbUtils.getDbConnection();
    System.out.println("Connection scuccessfull ");
    java.sql.Statement statement=connection.createStatement();
    String createQuery="create table aditya(id int,name varchar(15))";
    String insertData="insert into aditya values (13,'Rajesh')";
    int noOfRows=statement.executeUpdate(insertData);
    System.out.println(noOfRows +" inserted ");
    System.out.println("Done");
	}

	

}
