import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Product scope part
// Define a Product class to store product information
class Product {  //setting product informations
    private int productId;
    private String name;
    private double price; 

     // Initialization 
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
}
// ====================================================================================================
//ShoppingCart scope part
//ShoppingCart class to manage items in the cart
class ShoppingCart {
    private List<Product> items; //setting a List to store products in the cart

    public ShoppingCart() {
        items = new ArrayList<>(); // Initialize an empty list for items
    }

    //Tools
    public void addItem(Product product) {
        items.add(product); // Add a product to the cart
    }

    public void removeItem(Product product) {
        items.remove(product); // Remove a product from the cart
    }

    // ++Other methods for calculating total price, displaying items, etc.++
}
// ====================================================================================================
//The Main class
public class ECommerceStore {
    public static void main(String[] args) {
        // Create some sample products
        Product laptop = new Product(1, "Laptop", 999.99); // Create a laptop product
        Product phone = new Product(2, "Smartphone", 499.99); // Create a smartphone product

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart(); // Initialize an empty shopping cart
        cart.addItem(laptop); // Add the laptop to the cart
        cart.addItem(phone); // Add the smartphone to the cart

        // Display cart contents and total price
        System.out.println("Items in the cart:");
        for (Product item : cart.getItems()) {
            System.out.println(item.getName() + " - $" + item.getPrice()); // Print product name and price
        }
        System.out.println("Total price: $" + calculateTotalPrice(cart)); // Print total price
    }

    // Method to calculate total price of items in the cart
    private static double calculateTotalPrice(ShoppingCart cart) {
        double total = 0;
        for (Product item : cart.getItems()) {
            total += item.getPrice(); // Add each product's price to the total
        }
        return total; // Return the total price
    }
}