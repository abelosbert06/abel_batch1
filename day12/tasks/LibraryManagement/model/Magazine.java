package LibraryManagement.model;

public class Magazine extends LibraryItem {

    private String issueDate;

    public Magazine(int id, String title, String issueDate) {
        super(id, title);
        this.issueDate = issueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public void displayDetails() {
        IO.println(
            "[Magazine] ID: " +
                getId() +
                " Title: " +
                getTitle() +
                " Issue Date: " +
                issueDate +
                " Available: " +
                isAvailable()
        );
    }
}
