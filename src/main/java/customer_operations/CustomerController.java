package customer_operations;

import java.util.Scanner;

public class CustomerController {
	Scanner sc = new Scanner(System.in);
	CustomerService cs;

	public CustomerController() {
		cs = new CustomerService();
	}

	public String addCustomer(CustomerPojo cus) {
		// response to user
		boolean isAdded = cs.createCustomer(cus);
		if (isAdded) {
			return "customer add successful..";

		}
		return "fail to add customer";
	}

	public CustomerPojo getRegisterPage() {
		// input from user
		System.out.println("enter the employee details");
		System.out.println("enter id ");
		int id = sc.nextInt();
		System.out.println("enter name ");
		String name = sc.next();
		System.out.println("enter age ");
		int age = sc.nextInt();
		System.out.println("enter email ");
		String email = sc.next();
		System.out.println("enter balance");
		double balance = sc.nextDouble();
		System.out.println("you click on Sign up button...");
		CustomerPojo cp = new CustomerPojo();
		cp.setName(name);
		cp.setAge(age);
		cp.setCid(id);
		cp.setEmail(email);
		cp.setBalance(balance);
		return cp;
	}

	public int showCustomer() {

		System.out.println("enter the customer id to show : ");
		int id = sc.nextInt();

		return id;
	}

	public CustomerPojo showCustomer(int id) {

		return cs.showCustomer(id);
	}

	public CustomerPojo updateCustomer() {

	    CustomerPojo cp = new CustomerPojo();

	    System.out.println("Enter customer id to update : ");
	    cp.setCid(sc.nextInt());

	    sc.nextLine();

	    System.out.println("Enter new name : ");
	    cp.setName(sc.nextLine());

	    System.out.println("Enter new age : ");
	    cp.setAge(sc.nextInt());

	    sc.nextLine();

	    System.out.println("Enter new email : ");
	    cp.setEmail(sc.nextLine());

	    System.out.println("Enter new balance : ");
	    cp.setBalance(sc.nextDouble());

	    return cp;
	}

	public boolean updateCustomer(CustomerPojo cp) {

	    return cs.updateCustomer(cp);
	}
	public int deleteCustomer() {

	    System.out.println("Enter customer id to delete : ");

	    int id = sc.nextInt();

	    return id;
	}

	public boolean deleteCustomer(int id) {

	    return cs.deleteCustomer(id);
	}
}
