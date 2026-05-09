package customer_operations;

public class CustomerManagement {
	public static void main(String[] args) {
		CustomerController cc = new CustomerController();
	CustomerPojo cp= cc.getRegisterPage();
		String msg= cc.addCustomer(cp);
		System.out.println("status : "+msg);
		 int id = cc.showCustomer();
	//	 CustomerPojo cp = cc.showCustomer(id);

//		CustomerPojo cp = cc.updateCustomer();

		boolean isUpdated = cc.updateCustomer(cp);

		if (isUpdated) {

			System.out.println("Customer updated successfully");

		} else {

			System.out.println("Customer not found");
		}

//		int id = cc.deleteCustomer();

		boolean isDeleted = cc.deleteCustomer(id);

		if (isDeleted) {

			System.out.println("Customer deleted successfully");

		} else {

			System.out.println("Customer not found");
		}
	}

}
