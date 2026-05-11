package library;

/**
 * Represents an audio book — a specific type of LibraryItem.
 *
 * TODO: Implement this class exactly as specified in the UML diagram.
 *       This class must extend LibraryItem.
 */
public class AudioBook extends LibraryItem {
    private String narrator;
    private int durationMins;

    public AudioBook(String title, String isbn, int year, String narrator, int durationMins){
        super(title,isbn, year);
        this.narrator = narrator;
        this.durationMins = durationMins;
    }

    public String getNarrator() {
        return narrator;
    }

    public int getDurationMins() {
        return durationMins;
    }

    @Override
    public String getSummary(){
        return getTitle() + " (" + getYear() +") narrated by " + narrator + ", "  + durationMins + " mins — ISBN: " + getIsbn();
    }

}
