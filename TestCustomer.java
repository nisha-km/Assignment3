package assignment3;

public class TestCustomer {
	
	public static void main(String[] args) {
		
		//By using constructor
		Address address = new Address("HSR Layout", "Bangalore");
		Customer customer1= new Customer("John", address);
		System.out.println("By using constructor");
		customer1.getCustomerDetails();
		
		//By using setter getter
		Customer customer2 = new Customer();
		customer2.setName("John");
		customer2.setAddress(address);
		System.out.println("By using setter getter");
		customer2.getCustomerDetails();
		

	}

}
