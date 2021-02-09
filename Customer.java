package assignment3;

public class Customer {

	private String name;
	private Address address;

	public Customer() {
		
	}

	public Customer(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void getCustomerDetails() {
		System.out.println("Customer :"+name);
		System.out.println("Residential Address :"+address.getAddessLine()+" " +address.getCity());
	}
}
