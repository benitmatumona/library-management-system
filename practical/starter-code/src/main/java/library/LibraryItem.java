package library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Library Management System.
 */
class LibraryTest {

    private LibraryItem item;
    private Book book;
    private AudioBook audioBook;
    private Librarian librarian;

    @BeforeEach
    void setUp() {
        item = new LibraryItem(
                "Clean Code",
                "978-0132350884",
                2008
        );

        book = new Book(
                "The Pragmatic Programmer",
                "978-0135957059",
                2019,
                "Andrew Hunt",
                352
        );

        audioBook = new AudioBook(
                "Atomic Habits",
                "978-0735211292",
                2018,
                "James Clear",
                681
        );

        librarian = new Librarian(
                "Amara Nkosi",
                "LIB042"
        );
    }

    @Test
    void testLibraryItemSummary() {
        String expected =
                "Clean Code (2008) — ISBN: 978-0132350884";

        assertEquals(expected, item.getSummary());
    }

    @Test
    void testBookSummary() {
        String expected =
                "The Pragmatic Programmer (2019) by Andrew Hunt, 352 pages — ISBN: 978-0135957059";

        assertEquals(expected, book.getSummary());
    }

    @Test
    void testAudioBookSummary() {
        String expected =
                "Atomic Habits (2018) narrated by James Clear, 681 mins — ISBN: 978-0735211292";

        assertEquals(expected, audioBook.getSummary());
    }

    @Test
    void testLibrarianIssueItem() {
        String expected =
                "Amara Nkosi issued: The Pragmatic Programmer (2019) by Andrew Hunt, 352 pages — ISBN: 978-0135957059";

        assertEquals(expected, librarian.issueItem(book));
        assertTrue(book.isCheckedOut());
    }

    @Test
    void testCheckOutThrowsWhenAlreadyOut() {
        item.checkOut();

        IllegalStateException exception =
                assertThrows(
                        IllegalStateException.class,
                        () -> item.checkOut()
                );

        assertEquals(
                "Item is already checked out.",
                exception.getMessage()
        );
    }

    @Test
    void testReturnItemThrowsWhenNotOut() {
        IllegalStateException exception =
                assertThrows(
                        IllegalStateException.class,
                        () -> item.returnItem()
                );

        assertEquals(
                "Item is not currently checked out.",
                exception.getMessage()
        );
    }

    @Test
    void testInvalidYearThrows() {
        assertThrows(
                IllegalArgumentException.class,
                () -> item.setYear(1000)
        );
    }

    @Test
    void testGettersReturnCorrectValues() {
        assertEquals("Clean Code", item.getTitle());
        assertEquals("978-0132350884", item.getIsbn());
        assertEquals(2008, item.getYear());
        assertFalse(item.isCheckedOut());
    }

    // =========================================================
    // EXTRA TESTS
    // =========================================================

    @Test
    void testItemStartsUncheckedOut() {
        assertFalse(item.isCheckedOut());
    }

    @Test
    void testCheckOutChangesStatusToTrue() {
        item.checkOut();

        assertTrue(item.isCheckedOut());
    }

    @Test
    void testReturnItemChangesStatusToFalse() {
        item.checkOut();
        item.returnItem();

        assertFalse(item.isCheckedOut());
    }

    @Test
    void testCheckOutThenReturnThenCheckOutAgain() {
        item.checkOut();
        item.returnItem();
        item.checkOut();

        assertTrue(item.isCheckedOut());
    }

    @Test
    void testSetYearValidValue() {
        item.setYear(2020);

        assertEquals(2020, item.getYear());
    }

    @Test
    void testSetYearExactly1440() {
        item.setYear(1440);

        assertEquals(1440, item.getYear());
    }

    @Test
    void testSetYearFutureThrowsException() {
        int futureYear = java.time.Year.now().getValue() + 1;

        assertThrows(
                IllegalArgumentException.class,
                () -> item.setYear(futureYear)
        );
    }

    @Test
    void testBookGetAuthor() {
        assertEquals("Andrew Hunt", book.getAuthor());
    }

    @Test
    void testBookGetPages() {
        assertEquals(352, book.getPages());
    }

    @Test
    void testAudioBookGetNarrator() {
        assertEquals("James Clear", audioBook.getNarrator());
    }

    @Test
    void testAudioBookGetDurationMins() {
        assertEquals(681, audioBook.getDurationMins());
    }

    @Test
    void testLibrarianGetName() {
        assertEquals("Amara Nkosi", librarian.getName());
    }

    @Test
    void testLibrarianGetStaffId() {
        assertEquals("LIB042", librarian.getStaffId());
    }

    @Test
    void testIssueItemChecksOutItem() {
        librarian.issueItem(item);

        assertTrue(item.isCheckedOut());
    }

    @Test
    void testIssueAlreadyCheckedOutItemThrows() {
        item.checkOut();

        assertThrows(
                IllegalStateException.class,
                () -> librarian.issueItem(item)
        );
    }

    @Test
    void testBookIsInstanceOfLibraryItem() {
        assertTrue(book instanceof LibraryItem);
    }

    @Test
    void testAudioBookIsInstanceOfLibraryItem() {
        assertTrue(audioBook instanceof LibraryItem);
    }

    @Test
    void testDifferentObjectsHaveDifferentSummaries() {
        assertNotEquals(
                book.getSummary(),
                audioBook.getSummary()
        );
    }

    @Test
    void testLibraryItemSummaryContainsTitle() {
        assertTrue(
                item.getSummary().contains("Clean Code")
        );
    }

    @Test
    void testLibraryItemSummaryContainsIsbn() {
        assertTrue(
                item.getSummary().contains("978-0132350884")
        );
    }

    @Test
    void testBookSummaryContainsAuthor() {
        assertTrue(
                book.getSummary().contains("Andrew Hunt")
        );
    }

    @Test
    void testAudioBookSummaryContainsNarrator() {
        assertTrue(
                audioBook.getSummary().contains("James Clear")
        );
    }

    @Test
    void testMultipleReturnsThrowException() {
        item.checkOut();
        item.returnItem();

        assertThrows(
                IllegalStateException.class,
                () -> item.returnItem()
        );
    }

    @Test
    void testMultipleCheckOutsOnlyFirstSucceeds() {
        assertDoesNotThrow(() -> item.checkOut());

        assertThrows(
                IllegalStateException.class,
                () -> item.checkOut()
        );
    }

    @Test
    void testSetYearUpdatesSummary() {
        item.setYear(2022);

        assertEquals(
                "Clean Code (2022) — ISBN: 978-0132350884",
                item.getSummary()
        );
    }

    @Test
    void testBookSummaryFormattingExactly() {
        String expected =
                "The Pragmatic Programmer (2019) by Andrew Hunt, 352 pages — ISBN: 978-0135957059";

        assertEquals(expected, book.getSummary());
    }

    @Test
    void testAudioBookSummaryFormattingExactly() {
        String expected =
                "Atomic Habits (2018) narrated by James Clear, 681 mins — ISBN: 978-0735211292";

        assertEquals(expected, audioBook.getSummary());
    }

    @Test
    void testIssueItemReceiptFormattingExactly() {
        String receipt = librarian.issueItem(audioBook);

        String expected =
                "Amara Nkosi issued: Atomic Habits (2018) narrated by James Clear, 681 mins — ISBN: 978-0735211292";

        assertEquals(expected, receipt);
    }
}