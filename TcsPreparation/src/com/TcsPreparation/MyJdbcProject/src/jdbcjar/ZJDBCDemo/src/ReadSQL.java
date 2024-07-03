import java.sql.*;
import java.util.Scanner;

class ReadSQL {
	
	static int id;
	static String name;
	static double sal;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		try {
			con = getConnection();
			stmt = con.createStatement();
			
			userSignUpCheck(stmt);


		} catch (Exception e) {
			System.out.println(e);
		} finally {
			stmt.close();
			con.close();
		}

	}

	private static void userSignUpCheck(Statement stmt) throws SQLException {
		System.out.println("Please enter id");
		id=sc.nextInt();
		
		String sql="select count(*) from emp where id="+id;
		ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			int count = rs.getInt(1);
			if(count > 0) {
				throw new IllegalArgumentException("User exist");
			}
			else {
				System.out.println("please go ahead with reg process");
			}
	}

	private static void empDataRead(Statement stmt) throws SQLException {
		ResultSet rs = stmt.executeQuery("select * from emp");

		while (rs.next()) {
//				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t\t" + rs.getString(3));
			System.out.println("Employee Details of id " + rs.getString(1));
			System.out.println("Employee name " + rs.getString(2));
			System.out.println("Employee Sal " + rs.getString(3));
			System.out.println("------------------------");
		}
	}

	private static Connection getConnection() throws SQLException {
		Connection con;
		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo", "root", "root");
		return con;
	}
}