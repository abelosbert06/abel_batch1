package LibraryManagement.model;

import java.util.ArrayList;
import java.util.List;
import LibraryManagement.exceptions.LibraryException;

public class Library {
    private List<LibraryItem> inventory;
    private List<Member> members;

    public Library() {
        this.inventory = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        inventory.add(item);
        IO.println("Added '" + item.getTitle() + "' to inventory.");
    }

    public void registerMember(Member member) {
        members.add(member);
        IO.println("Registered member '" + member.getName() + "'.");
    }

    public LibraryItem findItemById(int id) {
        for (LibraryItem item : inventory) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void processLoan(int memberId, int itemId) throws LibraryException{
        Member member = null;
        for (Member m : members) {
            if (m.getMemberId() == memberId) {
                member = m;
                break;
            }
        }

        LibraryItem item = findItemById(itemId);

        if (member == null) {
            throw new LibraryException("Member ID " + memberId + " not found");
        }
        if (item == null) {
            throw new LibraryException("Item ID " + itemId + " not found");
        }

        if (item.isAvailable()) {
            member.borrowItem(item);
        } else {
            throw new LibraryException("Item '" + item.getTitle() + "' is already borrowed");
        }
    }

    public void displayAllItems() {
        System.out.println("\nCurrent Library Inventory: ");
        for (LibraryItem item : inventory) {
            item.displayDetails();
        }
    }
}
