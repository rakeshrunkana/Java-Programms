package com.jdbcdemo;
import java.sql.*;
import java.util.*;
public class PstatementDemo {
	static int id;
	static String name;
	static Scanner sc=new Scanner(System.in);
	private static Statement stmt;
	public static void main(String[] args)throws SQLException {
		Connection con=null;
		Statement ps=null;
		try {
			con=getConnection();
		//	stmt=con.createStatement();
		    //deleteRow(stmt);
			dynamicRead(con);
		//	dynamicDelete(con);
		//	dynamicUpdate(con);
		//	dynamicInsert(con);
		    }
		
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
		//	stmt.close();
		//	con.close();
		}
	}
	private static void dynamicRead(Connection con)throws SQLException{
	java.sql.PreparedStatement ps=con.prepareStatement("select *from flm where id=?");
	ps.setInt(1, 13);
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		System.out.println("FLM Id Is : "+rs.getString(1)+"\t"+"FLM Name Is : "+rs.getString(2));
	}

}
	private static void dynamicDelete(Connection con)throws SQLException{
		String insertQuery="delete from flm where id=?";
    java.sql.PreparedStatement ps = con.prepareStatement(insertQuery);
    ps.setInt(1, 18);
    int res=ps.executeUpdate();
    System.out.println("No Of Rows Deleted "+res);
	}	
	private static void dynamicUpdate(Connection con)throws SQLException{
		String insertQuery="update flm set name=? where id=?";
		java.sql.PreparedStatement ps=con.prepareStatement(insertQuery);
		ps.setString(1, "Rakesh");
		ps.setInt(2,16);
		int res=ps.executeUpdate();
		System.out.println("No Of Rows Updated : "+ res);
	}
	private static void dynamicInsert(Connection con) throws SQLException {
		String insertQuery="insert into flm values(?,?)";
		
		java.sql.PreparedStatement ps= con.prepareStatement(insertQuery);
	//    ps.setInt(1, 17);
	//	ps.setString(2, "Lokesh");
		ps.setInt(1, 19);
     	ps.setString(2, "Priya");
		int res=ps.executeUpdate();
		System.out.println("No Of Rows Inserted : "+ res);
		
	}
	private static void deleteRow(Statement stmt)throws SQLException{
		System.out.println("Please Enter A Valid Id For Which Data To Be Deleted ");
		id=sc.nextInt();
		String sql="delete from flm where id ="+id;
		int noOfRows=stmt.executeUpdate(sql);
		System.out.println(noOfRows);
	}
	
	private static Statement getStatement(Connection con) throws SQLException{
		return con.createStatement();
	}
private static Connection getConnection()throws SQLException{
	Connection con;
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Rakesh@8280");
	return con;
}
}
