
package library;

/**
 * Represents an item in the library catalogue.
 *
 * TODO: Implement this class exactly as specified in the UML diagram
 *       and the behaviour specification in practical_instructions.md.
 */
public class LibraryItem {

    // TODO: Declare private fields:
    //   - title        (String)
    //   - isbn         (String)
    //   - year         (int)
    //   - isCheckedOut (boolean)

    private String title;
    private String isbn;
    private int year;
    private boolean isCheckedOut;


    // TODO: Constructor — LibraryItem(String title, String isbn, int year)
    //   isCheckedOut must default to false.
    public LibraryItem(String title, String isbn, int year) {
        this.title = title;
        this.isbn = isbn;
        this.year = year;
        boolean isCheckedOut false;
    }


    // TODO: Getters — getTitle(), getIsbn(), getYear(), isCheckedOut()
    String getTitle() {
        return title;
    }

    String getIsbn() {
        return isbn;
    }

    int getYear() {
        return year;
    }


    // TODO: checkOut()
    //   Sets isCheckedOut to true.
    //   Throws IllegalStateException("Item is already checked out.") if already true.
    void checkout() {
        if (isCheckedOut == true) {
            throw new IllegalStateException("Item is already checked out.");
        }
        isCheckedOut = true;
    }    


    // TODO: returnItem()
    //   Sets isCheckedOut to false.
    //   Throws IllegalStateException("Item is not currently checked out.") if already false.
    void returnItem() {
        if (isCheckedOut == false) {
            throw new IllegalStateException("Item is not currently checked out.");
        }
        isCheckedOut = false;
    }


    // TODO: setYear(int year)
    //   Throws IllegalArgumentException if year < 1440 or year > current year.
    void setYear(int year) {
        if (year < 1440 || year > this.year) {
            throw new IllegalArgumentException();
        }
        this.year = year;
    }


    // TODO: getSummary()
    //   Returns: "[title] ([year]) — ISBN: [isbn]"
    String getSummary() {
        int tempYear = getYear();
        return "[" + getTitle()+ "] ([" + tempYear + "]) - ISBN: [" + getIsbn() + "]";
    }

}
