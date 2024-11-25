package Exercises.VendingMachine.Menus;

import Exercises.VendingMachine.ProductsInMachine.AllProducts;
import Exercises.VendingMachine.ProductsInMachine.SingleProduct;
import Exercises.VendingMachine.AcceptedMoney.AcceptedCoins;
import Utils.VendingMascine_Tools;


import java.util.Scanner;

public class CustomerMenu {
    private AllProducts allProducts;
    private AcceptedCoins acceptedCoins;

    public CustomerMenu(AllProducts allProducts, AcceptedCoins acceptedCoins) {
        this.allProducts = allProducts;
        this.acceptedCoins = acceptedCoins;
    }

    public void displayMenu(Scanner scanner) {
        System.out.println("\nWelcome, Customer!");
        boolean shopping = true;

        while (shopping) {
            allProducts.printAllProducts();

            System.out.println("\nOptions:");
            System.out.println("1. Buy a product");
            System.out.println("2. Exit to main menu");

            int customerChoice = VendingMascine_Tools.getValidInteger(scanner, "Enter your choice: ");

            switch (customerChoice) {
                case 1:
                    buyProduct(scanner);
                    break;

                case 2:
                    shopping = false;
                    System.out.println("Returning to main menu.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void buyProduct(Scanner scanner) {
        String productName = VendingMascine_Tools.getNonEmptyString(scanner, "Enter the name of the product you want to buy: ");

        var product = findProductByName(productName);

        if (product == null) {
            System.out.println("Product not found. Please try again.");
            return;
        }

        if (product.getQuantity() <= 0) {
            System.out.println("Sorry, the product is out of stock.");
            return;
        }

        System.out.println("\nYou selected:");
        product.printProductDetails();

        double totalPrice = product.getPrice();
        double remainingAmount = totalPrice;

        System.out.println("\nTotal price: €" + String.format("%.2f", totalPrice));
        System.out.println("Please insert coins to cover the price.");
        acceptedCoins.printAcceptedCoins();

        while (remainingAmount > 0) {
            double insertedCoin = VendingMascine_Tools.getValidDouble(scanner, "Enter coin value: ");
            if (isValidCoin(insertedCoin)) {
                remainingAmount -= insertedCoin;
                if (remainingAmount > 0) {
                    System.out.println("Remaining amount: €" + String.format("%.2f", Math.max(remainingAmount, 0)));
                }
            } else {
                System.out.println("Invalid coin. Please insert a valid coin.");
            }
        }

        if (remainingAmount < 0) {
            double change = Math.abs(remainingAmount);
            System.out.println("\nTransaction complete. Your change: €" + String.format("%.2f", change));
        } else {
            System.out.println("\nTransaction complete. No change.");
        }

        allProducts.decreaseProductQuantity(product.getName(), 1);
        System.out.println("Thank you for your purchase!");
    }

    private boolean isValidCoin(double coinValue) {
        for (var coin : acceptedCoins.getCoins()) {
            if (Math.abs(coinValue - coin.getValue()) < 0.001) {
                return true;
            }
        }
        return false;
    }

    private SingleProduct findProductByName(String productName) {
        for (var product : allProducts.getAllProducts()) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }
}
