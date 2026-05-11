package library;

/**
 * Represents a physical book — a specific type of LibraryItem.
 *
 * TODO: Implement this class exactly as specified in the UML diagram.
 *       This class must extend LibraryItem.
 */
public class Book extends LibraryItem {

    private String author;
    private int pages;

    public Book(String title, String isbn, int year, String author, int pages){
        super(title, isbn, year);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
    @Override
    public String getSummary(){
        return getTitle() + " (" +  getYear() + ") by " + author + ", " + pages + " pages — ISBN: " + getIsbn();
    }
}
