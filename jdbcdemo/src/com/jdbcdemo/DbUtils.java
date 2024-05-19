package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
	public static Connection getDbConnection() throws SQLException {
		Connection connection=DriverManager.getConnection(MyDatabase.JDBC_MYSQL_LOCALHOST_3306_FACULTY,MyDatabase.ROOT,MyDatabase.RAKESH_8280);
		return connection;
	}

}
