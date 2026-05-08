package customer_operations;

public class CustomerService {
	customerDao cd;

	public CustomerService() {
		cd= new customerDao() ;
	}

	public boolean createCustomer(CustomerPojo cus) {
//		validation
		int rows = cd.insertCustomer(cus);
		if(rows>0) {
			return true;
		}
		return false;
	}


}
