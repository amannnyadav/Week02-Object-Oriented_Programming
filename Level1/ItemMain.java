class Item{
    private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode,String itemName,double price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }

    public void displayDetails(){
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}


public class ItemMain {
    public static void main(String[] args) {
        Item item = new Item("A101", "Laptop", 799.99);
        item.displayDetails();
        int quantity = 3;
        System.out.printf("Total cost for %d items: %.2f",quantity, item.calculateTotalCost(quantity));
    }
}
