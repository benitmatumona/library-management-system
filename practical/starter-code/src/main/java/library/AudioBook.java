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
    public AudioBook(String title, String isbn, int year, String narrator, int durationMins) {
        this.narrator = narrator;
        this.durationMins = durationMins;
        super();
    }


    // TODO: Getters — getNarrator(), getDurationMins()

    public String getNarrator() {
        return narrator;
    }

    public int getDurationMins() {
        return durationMins;
    }

    // TODO: @Override getSummary()
    //   Returns: "[title] ([year]) narrated by [narrator], [durationMins] mins — ISBN: [isbn]"
    //   Use the inherited getters to access LibraryItem fields.

    @Override
    public String getSummary() {
        String title = getTitle();
        String isbn = getIsbn();
        int year = getYear();

        return  title + year + "narrated by " + narrator + ", " + durationMins + "mins — ISBN: " + isbn
    }

}
