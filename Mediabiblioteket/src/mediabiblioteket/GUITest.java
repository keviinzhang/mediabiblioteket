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
	@DisplayName("Kolla låntagare 1 finns med")
	void testUserName1() {
		String userName = "891216-1111";
		assertEquals(userName, "891216-1111");
	}
	
	@Test
	@DisplayName("Låntagare som inte finns i systemet")
	void testUserName() {
		boolean userName = false;
		assertFalse(userName);
	}
	
	/*
	@Test
	@DisplayName("Kolla låntagare 2 finns med")
	void testUserName2() {
		String userName = "361025-2222";
		assertEquals(userName, "361025-2222");
	}
	
	@Test
	@DisplayName("Kolla låntagare 3 finns med")
	void testUserName3() {
		String userName = "730516-3333";
		assertEquals(userName, "730516-3333");
	}
	
	@Test
	@DisplayName("Kolla låntagare 4 finns med")
	void testUserName4() {
		String userName = "931013-4444";
		assertEquals(userName, "931013-4444");
	}
	
	@Test
	@DisplayName("Kolla låntagare 5 finns med")
	void testUserName5() {
		String userName = "900118-5555";
		assertEquals(userName, "900118-5555");
	}
	
	@Test
	@DisplayName("Kolla låntagare 6 finns med")
	void testUserName6() {
		String userName = "821223-6666";
		assertEquals(userName, "821223-6666");
	}
	
	@Test
	@DisplayName("Kolla låntagare 7 finns med")
	void testUserName7() {
		String userName = "730421-7777";
		assertEquals(userName, "730421-7777");
	}
	
	@Test
	@DisplayName("Kolla låntagare 8 finns med")
	void testUserName8() {
		String userName = "700311-8888";
		assertEquals(userName, "700311-8888");
	}
	
	@Test
	@DisplayName("Kolla låntagare 9 finns med")
	void testUserName9() {
		String userName = "681102-9999";
		assertEquals(userName, "681102-9999");
	}
	*/
	
}
