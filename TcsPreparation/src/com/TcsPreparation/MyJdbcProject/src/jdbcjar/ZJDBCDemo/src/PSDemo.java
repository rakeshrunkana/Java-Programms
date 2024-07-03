import java.sql.*;
import java.util.Scanner;

class PSDemo {

	static int id;
	static String name;
	static double sal;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement ps = null;
		try {
			con = getConnection();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ps.close();
			con.close();
		}

	}

	private static void dynamicRead(Connection con) throws SQLException {
		PreparedStatement ps1 = con.prepareStatement("select * from emp where id=?");
		ps1.setInt(1, 123);

		ResultSet rs = ps1.executeQuery();

		while (rs.next()) {
//					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t\t" + rs.getString(3));
			System.out.println("Employee Details of id " + rs.getString(1));
			System.out.println("Employee name " + rs.getString(2));
			System.out.println("Employee Sal " + rs.getString(3));
			System.out.println("------------------------");
		}
	}

	private static void dynamicDelete(Connection con) throws SQLException {
		String insertQuery = "delete from emp where id=?";
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setInt(1, 69);
		int res = ps.executeUpdate();
		System.out.println(res);
	}

	private static void dynamicUpdate(Connection con) throws SQLException {
		String insertQuery = "update emp set sal=? where id=?";
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setDouble(1, 116);
		ps.setInt(2, 69);
//			ps.setDouble(3, 69.35);
		int res = ps.executeUpdate();
		System.out.println(res);
	}

	private static void dynamicInsert(Connection con) throws SQLException {
		String insertQuery = "insert into emp values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setInt(1, 69);
		ps.setString(2, "Lecha");
		ps.setDouble(3, 69.35);
		int res = ps.executeUpdate();
		System.out.println(res);
	}

	private static void deleteRow(Statement stmt) throws SQLException {
		System.out.println("Please enter id for which data to be deleted");
		id = sc.nextInt();
		String sql = "delete from emp where id=" + id;
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

		String insertQuery = "insert into emp values(?,?,?,?)";
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