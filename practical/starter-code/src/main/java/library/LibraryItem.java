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
    private boolean isCheckOut;


    // TODO: Constructor — LibraryItem(String title, String isbn, int year)
    //   isCheckedOut must default to false.
    public LibraryItem(String title,String isbn,int year){
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.isCheckOut = false;
    }


    // TODO: Getters — getTitle(), getIsbn(), getYear(), isCheckedOut()

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getIsbn() {
        return isbn;
    }
    public boolean getIsCheckOut(){
        return isCheckOut;
    }
    // TODO: checkOut()
    //   Sets isCheckedOut to true.
    //   Throws IllegalStateException("Item is already checked out.") if already true.
    public boolean isCheckOut(){
        if(isCheckOut){
            throw new IllegalStateException("ischeckout is always false");
        }
        isCheckOut  = true;
        return false;
    }


    // TODO: returnItem()
    //   Sets isCheckedOut to false.
    //   Throws IllegalStateException("Item is not currently checked out.") if already false.
    public boolean returnItem(){
        if(!isCheckOut){
            throw new IllegalStateException("Item is not currently checked out.");
        }
         isCheckOut= false;
        return false;
    }


    // TODO: setYear(int year)
    //   Throws IllegalArgumentException if year < 1440 or year > current year.
    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();
        if(year<1440 || year < currentYear){
            throw new IllegalArgumentException("year can not be less than the current it must me the same as the current year.");
        }
        this.year = year;
    }



    // TODO: getSummary()
    //   Returns: "[title] ([year]) — ISBN: [isbn]"
    public String getSummary(){

        return title +"(" +year + ")"+"-" + "ISBN:" + isbn;
    }


    public void checkOut() {
    }

    public boolean isCheckedOut() {
        return false;
    }
}
