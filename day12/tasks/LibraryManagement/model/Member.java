package LibraryManagement.model;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private int memberId;
    private String name;
    private List<LibraryItem> borrowedItems;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public void borrowItem(LibraryItem item) {
        if (item.isAvailable()) {
            borrowedItems.add(item);
            item.changeStatus();
            IO.println(
                name + " successfully borrowed: " + item.getTitle()
            );
        } else {
            IO.println(
                "Error: " + item.getTitle() + " is already checked out."
            );
        }
    }

    public void returnItem(LibraryItem item) {
        if (borrowedItems.contains(item)) {
            borrowedItems.remove(item);
            item.changeStatus();
            IO.println(name + " returned " + item.getTitle());
        } else {
            IO.println("This member does not have this item.");
        }
    }

    public void displayMemberInfo() {
        IO.println("Member ID: " + memberId + " Name: " + name);
        IO.println("Items currently borrowed: " + borrowedItems.size());
        for (LibraryItem item : borrowedItems) {
            IO.println("* " + item.getTitle());
        }
    }
}
