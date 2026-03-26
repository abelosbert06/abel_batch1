import java.util.ArrayList;

public class LibraryManagement {

    public static void main(String[] args) {
        Book b1 = new Book(
            101,
            "The Fellowship of the Ring",
            new Author("J.R.R. Tolkien"),
            "1954-07-29",
            new Series("The Lord of the Rings"),
            "Fantasy"
        );

        Book b2 = new Book(
            102,
            "Mistborn: The Final Empire",
            new Author("Brandon Sanderson"),
            "2006-07-17",
            new Series("Mistborn"),
            "Epic Fantasy"
        );

        Book b3 = new Book(
            103,
            "Crime and Punishment",
            new Author("Fyodor Dostoevsky"),
            "1866-01-01",
            null,
            "Psychological Fiction"
        );

        Magazine m1 = new Magazine(
            501,
            "National Geographic",
            new Author("Various Authors"),
            "2023-10-01",
            null,
            "Science",
            "October Issue"
        );

        IO.println("Books in the library: ");
        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
        m1.displayInfo();
    }
}

class Book {

    int bookId;
    String title;
    Author author;
    String releaseDate;
    Series series;
    String genre;

    public Book(
        int bookId,
        String title,
        Author author,
        String releaseDate,
        Series series,
        String genre
    ) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.series = series;
        this.genre = genre;
    }

    void displayInfo() {
        String authorName = (author != null) ? author.name : "Unknown Author";
        String seriesName = (series != null) ? series.name : "Standalone";

        IO.println(
            bookId +
                "  " +
                title +
                "  " +
                authorName +
                "  " +
                releaseDate +
                "  " +
                seriesName +
                "  " +
                genre
        );
    }
}

class Magazine extends Book {

    String issue;

    public Magazine(
        int bookId,
        String title,
        Author author,
        String releaseDate,
        Series series,
        String genre,
        String issue
    ) {
        super(bookId, title, author, releaseDate, series, genre);
        this.issue = issue;
    }

    void displayInfo() {
        super.displayInfo();
        IO.println("Issue: " + issue);
    }
}

class Series {

    String name;
    ArrayList<Book> seriesBooks;

    public Series(String name) {
        this.name = name;
        this.seriesBooks = new ArrayList<>();
    }
}

class Author {

    String name;
    ArrayList<Book> booksWritten;

    public Author(String name) {
        this.name = name;
        this.booksWritten = new ArrayList<>();
    }
}
