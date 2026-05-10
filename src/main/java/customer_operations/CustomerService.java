package customer_operations;

import java.util.List;

public class CustomerService {
	customerDao cd;

	public CustomerService() {

		cd = new customerDao();
	}

	public boolean createCustomer(CustomerPojo cus) {

		int rows = cd.insertCustomer(cus);

		if (rows > 0) {

			return true;
		}

		return false;
	}

	public List<CustomerPojo> showCustomer() {

		return cd.showCustomer();
	}

	public boolean updateCustomer(CustomerPojo cp) {

		return cd.updateCustomer(cp);
	}

	public boolean deleteCustomer(int id) {

		return cd.deleteCustomer(id);
	}
}
