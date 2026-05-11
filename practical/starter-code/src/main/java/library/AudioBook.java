package library;

/**
 * Represents an audio book — a specific type of LibraryItem.
 *
 * TODO: Implement this class exactly as specified in the UML diagram.
 *       This class must extend LibraryItem.
 */
public class AudioBook extends LibraryItem {

    // TODO: Declare private fields: narrator (String), durationMins (int)
    private String narrator;
    private int durationMins;


    // TODO: Constructor — AudioBook(String title, String isbn, int year, String narrator, int durationMins)
    //   Use super(...) to pass the correct arguments to LibraryItem.
    public AudioBook(String title, String isbn, int year, String narrator, int durationMins){
        super(title, String.valueOf(year), Integer.parseInt(isbn));
        this.narrator = narrator;
        this.durationMins = durationMins;
    }


    // TODO: Getters — getNarrator(), getDurationMins()

    public int getDurationMins() {
        return durationMins;
    }

    public String getNarrator() {
        return narrator;
    }
    // TODO: @Override getSummary()
    //   Returns: "[title] ([year]) narrated by [narrator], [durationMins] mins — ISBN: [isbn]"
    //   Use the inherited getters to access LibraryItem fields.


    @Override
    public String getSummary() {
        return getTitle()+" "+getYear()+"narrated by"+narrator+","+durationMins+"mins - ISBN: "+getIsbn();
    }
}
