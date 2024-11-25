package Exercises.VendingMachine.Menus;

import Exercises.VendingMachine.ProductsInMachine.AllProducts;
import Exercises.VendingMachine.Users.Employee;
import Utils.VendingMascine_Tools;

import java.util.Scanner;

public class EmployeeMenu {
    private AllProducts allProducts;
    private Employee employee;

    public EmployeeMenu(AllProducts allProducts) {
        this.allProducts = allProducts;
        this.employee = new Employee("1234");
    }

    public void displayMenu(Scanner scanner) {
        String enteredPassword = VendingMascine_Tools.getNonEmptyString(scanner, "Enter employee password (1234): ");

        if (enteredPassword.equals(employee.getPassword())) {
            boolean managing = true;
            while (managing) {
                System.out.println("\nEmployee Menu:");
                System.out.println("1. Increase product quantity");
                System.out.println("2. Add a new product");
                System.out.println("3. Exit to main menu");

                int employeeChoice = VendingMascine_Tools.getValidInteger(scanner, "Enter your choice: ");

                switch (employeeChoice) {
                    case 1:
                        increaseProductQuantity(scanner);
                        break;
                    case 2:
                        addNewProduct(scanner);
                        break;
                    case 3:
                        managing = false;
                        System.out.println("Returning to main menu.");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Incorrect password. Returning to main menu.");
        }
    }

    private void increaseProductQuantity(Scanner scanner) {
        allProducts.printAllProducts();
        String productName = VendingMascine_Tools.getNonEmptyString(scanner, "Enter the name of the product to increase quantity: ");
        int amount = VendingMascine_Tools.getValidInteger(scanner, "Enter the amount to increase: ");
        allProducts.increaseProductQuantity(productName, amount);
    }

    private void addNewProduct(Scanner scanner) {
        while (true) {
            String productName = VendingMascine_Tools.getNonEmptyString(scanner, "Enter the name of the new product: ");

            if (allProducts.productExists(productName)) {
                System.out.println("Product with the name \"" + productName + "\" already exists. Please try again.");
                continue;
            }
            double price = VendingMascine_Tools.getValidDouble(scanner, "Enter the price of the new product: ");
            int quantity = VendingMascine_Tools.getValidInteger(scanner, "Enter the initial quantity of the new product: ");
            allProducts.addProduct(productName, price, quantity);
            System.out.println("Product \"" + productName + "\" has been added successfully.");
            break;
        }
    }
}
