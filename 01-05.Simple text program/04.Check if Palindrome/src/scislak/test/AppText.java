package scislak.test;

import static org.junit.Assert.*;

import org.junit.Test;

import scislak.program.App;

public class AppText {

	@Test
	public void failTest() {
		assertFalse(App.checkIsPalindrome("asdfg"));
	}
	
	@Test
	public void trueTest() {
		assertTrue(App.checkIsPalindrome("racecar"));
	}
	
	@Test
	public void trueDoubleTest() {
		assertTrue(App.checkIsPalindrome("raceecar"));
	}

}
