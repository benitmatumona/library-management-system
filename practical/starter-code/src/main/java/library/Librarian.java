package library;

/**
 * Represents a librarian who can issue items to borrowers.
 *
 * TODO: Implement this class exactly as specified in the UML diagram.
 */
public class Librarian {

    // TODO: Declare private fields: name (String), staffId (String)
    private String name;
    private String staffId;


    // TODO: Constructor — Librarian(String name, String staffId)
    public Librarian(String name, String staffId) {
        this.name = name;
        this.staffId = staffId;
    }


    // TODO: Getters — getName(), getStaffId()
    String getName() {
        return this.name;
    }

    String getStaffId() {
        return this.staffId;
    }


    // TODO: issueItem(LibraryItem item) : String
    //   1. Calls item.checkOut()
    //   2. Returns: "[name] issued: [item.getSummary()]"
    String issueItem(LibraryItem item) {
        item.checkout();
        return "[" + getName() + "] issued: [" + item.getSummary() + "]";
    }

}
