
package mysql;
import java.sql.*;
public class Mysql {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","yuvan");
			DatabaseMetaData meta=con.getMetaData();
			System.out.println(meta.getDatabaseProductName());
			System.out.println(meta.getDatabaseProductVersion());
			System.out.println(meta.getDriverName());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
