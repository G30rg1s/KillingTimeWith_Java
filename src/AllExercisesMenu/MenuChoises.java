package AllExercisesMenu;

import java.util.Scanner;
import Exercises.Casting;
import Exercises.Farmers.BrownEggs;
import Exercises.Farmers.FredEggs;
import Exercises.Library.AnotherDayInTheLibrary;
import Exercises.RockPaperScissors.Play_RockPaperScissors;
import Exercises.ShoppingCart;
import Exercises.VendingMachine.Menus.MainMenu;

public class MenuChoises {

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an exercise to run:");
            System.out.println("1. Casting");
            System.out.println("2. Brown Eggs");
            System.out.println("3. Fred Eggs");
            System.out.println("4. Shopping Cart");
            System.out.println("5. Prefiled ex.2a");
            System.out.println("6. Rock-Paper-Scissors");
            System.out.println("7. Another Day In the Library");
            System.out.println("8. Feeling thirsty or hungry? Try the Vending Machine");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("\nRunning Casting...");
                    new Casting();
                    break;
                case 2:
                    System.out.println("\nRunning Brown Eggs...");
                    new BrownEggs();
                    break;
                case 3:
                    System.out.println("\nRunning Fred Eggs...");
                    new FredEggs();
                    break;
                case 4:
                    System.out.println("\nRunning Shopping Cart...");
                    new ShoppingCart();
                    break;
                case 5:
                    System.out.println("\nRunning prefiled ex.2a...");
                    new Casting(42, 123.456);
                    new BrownEggs(5, 3);
                    new FredEggs(100, 121, 117);
                    new ShoppingCart("Alex", "shirts", 2, 12.99, 0.24);
                    break;
                case 6:
                    System.out.println("\nRunning Rock-Paper-Scissors...");
                    new Play_RockPaperScissors();
                    break;
                case 7:
                    System.out.println("\nRunning Library...");
                    new AnotherDayInTheLibrary();
                    //MainMenu mainMenu = new MainMenu();
                   // mainMenu.displayMenu();
                    break;
                case 8:
                    System.out.println("\nRunning Vending Machine...");
                    MainMenu mainMenu = new MainMenu();
                    mainMenu.displayMenu();
                    break;
                case 9:
                    System.out.println("Exiting the program. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 6.");
            }
        }
        scanner.close();
    }
}
