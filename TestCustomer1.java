package aggregationandEncapsulation;

public class TestCustomer1{

	public static void main(String[] args) {
		
		Address residentialAddress=new Address("Ist Main HSR Layout", "Bangalore");
		Address officialAddress=new Address("Ist Main Electronics city", "Bangalore");
		
		Customer customer = new Customer("John", residentialAddress, officialAddress);
		
		customer.getCustomerDetails();
	}
}
