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

    public LibraryItem(String title, String isbn, int year){
        this.isCheckedOut = false;
        this.title = title;
        this.isbn = isbn;
        this.year = year;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public int getYear() {
        return year;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void checkOut() {

        if (isCheckedOut == true) {
            throw new IllegalStateException("Item is already checked out.");
        }
        this.isCheckedOut = true;
    }

    public void returnItem(){
        if (isCheckedOut == false){
            throw new  IllegalStateException("Item is not currently checked out.");
        }
        this.isCheckedOut = false;
    }

    public void setYear(int year) {
        if (year < 1440 || year > 2026 ){
            throw new IllegalArgumentException("The year you have entered is invalid");
        }
        this.year = year;

    }


    public String getSummary(){
        return getTitle() + " (" + getYear() +") " + "— ISBN: " + getIsbn();
    }

}
