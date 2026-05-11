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
    private boolean isCheckedOut = false;


    // TODO: Constructor — LibraryItem(String title, String isbn, int year)
    //   isCheckedOut must default to false.
   public libraryItem(String title, String isbn, int year)
    this.title =title;
    this.isbn = isbn;
    this.year = year;


    // TODO: Getters — getTitle(), getIsbn(), getYear(), isCheckedOut()

    public int getYear() {
        return year;
    }

    public boolean getIIsCheckedOut() {
        return isCheckedOut;
    }
    public String getTitle(){
        return title;
    }

    public String getIsbn() {
        return isbn;
    }


    // TODO: checkOut()
    //   Sets isCheckedOut to true.
    //   Throws IllegalStateException("Item is already checked out.") if already true.

    public void checkOut() {
        isCheckedOut = true;
    }




    // TODO: returnItem()

    public void returnItem() {
        isCheckedOut = false;
    }

    //   Sets isCheckedOut to false.
    //   Throws IllegalStateException("Item is not currently checked out.") if already false.


    // TODO: setYear(int year)
    //   Throws IllegalArgumentException if year < 1440 or year > current year.
    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Invalid year.");
        }
    }



    // TODO: getSummary()
    //   Returns: "[title] ([year]) — ISBN: [isbn]"

    public String getSummary() {
        return "Title: " + title +
                ", ISBN: " + isbn +
                ", Year: " + year +
                ", Checked Out: " + isCheckedOut;
    }

}
