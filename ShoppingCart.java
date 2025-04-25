import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices;
    private Map<String, Double> cartItems;
    private Map<String, Double> sortedCartItems;

    public ShoppingCart() {
        this.productPrices = new HashMap<>();
        this.cartItems = new LinkedHashMap<>();
        this.sortedCartItems = new TreeMap<>((item1, item2) -> Double.compare(cartItems.get(item1), cartItems.get(item2)));
    }

    // Add a product to the cart with the given product name and quantity
    public void addProductToCart(String productName, int quantity) {
        if (productPrices.containsKey(productName)) {
            double price = productPrices.get(productName);
            double totalPrice = price * quantity;
            cartItems.put(productName, totalPrice);
            sortedCartItems.put(productName, totalPrice);
        } else {
            System.out.println("Product " + productName + " not found.");
        }
    }

    // Display all products in the cart in the order they were added
    public void displayCartItemsInOrderOfAddition() {
        System.out.println("Cart Items (Order of Addition):");
        for (Map.Entry<String, Double> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

    // Display all products sorted by price
    public void displayCartItemsSortedByPrice() {
        System.out.println("Cart Items (Sorted by Price):");
        for (Map.Entry<String, Double> entry : sortedCartItems.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

    // Add some sample products and their prices
    public void addProductPrice(String productName, double price) {
        productPrices.put(productName, price);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Sample product prices
        cart.addProductPrice("Laptop", 999.99);
        cart.addProductPrice("Smartphone", 599.99);
        cart.addProductPrice("Headphones", 199.99);
        cart.addProductPrice("Monitor", 299.99);

        // Adding products to the cart
        cart.addProductToCart("Laptop", 1);
        cart.addProductToCart("Smartphone", 2);
        cart.addProductToCart("Headphones", 1);
        cart.addProductToCart("Monitor", 1);

        // Display the cart items
        cart.displayCartItemsInOrderOfAddition();
        cart.displayCartItemsSortedByPrice();
    }
}
