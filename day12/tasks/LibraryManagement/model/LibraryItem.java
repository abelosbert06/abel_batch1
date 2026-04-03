package LibraryManagement.model;

public abstract class LibraryItem {

    private int id;
    private String title;
    private boolean isAvailable;

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void changeStatus() {
        isAvailable = isAvailable ? false : true;
    }

    LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true;
    }

    abstract void displayDetails();
}
