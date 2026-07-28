import java.util.Scanner;

class Item {
    String name;
    double price;
    int quantity;

    // Constructor

    Item (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }

}

class ShoppingCart{
    Item item1;
    Item item2;

    // Constructor

    ShoppingCart(Item item1, Item item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    void printBill() {
        System.out.println(item1.name + " = " + item1.price + " x " +
            item1.quantity + " = " + item1.getTotalPrice()
        );

        System.out.println(item2.name + " = " + item2.price + " x " +
            item2.quantity + " = " + item2.getTotalPrice()
        );

        double total = item1.getTotalPrice() + item2.getTotalPrice();
        System.out.println("Total Price : " + total);
    }
}

public class prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Item 1 name : ");
        String name1 = sc.next();

        System.out.println("Enter Item 1 Price : ");
        double price1 = sc.nextDouble();

        System.out.println("Enter Item 1 Quantity : ");
        int quantity1 = sc.nextInt();

        System.out.println("Enter Item 2 name : ");
        String name2 = sc.next();

        System.out.println("Enter Item 2 Price : ");
        double price2 = sc.nextDouble();

        System.out.println("Enter Item 2 Quantity : ");
        int quantity2 = sc.nextInt();

        Item item1 = new Item(name1, price1, quantity1);
        Item item2 = new Item(name2, price2, quantity2);

        ShoppingCart shop = new ShoppingCart(item1, item2);

        shop.printBill();
    }
}