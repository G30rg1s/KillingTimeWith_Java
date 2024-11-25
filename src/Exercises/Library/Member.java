package Exercises.Library;

public class Member {
    private String name;
    private Book book;

    public Member(String name) {
        this.name = name;
        this.book = null;
    }

    public void addBook(Book book) {
        if (book.isAvailable() && this.book == null) {
            this.book = book;
            book.setAvailable(false);
            System.out.println(name + " δανείστηκε το βιβλίο: " + book.getTitle());
        } else if (!book.isAvailable()) {
            System.out.println("Το βιβλίο " + book.getTitle() + " δεν είναι διαθέσιμο.");
        } else {
            System.out.println(name + " έχει ήδη δανειστεί βιβλίο και δεν μπορεί να πάρει άλλο.");
        }
    }

    public void returnBook() {
        if (this.book != null) {
            System.out.println(name + " επέστρεψε το βιβλίο: " + book.getTitle());
            this.book.setAvailable(true);
            this.book = null;
        } else {
            System.out.println(name + " δεν έχει βιβλίο να επιστρέψει.");
        }
    }

    public String getMemberInformation() {
        if (this.book != null) {
            return name + " έχει δανειστεί το βιβλίο: " + book.getTitle();
        } else {
            return name + " δεν έχει δανειστεί βιβλίο.";
        }
    }

    public boolean hasBook() {
        return this.book != null;
    }

    public String getName() {
        return name;
    }
}
