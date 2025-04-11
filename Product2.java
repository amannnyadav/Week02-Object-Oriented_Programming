public class Product2{

    String productName;
    int price;
    static int totalProducts;
    
    Product2(String productName, int price){
          this.productName = productName;
          this.price = price;
          totalProducts++;
    }
    
    void displayProductDetails(){
          System.out.println(productName);
          System.out.println(price);
    }
    
    void displayTotalProducts(){
          System.out.println(totalProducts);
    }

    public static void main(String[] args){
          Product2 p1 = new Product2("Milk", 10);
          Product2 p2 = new Product2("Lays", 10);
          
          p1.displayProductDetails();
          p2.displayProductDetails();
          p1.displayTotalProducts();
    }
}


