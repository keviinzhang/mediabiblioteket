package mediabiblioteket;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import collections.ArrayList;

class LibraryControllerTest {
	ArrayList<String> borrowed;
	
	private static LibraryController theController;
	private static final Media media = new Book("book", "Agenten", "277877", 2005, "Grisham");
    Borrower borrower = new Borrower("Harald Svensson", "891216-1111", "040-471024");
	
	@BeforeEach
	void controllerTest() {
	theController = new LibraryController();
	}
	
	@Nested
	class Medias {
	@Test
	@DisplayName("Borrowing Media...")
	 public void borrowMediaTest() throws FileNotFoundException {
        theController.currentBorrower = borrower;
        theController.borrowMedia(media);
    }

		@Test
		@DisplayName("Returning Media...")
		void returnMediaTest() {
			theController.currentBorrower = borrower;
			theController.returnMedia(media);
		}
		
		
	}

}
