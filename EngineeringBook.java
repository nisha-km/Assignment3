package encapAndInheritanceAss;

public class EngineeringBook extends Book {
private String category;

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public static void main(String[] args) {
	EngineeringBook book=new EngineeringBook();
	book.setAuthor("James Gosling");
	book.setBookNo(121);
	book.setPrice(500);
	book.setTitle("JAVA");
	System.out.println(book.getAuthor());
	System.out.println(book.getBookNo());
	System.out.println(book.getPrice());
	System.out.println(book.getTitle());
	
	       
}
}
