package customer_operations;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlDbConnection {
	private static String driver_class = "com.mysql.cj.jdbc.Driver";
	private static String database_url = "jdbc:mySQL://localhost:3306/";
	private static String database_name = "batch_428";
	private static String username = "root";
	private static String password = "anil";
	private static Connection connection;
	public static Connection getConnection() {
		try {
			Class.forName(driver_class);
			connection=DriverManager.getConnection(database_url+database_name,username , password);
			return connection;

		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
