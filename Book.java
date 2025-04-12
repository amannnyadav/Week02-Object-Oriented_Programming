public class Book {
    private static String libraryName = "Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibrary() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBook() {
        if (this instanceof Book) {
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe", "1234567890");
        Book book2 = new Book("Data Structures", "Jane Smith", "0987654321");

        book1.displayBook();
        System.out.println();
        book2.displayBook();

        displayLibrary();
    }
}





