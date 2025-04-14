
class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + "\nBio: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author("Effective Java", 2008, "Joshua Bloch", "Author of Effective Java and Java Expert");
        author.displayInfo();
    }
}




