class Book{
	public String title;
	private String author;
	public Book(){
		this.title = "no title";
		this.author = "no author";
	}
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	public void readBook(){
		System.out.println("Reading " + this.title + " by " + this.author);
	}
	public String getAuthor(){
		return this.author;
	}
	public void setAuthor(String author){
		this.author = author;
	}
}

public class Constructor{
	public static void main(String [] args)
	{


		Book book1 = new Book("Harry Potter", "JK Rowling");
		System.out.println(book1.getAuthor);
		Book book2 = new Book("Lord of the Rings", "JRR Tolkien");
		System.out.println(book2.title);
	}
}