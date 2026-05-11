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


    // TODO: Constructor — LibraryItem(String title, String isbn, int year)
    //   isCheckedOut must default to false.


    // TODO: Getters — getTitle(), getIsbn(), getYear(), isCheckedOut()


    // TODO: checkOut()
    //   Sets isCheckedOut to true.
    //   Throws IllegalStateException("Item is already checked out.") if already true.


    // TODO: returnItem()
    //   Sets isCheckedOut to false.
    //   Throws IllegalStateException("Item is not currently checked out.") if already false.


    // TODO: setYear(int year)
    //   Throws IllegalArgumentException if year < 1440 or year > current year.


    // TODO: getSummary()
    //   Returns: "[title] ([year]) — ISBN: [isbn]"

}
