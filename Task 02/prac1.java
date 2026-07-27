import java.util.Scanner;

class Book {
    String title;
    String author;
    boolean issued;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }   

    void issueBook() {
        issued = true;
    }

    void displayInfo() {
        System.out.println("Author name : " + author);
        System.out.println("Title       : " + title);
        System.out.println("Book Issued : " + issued);
    }

}

public class prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String authorname = sc.nextLine();
        String titlename = sc.nextLine();

        Book book = new Book(titlename, authorname);

        book.issueBook();
        book.displayInfo();

    }
}
