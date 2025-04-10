import java.util.Scanner;

class CartItem {
    
	private String itemName;
	private double price;
	private int quantity;
	
	public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
	
	 public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
	
	public void addQuantity(int qty) {
        this.quantity += qty;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}
public class ShoppingCart {
    private CartItem[] items;
    private int itemCount;

    public ShoppingCart() {
        items = new CartItem[10]; 
        itemCount = 0;
    }

    public void addItem(String itemName, double price, int quantity) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getItemName().equals(itemName)) {
                items[i].addQuantity(quantity);
                return;
            }
        }
        if (itemCount < items.length) {
            items[itemCount++] = new CartItem(itemName, price, quantity);
        } else {
            System.out.println("Cart is full!");
        }
    }

    public void removeItem(String itemName) {
        int indexToRemove = -1;
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getItemName().equals(itemName)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            System.out.println("Item not found in cart!");
            return;
        }

        CartItem[] newItems = new CartItem[items.length];
        int j = 0;
        for (int i = 0; i < itemCount; i++) {
            if (i != indexToRemove) {
                newItems[j++] = items[i];
            }
        }
        items = newItems;
        itemCount--;
        System.out.println("Item removed successfully.");
    }

    public void displayCart() {
        if (itemCount == 0) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Shopping Cart:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].getItemName() + " - " + items[i].getQuantity() + " x " + items[i].getPrice());
        }
    }

    public double totalCost() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getTotalPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Show Cart");
            System.out.println("4. Total Cost");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scn.nextInt();
            scn.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scn.nextLine();
                    System.out.print("Enter price: ");
                    double price = scn.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scn.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeItem = scn.nextLine();
                    cart.removeItem(removeItem);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.println("Total Cost: $" + cart.totalCost());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scn.close();
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
