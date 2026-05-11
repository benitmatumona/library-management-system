package library;

/**
 * Represents a librarian who can issue items to borrowers.
 *
 * TODO: Implement this class exactly as specified in the UML diagram.
 */
public class Librarian {

    private String name;
    private String staffId;

    public Librarian(String name, String staffId){
        this.name = name;
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public String getStaffId() {
        return staffId;
    }

    public String issueItem(LibraryItem item){
        item.checkOut();
        return name + " issued: " + item.getSummary();
    }
}
