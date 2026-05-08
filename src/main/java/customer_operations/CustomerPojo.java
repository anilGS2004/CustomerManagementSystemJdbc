package customer_operations;

public class CustomerPojo {
	private int cid,age;
	private String name,email;
	private double balance;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public CustomerPojo(int cid, int age, String name, String email, double balance) {
		super();
		this.cid = cid;
		this.age = age;
		this.name = name;
		this.email = email;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "CustomerPojo [cid=" + cid + ", age=" + age + ", name=" + name + ", email=" + email + ", balance="
				+ balance + "]";
	}
	public CustomerPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
