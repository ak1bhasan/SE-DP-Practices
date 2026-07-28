import java.util.Scanner;

class libraryBook{
    String book;
    String author;
    double price;

    // libraryBook(String book, String author, double price) {
    //     this.book = book;
    //     this.author = author;
    //     this.price = price;
    // }

    // Method

    void inputBookInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book name : ");
        book = sc.nextLine();

        System.out.println("Enter Author name : ");
        author = sc.nextLine();

        System.out.println("Enter price of the Book : ");
        price = sc.nextDouble();
    }

    void displayBookInfo() {
        System.out.println("Book name : " + book);
        System.out.println("Author name : " + author);
        System.out.println("Price : " + price);

    }

    void discountPrice() {
        double discountedPrice = price - ( price * 0.15 );
        System.out.println("Discounted Price : " + discountedPrice);
    }

}

public class prac4 {
    public static void main(String[] args) {
        libraryBook lab = new libraryBook();

        lab.inputBookInfo();
        lab.displayBookInfo();
        lab.discountPrice();

    }
}
