package library;

/**
 * Represents a physical book — a specific type of LibraryItem.
 *
 * TODO: Implement this class exactly as specified in the UML diagram.
 *       This class must extend LibraryItem.
 */
public class Book extends LibraryItem {

    // TODO: Declare private fields: author (String), pages (int)
    private String author;
    private int pages;


    // TODO: Constructor — Book(String title, String isbn, int year, String author, int pages)
    //   Use super(...) to pass the correct arguments to LibraryItem.
    public Book(String title, String isbn, int year, String author, int pages) {
        super(title,isbn,year);
        this.author=author;
        this.pages=pages;
    }


    // TODO: Getters — getAuthor(), getPages()
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }


    // TODO: @Override getSummary()
    //   Returns: "[title] ([year]) by [author], [pages] pages — ISBN: [isbn]"
    //   Use the inherited getters to access LibraryItem fields.
    @Override
    public String getSummary() {
        return getTitle() + "( " + getYear() + ")" + "by " + getAuthor()  + "," + getPages() + "pages - ISBN : " +
                getIsbn();
    }

}
