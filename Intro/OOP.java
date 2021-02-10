class Book{
	public String title;
	public String author;
	public static String staticAttribute = "My static Attribute";

	public void readBook(){
		System.out.println("Reading " + this.title + " by " + this.author);
	}
}

public class OOP{
	public static void main(String [] args){

		Book book1 = new Book();
		book1.title = "Harry Potter";
		book1.author = "JK Rowling";

		book1.readBook();
		System.out.println(book1.title);
		System.out.println(Book.staticAttribute);
	}
}