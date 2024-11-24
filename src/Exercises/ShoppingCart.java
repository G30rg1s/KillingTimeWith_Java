package Exercises;

import Utils.Exersices2a.General_2a_Tools;
import Utils.Exersices2a.ShoppingCart_Tools;

public class ShoppingCart {
    private String custName;
    private String itemDesc;
    private int quantity;
    private double price;
    private double tax;

    public ShoppingCart(String custName, String itemDesc, int quantity, double price, double tax) {
        this.custName = custName;
        this.itemDesc = itemDesc;
        this.quantity = quantity;
        this.price = price;
        this.tax = tax;
        ShoppingCart_Tools.calculateAndPrintCartDetails(custName, itemDesc, quantity, price, tax);
    }

    public ShoppingCart() {
        this.custName = ShoppingCart_Tools.getStringInput("Enter customer name: ");
        this.itemDesc = ShoppingCart_Tools.getStringInput("Enter item description: ");
        this.quantity = General_2a_Tools.getIntegerInput("Enter quantity: ");
        this.price = General_2a_Tools.getDoubleInput("Enter price: ");
        this.tax = General_2a_Tools.getDoubleInput("Enter tax: ");

        ShoppingCart_Tools.calculateAndPrintCartDetails(custName, itemDesc, quantity, price, tax);
    }
}
