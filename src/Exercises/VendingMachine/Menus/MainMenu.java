package Exercises.VendingMachine.Menus;

import Exercises.VendingMachine.ProductsInMachine.AllProducts;
import Exercises.VendingMachine.AcceptedMoney.AcceptedCoins;
import Utils.VendingMascine_Tools;
import java.util.Scanner;

public class MainMenu {
    private AllProducts allProducts;
    private EmployeeMenu employeeMenu;
    private CustomerMenu customerMenu;

    public MainMenu() {
        this.allProducts = new AllProducts();
        this.employeeMenu = new EmployeeMenu(allProducts);
        this.customerMenu = new CustomerMenu(allProducts, new AcceptedCoins());
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the Vending Machine!");
            System.out.println("================================");
            allProducts.printAllProducts();
            System.out.println("\nOptions:");
            System.out.println("1. Buy a product (Customer)");
            System.out.println("2. Manage products (Employee)");
            System.out.println("3. Exit");

            int choice = VendingMascine_Tools.getValidInteger(scanner, "Enter your choice: ");

            switch (choice) {
                case 1:
                    customerMenu.displayMenu(scanner);
                    break;
                case 2:
                    employeeMenu.displayMenu(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the vending machine. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
