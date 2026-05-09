package customer_operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class customerDao {
	private static Connection connection = null;
	private static Statement st = null;
	private static ResultSet rs = null;
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
	public CustomerPojo showCustomer(int id) {

	    CustomerPojo cp = null;

	    try {

	        connection = MysqlDbConnection.getConnection();

	        String query = "select * from customer where id=?";

	        ps = connection.prepareStatement(query);

	        ps.setInt(1, id);

	        rs = ps.executeQuery();

	        if(rs.next()) {

	            cp = new CustomerPojo();

	            cp.setCid(rs.getInt(1));
	            cp.setName(rs.getString(2));
	            cp.setAge(rs.getInt(3));
	            cp.setEmail(rs.getString(4));
	            cp.setBalance(rs.getDouble(5));
	        }

	    } catch(Exception e) {
	        System.out.println(e);
	    }

	    return cp;
	}
	public boolean updateCustomer(CustomerPojo cp) {

	    String query =
	    "update customer set name=?, age=?, email=?, balance=? where id=?";

	    try {

	        connection = MysqlDbConnection.getConnection();

	        ps = connection.prepareStatement(query);

	        ps.setString(1, cp.getName());
	        ps.setInt(2, cp.getAge());
	        ps.setString(3, cp.getEmail());
	        ps.setDouble(4, cp.getBalance());
	        ps.setInt(5, cp.getCid());

	        int row = ps.executeUpdate();

	        return row > 0;

	    } catch(Exception e) {

	        System.out.println(e);
	    }

	    return false;
	}
	
	public boolean deleteCustomer(int id) {

	    String query = "delete from customer where id=?";

	    try {

	        connection = MysqlDbConnection.getConnection();

	        ps = connection.prepareStatement(query);

	        ps.setInt(1, id);

	        int row = ps.executeUpdate();

	        return row > 0;

	    } catch(Exception e) {

	        System.out.println(e);
	    }

	    return false;
	}
	}




