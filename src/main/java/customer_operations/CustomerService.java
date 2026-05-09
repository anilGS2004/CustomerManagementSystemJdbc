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
	public CustomerPojo showCustomer(int cid) {

	    return cd.showCustomer(cid);
	}
	public boolean updateCustomer(CustomerPojo cp) {

	    return cd.updateCustomer(cp);
	}
	public boolean deleteCustomer(int id) {

	    return cd.deleteCustomer(id);
	}



}
