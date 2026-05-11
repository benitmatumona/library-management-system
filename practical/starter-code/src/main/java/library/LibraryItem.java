package library;

/**
 * Represents an item in the library catalogue.
 *
 * TODO: Implement this class exactly as specified in the UML diagram
 *       and the behaviour specification in practical_instructions.md.
 */
public class LibraryItem {

    // TODO: Declare private fields:
    private String title;
    private String isbn;
    private int year;
    private boolean isCheckedOut;

    // TODO: Constructor — LibraryItem(String title, String isbn, int year)
    public LibraryItem(String title, String isbn, int year) {
        this.title = title;
        this.isbn = isbn;
        this.year = year;
        this.isCheckedOut = false;
    }
    //   isCheckedOut must default to false.


    // TODO: Getters — getTitle(), getIsbn(), getYear(), isCheckedOut()

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    // TODO: checkOut()
    //   Sets isCheckedOut to true.
    //   Throws IllegalStateException("Item is already checked out.") if already true.

    public void checkedOut(boolean checkedOut) {
        if (isCheckedOut == true) throw new IllegalStateException("Item is already checked out.")
        this.isCheckedOut = checkedOut;
    }


    // TODO: returnItem()
    //   Sets isCheckedOut to false.
    //   Throws IllegalStateException("Item is not currently checked out.") if already false.

    public void returnItem(boolean notCheckedOut) {
        if (isCheckedOut == false) throw new IllegalStateException("Item is not currently checked out.")
        this.isCheckedOut = notCheckedOut;
    }


    // TODO: setYear(int year)
    //   Throws IllegalArgumentException if year < 1440 or year > current year.

    public void setYear(int Year) {
        if (Year < 1440 || Year > 2026) throw new IllegalArgumentException("Year is invalid.")
    }


    // TODO: getSummary()
    //   Returns: "[title] ([year]) — ISBN: [isbn]"

    public String getSummary() {
        return title + year + "— ISBN: " + isbn
    }

}
