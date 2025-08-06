package pious_1st;
class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter = 1000;
	final String library_name = "Central Library";
	public Book(String title, String author, int bookID){
		this.title = title;
		this.author = author;
		this.bookID = bookCounter++;
	}
	public void displayInfo() {
        System.out.println("Book Title: " + title + ", Author: " + author + ", Book ID: " + bookID);
    }
	public void displayInfo(boolean showLibrary) {
        System.out.println("Book Title: " + title + ", Author: " + author + ", Book ID: " + bookID);
        if (showLibrary) {
            System.out.println("Library: " + library_name);
        }
	}
	public static void displayTotalBooks() {
	       System.out.println("Total number of books: " + (bookCounter - 1000));
	    }
}
public class book_store {
	public static void main(String[] args) {
        Book book1 = new Book("Python Programming", "Jo");
        Book book2 = new Book("Java Programming", "D");
        Book book3 = new Book("Data Structures", "H");
        book1.displayInfo();
        book2.displayInfo(true); 
        book3.displayInfo(false); 
        Book.displayTotalBooks();
    }

}
