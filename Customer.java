package aggregationandEncapsulation;


public class Customer {
	private String name;
	private Address residentialAddress;
	private Address officialAddress;
	
	public Customer(String name, Address residentialAddress, Address officialAddress) {
		this.name = name;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public Address getOfficialAddress() {
		return officialAddress;
	}

	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}
	

	public void getCustomerDetails() {
		System.out.println("Customer :"+name);
		System.out.println("Residential Address :"+residentialAddress.getAddessLine() +" "+residentialAddress.getCity());
		System.out.println("Official Address :"+officialAddress.getAddessLine() +" "+officialAddress.getCity());
	}
}
