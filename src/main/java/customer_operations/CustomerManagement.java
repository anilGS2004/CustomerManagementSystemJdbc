package customer_operations;

import java.util.List;
import java.util.Scanner;

public class CustomerManagement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CustomerController cc = new CustomerController();

		while (true) {

			System.out.println("\n===== CUSTOMER MANAGEMENT SYSTEM =====");

			System.out.println("1. Add Customer");
			System.out.println("2. Show All Customers");
			System.out.println("3. Update Customer");
			System.out.println("4. Delete Customer");
			System.out.println("5. Exit");

			System.out.println("Enter your choice : ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				CustomerPojo cp = new CustomerPojo();

				System.out.println("Enter customer id : ");
				cp.setCid(sc.nextInt());

				System.out.println("Enter customer name : ");
				cp.setName(sc.next());

				System.out.println("Enter customer age : ");
				cp.setAge(sc.nextInt());

				System.out.println("Enter customer email : ");
				cp.setEmail(sc.next());

				System.out.println("Enter customer balance : ");
				cp.setBalance(sc.nextDouble());

				String msg = cc.addCustomer(cp);

				System.out.println("Response : " + msg);

				break;

			case 2:

				List<CustomerPojo> customerList = cc.showCustomer();

				if (customerList.isEmpty()) {

					System.out.println("No customers found");
				}

				else {

					for (CustomerPojo customer : customerList) {

						System.out.println("--------------------------------");

						System.out.println("Customer Id : " + customer.getCid());
						System.out.println("Customer Name : " + customer.getName());
						System.out.println("Customer Age : " + customer.getAge());
						System.out.println("Customer Email : " + customer.getEmail());
						System.out.println("Customer Balance : " + customer.getBalance());
					}
				}

				break;

			case 3:

				CustomerPojo updateCustomer = new CustomerPojo();

				System.out.println("Enter customer id : ");
				updateCustomer.setCid(sc.nextInt());

				System.out.println("Enter new customer name : ");
				updateCustomer.setName(sc.next());

				System.out.println("Enter new customer age : ");
				updateCustomer.setAge(sc.nextInt());

				System.out.println("Enter new customer email : ");
				updateCustomer.setEmail(sc.next());

				System.out.println("Enter new customer balance : ");
				updateCustomer.setBalance(sc.nextDouble());

				boolean isUpdated = cc.updateCustomer(updateCustomer);

				if (isUpdated) {

					System.out.println("Customer updated successfully");
				}

				else {

					System.out.println("Customer not updated");
				}

				break;

			case 4:

				System.out.println("Enter customer id to delete : ");

				int deleteId = sc.nextInt();

				boolean isDeleted = cc.deleteCustomer(deleteId);

				if (isDeleted) {

					System.out.println("Customer deleted successfully");
				}

				else {

					System.out.println("Customer not deleted");
				}

				break;

			case 5:
				System.out.println("Exit..");

				break;

			default:

				System.out.println("Invalid Choice");
			}
		}
	}

}
