package Exercises.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Scanner scanner) {
        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();
        books.add(new Book(title));
        System.out.println("Book \"" + title + "\" has been added.");
    }

    public void addMember(Scanner scanner) {
        System.out.print("Enter the member's name: ");
        String name = scanner.nextLine();
        members.add(new Member(name));
        System.out.println("Member \"" + name + "\" has been added.");
    }

    public boolean isReadyForTransactions() {
        return !books.isEmpty() && !members.isEmpty();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void displayMenu(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add more books");
            System.out.println("2. Add more members");
            if (isReadyForTransactions()) {
                System.out.println("3. Make a transaction");
            }
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number from the menu.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    addMember(scanner);
                    break;
                case 3:
                    if (isReadyForTransactions()) {
                        new Transaction(this, scanner).displayTransactionMenu();
                    } else {
                        System.out.println("Add at least one book and one member to proceed to transactions.");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the library system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from the menu.");
            }
        }
    }
}
