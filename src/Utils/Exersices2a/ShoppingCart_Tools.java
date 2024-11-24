package Utils.Exersices2a;

import java.util.Scanner;

public class ShoppingCart_Tools {

    public static String getStringInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine().trim();
    }

    public static void calculateAndPrintCartDetails(String custName, String itemDesc, int quantity, double price, double tax) {
        double totalPrice = quantity * price * (1 + tax);
        String message = "Ο " + custName + " θέλει να αγοράσει " + quantity + " " + itemDesc + ".";
        System.out.println(message);
        System.out.println("Συνολικό κόστος με φόρο: " + String.format("%.2f", totalPrice) + " €");
    }
}
