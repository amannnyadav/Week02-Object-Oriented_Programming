import java.util.Scanner;
class Book{
    private String title;
    private String author;
    private int price;
    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displayBook(){
        System.out.println("Book title is:"+title);
        System.out.println("Book author is:"+author);
        System.out.println("Book price is:"+price);
    }
}
public class BookMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book title:");
        String title=sc.nextLine();
        System.out.println("Enter the book author:");
        String author=sc.nextLine();
        System.out.println("Enter the book price:");
        int price=sc.nextInt();
        Book bookDetails=new Book(title, author, price);
        bookDetails.displayBook();
        sc.close();
    }
}
