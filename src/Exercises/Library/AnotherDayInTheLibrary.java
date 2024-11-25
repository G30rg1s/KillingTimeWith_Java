package Exercises.Library;

import java.util.Scanner;

public class AnotherDayInTheLibrary {

    public AnotherDayInTheLibrary() {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        library.displayMenu(scanner);
        //scanner.close();
    }
}
