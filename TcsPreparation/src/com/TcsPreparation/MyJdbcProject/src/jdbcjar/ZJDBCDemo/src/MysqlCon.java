import java.sql.*;

class MysqlCon {
	public static void main(String args[]) {
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
// com.mysql.cj.jdbc.Driver

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo", "root", "root");
//here sonoo is the database name, root is the username and root is the password
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from emp");

			while (rs.next())
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t\t" + rs.getString(3));

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}