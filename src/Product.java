import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
      String productName;
     int productId;
     double price;
     int quantityInStock;
    public Product(String productName, int productId, double price, int quantityInStock) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty.");
        }
        if (productId <= 0) {
            throw new IllegalArgumentException("Product ID must be positive.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive.");
        }
        if (quantityInStock < 0) {
            throw new IllegalArgumentException("Quantity in stock cannot be negative.");
        }
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }

    public int getProductId() {
        return productId;
    }

}
class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    public Electronics(String productName, int productId, double price, int quantityInStock, String brand, int warrantyPeriod) {
        super(productName, productId, price, quantityInStock);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}


class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String productName, int productId, double price, int quantityInStock, String size, String material) {
        super(productName, productId, price, quantityInStock);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);




