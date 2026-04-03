package LibraryManagement;

import LibraryManagement.model.*;
import LibraryManagement.exceptions.LibraryException;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        LibraryItem book1 = new Book(101, "Lord Of The Rings", "J.R.R Tolkien", 500);
        LibraryItem book2 = new Book(102, "The Brothers Karamazov", "Fyodor Dostoevsky", 464);
        LibraryItem mag1 = new Magazine(201, "Digit", "March 2024");
        Member stan = new Member(1, "Stan");

        lib.addItem(book1);
        lib.addItem(book2);
        lib.addItem(mag1);
        lib.registerMember(stan);
        lib.displayAllItems();

        try {
            lib.processLoan(1, 102);
        } catch (LibraryException e) {
            IO.println(e.getMessage());
        }

        try {
            lib.processLoan(1, 102);
        } catch (LibraryException e) {
            IO.println(e.getMessage());
        }

        try {
            lib.processLoan(1, 999);
        } catch (LibraryException e) {
            IO.println(e.getMessage());
        }

        stan.returnItem(book2);

        lib.displayAllItems();

    }
}
