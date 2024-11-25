package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VendingMascine_Tools {

    public static int getValidInteger(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            try {
                value = scanner.nextInt();
                scanner.nextLine();
                if (value < 0) {
                    System.out.println("Value must be non-negative. Try again.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static double getValidDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            try {
                value = scanner.nextDouble();
                scanner.nextLine();
                if (value < 0) {
                    System.out.println("Value must be non-negative. Try again.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid decimal number.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static String getNonEmptyString(Scanner scanner, String prompt) {
        String value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextLine().trim();
            if (value.isEmpty()) {
                System.out.println("Input cannot be empty. Please try again.");
            } else {
                break;
            }
        }
        return value;
    }
}
