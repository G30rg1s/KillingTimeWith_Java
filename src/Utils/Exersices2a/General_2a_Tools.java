package Utils.Exersices2a;

import java.util.Scanner;

public class General_2a_Tools {

    public static int getIntegerInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double getDoubleInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid double number.");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
