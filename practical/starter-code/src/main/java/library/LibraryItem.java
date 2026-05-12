package library;


/**
 * Represents an item in the library catalogue.
 *
 * TODO: Implement this class exactly as specified in the UML diagram
 *       and the behaviour specification in practical_instructions.md.
 */
public class LibraryItem {
    private String title;
    private String isbn;
    private int year;
    private boolean isCheckedOut;

    // TODO: Declare private fields:
    //   - title        (String)
    //   - isbn         (String)
    //   - year         (int)
    //   - isCheckedOut (boolean)
    public LibraryItem(String title,String isbn,int year) {
        this.title=title;
        this.isbn=isbn;
        this.year=year;
        this.isCheckedOut=false;
    }


    // TODO: Constructor — LibraryItem(String title, String isbn, int year)
    //   isCheckedOut must default to false.


    // TODO: Getters — getTitle(), getIsbn(), getYear(), isCheckedOut()
    public String getTitle() {
        return title;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setYear(int year) {
        int currentYear=java.time.Year.now().getValue();
        if (year<1440 || year >currentYear) {
            throw new  IllegalArgumentException("invalid year" + year);
        }
        this.year=year;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;

    }


    // TODO: checkOut()
    //   Sets isCheckedOut to true.
    //   Throws IllegalStateException("Item is already checked out.") if already true.
    public void checkOut() {
        if(isCheckedOut) {
            throw new IllegalStateException("Item is already checked out.");
        }
        isCheckedOut=true;


    }
    public int getYear() {
        return year;
    }


    // TODO: returnItem()
    //   Sets isCheckedOut to false.
    //   Throws IllegalStateException("Item is not currently checked out.") if already false.
    public void returnItem() {
        if(!isCheckedOut) {
            throw new IllegalStateException("Item is not currently checked out.");

        }
        isCheckedOut=false;

    }


    // TODO: setYear(int year)
    //   Throws IllegalArgumentException if year < 1440 or year > current year.


    // TODO: getSummary()
    //   Returns: "[title] ([year]) — ISBN: [isbn]"
    public String getSummary() {
        return title + "(" + year+") - ISBN :" + isbn;
    }


}
