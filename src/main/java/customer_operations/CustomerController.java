package customer_operations;

public class CustomerController {
	CustomerService cs;
	public CustomerController() {
		cs= new CustomerService();
	}
	public String addCustomer(CustomerPojo cus) {
		//response to user
		boolean isAdded= cs.createCustomer(cus);
		if(isAdded) {
			return "customer add successful..";
	
		}
		return "fail to add customer";
	}
	public CustomerPojo getRegisterPage() {
		// input from user
		System.out.println("enter the employee details");
		System.out.println("enter id ");
		int id=1000;
		System.out.println("enter name ");
		String name ="sagar";
		System.out.println("enter age ");
		int age=26;
		System.out.println("enter email ");
		String email ="sagar23232@gmail.com";
		System.out.println("enter balance");
		double balance=500;
		System.out.println("you click on Sign up button...");
		CustomerPojo cp= new CustomerPojo();
		cp.setName(name);
		cp.setAge(age);
		cp.setCid(id);
		cp.setEmail(email);
		cp.setBalance(balance);
		return cp;
	}

}
