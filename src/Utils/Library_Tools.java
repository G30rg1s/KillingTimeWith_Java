package Utils;

import Exercises.Library.Book;
import Exercises.Library.Member;
import java.util.ArrayList;

public class Library_Tools {

    public static Book findBookByTitle(ArrayList<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public static Member findMemberByName(ArrayList<Member> members, String name) {
        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                return member;
            }
        }
        return null;
    }
}
