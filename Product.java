public class Product {
    private static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Product ID: " + productID);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 50000, 2, 101);
        Product product2 = new Product("PC", 200000, 5, 102);

        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();

        updateDiscount(15.0);

        System.out.println("\nAfter updating discount:");
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
    }
}
