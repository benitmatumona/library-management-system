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
    public Librarian(String name, String staffId){
        this.staffId = staffId;
        this.name = name;
    }


    // TODO: Getters — getName(), getStaffId()

    public String getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }
    // TODO: issueItem(LibraryItem item) : String
    //   1. Calls item.checkOut()
    //   2. Returns: "[name] issued: [item.getSummary()]"
    public String issueItem(LibraryItem item){
        item.isCheckOut();
        return name +"issued: "+ item.getSummary();
    }

}
