package mediabiblioteket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GUITest {

	@BeforeEach 
	void init() {
	//GUI theGUI = new GUI();
	}

	@Test
	@DisplayName("Test 1")
	void test() {
		String userName = "891216-1111";
		assertEquals(userName, "891216-1111");
	}

}
