package Exercises.Library;

import Utils.Library_Tools;
import java.util.Scanner;

public class Transaction {
    private Library library;
    private Scanner scanner;

    public Transaction(Library library, Scanner scanner) {
        this.library = library;
        this.scanner = scanner;
    }

    private void addBookToMember() {
        System.out.print("Enter the member's name: ");
        String memberName = scanner.nextLine();

        Member member = Library_Tools.findMemberByName(library.getMembers(), memberName);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        if (member.hasBook()) {
            System.out.println(member.getName() + " already has a book and cannot borrow another.");
            return;
        }

        System.out.print("Enter the book title: ");
        String bookTitle = scanner.nextLine();

        Book book = Library_Tools.findBookByTitle(library.getBooks(), bookTitle);
        if (book == null) {
            System.out.println("Book not found.");
        } else if (!book.isAvailable()) {
            System.out.println("Book \"" + book.getTitle() + "\" is not available.");
        } else {
            member.addBook(book);
        }
    }

    private void returnBookFromMember() {
        System.out.print("Enter the member's name: ");
        String memberName = scanner.nextLine();

        Member member = Library_Tools.findMemberByName(library.getMembers(), memberName);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        if (!member.hasBook()) {
            System.out.println(member.getName() + " has no book to return.");
        } else {
            member.returnBook();
        }
    }

    public void displayTransactionMenu() {
        boolean running = true;

        while (running) {
            System.out.println("\nTransaction Menu:");
            System.out.println("1. Add a book to a member");
            System.out.println("2. Return a book from a member");
            System.out.println("3. Exit to main menu");

            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number from the menu.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBookToMember();
                    break;
                case 2:
                    returnBookFromMember();
                    break;
                case 3:
                    running = false;
                    System.out.println("Returning to main menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from the menu.");
            }
        }
    }

}
