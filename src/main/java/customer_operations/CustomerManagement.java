package customer_operations;

public class CustomerManagement {
	public static void main(String[] args) {
		CustomerController cc= new CustomerController();
		CustomerPojo cp= cc.getRegisterPage();
		String msg= cc.addCustomer(cp);
		System.out.println("status : "+msg);
		
	}
}
