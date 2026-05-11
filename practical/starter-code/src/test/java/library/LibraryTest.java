package library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Library Management System.
 *
 * TODO: Complete each test method body.
 *       Do NOT change method names, return types, or annotations.
 */
class LibraryTest {

    private LibraryItem item;
    private Book book;
    private AudioBook audioBook;
    private Librarian librarian;

    @BeforeEach
    void setUp() {
        // TODO: Initialise all four objects here before each test.
        //   item      → title "Clean Code", isbn "978-0132350884", year 2008
        //   book      → title "The Pragmatic Programmer", isbn "978-0135957059",
        //                year 2019, author "Andrew Hunt", pages 352
        //   audioBook → title "Atomic Habits", isbn "978-0735211292",
        //                year 2018, narrator "James Clear", durationMins 681
        //   librarian → name "Amara Nkosi", staffId "LIB042"
    }

    @Test
    void testLibraryItemSummary() {
        // TODO: Assert that item.getSummary() returns the correctly formatted string.
    }

    @Test
    void testBookSummary() {
        // TODO: Assert that book.getSummary() returns the correctly formatted string.
    }

    @Test
    void testAudioBookSummary() {
        // TODO: Assert that audioBook.getSummary() returns the correctly formatted string.
    }

    @Test
    void testLibrarianIssueItem() {
        // TODO: Assert that librarian.issueItem(book) returns the correctly formatted receipt string.
    }

    @Test
    void testCheckOutThrowsWhenAlreadyOut() {
        // TODO: Check out the item once successfully, then assert that calling
        //       checkOut() a second time throws IllegalStateException.
    }

    @Test
    void testReturnItemThrowsWhenNotOut() {
        // TODO: Assert that calling returnItem() on an item that has NOT been
        //       checked out throws IllegalStateException.
    }

    @Test
    void testInvalidYearThrows() {
        // TODO: Assert that calling setYear(1000) throws IllegalArgumentException.
    }

    @Test
    void testGettersReturnCorrectValues() {
        // TODO: Assert that getTitle(), getIsbn(), getYear(), and isCheckedOut()
        //       return the values used when constructing item in setUp().
    }
}
