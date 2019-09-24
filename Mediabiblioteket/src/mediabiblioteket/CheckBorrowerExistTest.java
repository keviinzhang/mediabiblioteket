package mediabiblioteket;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import collections.LinkedList;

class CheckBorrowerExistTest {

	private static LibraryController theController;
    Borrower borrower1 = new Borrower("Harald Svensson", "891216-1111", "040-471024");
    Media media2 = new Book("Bok", "Historiens matematik", "775534", 1991, "Thompson");
    

    @BeforeEach
    void controllerTest() {
        theController = new LibraryController();
        theController.currentBorrower = borrower1;
    }

    @Test
    @DisplayName("Exists")
    void testCheckBorrower() throws FileNotFoundException {
        boolean borrowerFound = theController.checkIfBorrowerExist("891216-1111");
        assertTrue(borrowerFound);
    }
    
    @Test
    @DisplayName("Doesn't exist")
    void testCheckBorrower2() throws FileNotFoundException {
        boolean borrowerFound = theController.checkIfBorrowerExist("891216-6969");
        assertFalse(borrowerFound);
    }
    
    @Test
    @DisplayName("Load Borrower File")
    void testLoadBorrowedMedia() throws FileNotFoundException {
        boolean mediaFileFound = theController.loadBorrowedMedia();
        assertTrue(mediaFileFound);
    }
    
    @Test
    @DisplayName("The Search String")
    void testTheSearchString() throws FileNotFoundException {
        String theSearchString;
        theSearchString = "Finding Neverland";
        
        theSearchString.toString();
        theController.searchMediaTitleByString(theSearchString); //Fungerar om man mockar GUI.
    }
    @Test
    @DisplayName("Search Results")
    void testMediaSearchResults() throws FileNotFoundException {
        LinkedList<Media> mediaSearchResults = theController.mediaSearchResults;
        Media media1 = theController.allMediaObjects.get(6);
        mediaSearchResults.add(media1);
        Media input = theController.getMediaFromSearchResult(media1.toString());
        
        assertEquals(input, media1);
    }
    
    @Test
    @DisplayName("Test Borrower something")
    void testSearchBorrowed() throws FileNotFoundException {
        theController.currentBorrower = borrower1;
        theController.searchBorrowed();
        String theSearchString;
        theSearchString = "Finding Neverland";
        String Ssn = "891216-1111";
        String ID = "775534";
        
        if (theController.currentBorrower.getSsn().equals(Ssn)) {
            theController.getMedia(ID);
            theController.mediaSearchResults.add(media2);
            theController.searchMediaTitleByString(theSearchString); //Fungerar med en GUI mock.
        }
    }
    
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }
    
    @AfterEach
    void tearDown() throws Exception {
    }

}
