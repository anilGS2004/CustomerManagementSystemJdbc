package customer_operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class customerDao {
	private static Connection connection = null;
	private static Statement st = null;
	private static ResultSet resultset = null;
	private static PreparedStatement ps = null;
	public int insertCustomer(CustomerPojo cus) {
		try {
			connection = MysqlDbConnection.getConnection();
			String query = "insert into customer values(?,?,?,?,?)";
			ps= connection.prepareStatement(query);
			ps.setInt(1,cus.getCid());
			ps.setString(2, cus.getName());
			ps.setInt(3, cus.getAge());
			ps.setString(4,cus.getEmail() );
			ps.setDouble(5, cus.getBalance());
			int rows = ps.executeUpdate();
			return rows;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}


}
