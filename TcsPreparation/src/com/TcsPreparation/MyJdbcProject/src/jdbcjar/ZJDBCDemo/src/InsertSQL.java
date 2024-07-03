import java.sql.*;
import java.util.Scanner;

class InsertSQL {

	static int id;
	static String name;
	static double sal;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		try {
			con = getConnection();
			stmt = getStatement(con);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			stmt.close();
			con.close();
		}

	}

	private static void deleteRow(Statement stmt) throws SQLException {
		System.out.println("Please enter id for which data to be deleted");
		id = sc.nextInt();
		String sql="delete from emp where id="+id;
		int noOfRows = stmt.executeUpdate(sql);
		System.out.println(noOfRows);
	}

	private static void updateARow(Statement stmt) throws SQLException {
		System.out.println("Please enter id for which data to be updated");
		id = sc.nextInt();
		System.out.println("Please enter new name");
		name = sc.next();
		System.out.println("Please enter updated Sal");
		sal = sc.nextDouble();

//			String sql = "update emp set name=" + "'" + name + "'where id=" + id;//
		String sql = "update emp set sal=" + "'" + sal + "'where id=" + id;
		int noOfRows = stmt.executeUpdate(sql);
		System.out.println(noOfRows);
	}

	private static void insertNewRow(Statement stmt) throws SQLException {
		runTimeData();

		String insertQuery = "insert into emp values(" + id + "," + "'" + name + "'," + sal + ")";
		System.out.println(insertQuery);
		int noOfRows = stmt.executeUpdate(insertQuery);
		System.out.println(noOfRows);
	}

	private static void runTimeData() {
		System.out.println("Please enter id");
		id = sc.nextInt();
		System.out.println("Please enter name");
		name = sc.next();
		System.out.println("Please enter Sal");
		sal = sc.nextDouble();
	}

	private static Statement getStatement(Connection con) throws SQLException {
		return con.createStatement();
	}

	private static Connection getConnection() throws SQLException {
		Connection con;
		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo", "root", "root");
		return con;
	}
}