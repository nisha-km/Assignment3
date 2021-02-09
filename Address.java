package assignment3;

public class Address {
	private String addessLine;
	private String city;
	
	

	public Address(String addessLine, String city) {
		super();
		this.addessLine = addessLine;
		this.city = city;
	}

	public String getAddessLine() {
		return addessLine;
	}



	public void setAddessLine(String addessLine) {
		this.addessLine = addessLine;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}


}
