package Exercises.VendingMachine.ProductsInMachine;

import java.util.ArrayList;

public class AllProducts {
    private ArrayList<SingleProduct> products;

    public AllProducts() {
        products = new ArrayList<>();
        products.add(new SingleProduct("Coca Cola", 0.60, 10));
        products.add(new SingleProduct("Sprite", 0.70, 15));
        products.add(new SingleProduct("Fanta", 0.50, 5));
        System.out.println("Initialized with default products.");
    }

    public void addProduct(String name, double price, int quantity) {
        products.add(new SingleProduct(name, price, quantity));
        System.out.println("Product added: " + name);
    }

    public void printAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("\nAvailable Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.print((i + 1) + ". ");
            products.get(i).printProductDetails();
        }
    }

    public ArrayList<SingleProduct> getAllProducts() {
        return products;
    }

    private SingleProduct findProductByName(String productName) {
        for (SingleProduct product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }

    public void increaseProductQuantity(String productName, int amount) {
        SingleProduct product = findProductByName(productName);
        if (product != null) {
            product.increaseQuantity(productName, amount);
        } else {
            System.out.println("Product not found: " + productName);
        }
    }

    public void decreaseProductQuantity(String productName, int amount) {
        SingleProduct product = findProductByName(productName);
        if (product != null) {
            product.decreaseQuantity(productName, amount);
        } else {
            System.out.println("Product not found: " + productName);
        }
    }

    public boolean productExists(String productName) {
        for (SingleProduct product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }
}

