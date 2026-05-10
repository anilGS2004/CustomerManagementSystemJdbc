package customer_operations;

import java.util.List;

public class CustomerController {
	CustomerService cs;

	public CustomerController() {

		cs = new CustomerService();
	}

	public String addCustomer(CustomerPojo cus) {

		boolean isAdded = cs.createCustomer(cus);

		if (isAdded) {

			return "Customer add successful..";
		}

		return "Fail to add customer";
	}

	public List<CustomerPojo> showCustomer() {

		return cs.showCustomer();
	}

	public boolean updateCustomer(CustomerPojo cp) {

		return cs.updateCustomer(cp);
	}

	public boolean deleteCustomer(int id) {

		return cs.deleteCustomer(id);
	}
}
