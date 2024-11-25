package Exercises.VendingMachine.ProductsInMachine;

public class SingleProduct {
    private String name;
    private double price;
    private int quantity;

    public SingleProduct(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void printProductDetails() {
        System.out.println("Product: " + name + ", Price: €" + String.format("%.2f", price) + ", Quantity: " + quantity);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(String productName, int amount) {
        if (this.name.equalsIgnoreCase(productName)) {
            if (amount > 0) {
                this.quantity += amount;
                System.out.println("Increased quantity of " + name + " by " + amount + ". New quantity: " + quantity);
            } else {
                System.out.println("Invalid increase amount. Must be greater than 0.");
            }
        } else {
            System.out.println("Product name does not match: " + productName);
        }
    }

    public void decreaseQuantity(String productName, int amount) {
        if (this.name.equalsIgnoreCase(productName)) {
            if (amount > 0 && amount <= quantity) {
                this.quantity -= amount;
                System.out.println("Decreased quantity of " + name + " by " + amount + ". New quantity: " + quantity);
            } else if (amount > quantity) {
                System.out.println("Cannot decrease quantity. Not enough stock available for " + name + ".");
            } else {
                System.out.println("Invalid decrease amount. Must be greater than 0.");
            }
        } else {
            System.out.println("Product name does not match: " + productName);
        }
    }
}
