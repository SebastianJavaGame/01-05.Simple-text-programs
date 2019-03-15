package scislak.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import scislak.program.CountVowels;

public class CountVowelsTest {
	public CountVowels cv;
	
	@Before
	public void Before() {
		cv = new CountVowels(" asd ekh ookki 56y76e hio pop");
		cv.countAllVowels();
	}
	
	@Test
	public void countAllVowels() {
		int countVowels = cv.countAllVowels();
		assertEquals(10, countVowels);
	}
	
	@Test
	public void raportVowelA() {
		assertEquals(1, cv.getCountVowelA());
	}
	
	@Test
	public void raportVowelE() {
		assertEquals(2, cv.getCountVowelE());
	}
	
	@Test
	public void raportVowelO() {
		assertEquals(4, cv.getCountVowelO());
	}
	
	@Test
	public void raportVowelU() {
		assertEquals(0, cv.getCountVowelU());
	}
	
	@Test
	public void raportVowelI() {
		assertEquals(2, cv.getCountVowelI());
	}
	
	@Test
	public void raportVowelY() {
		assertEquals(1, cv.getCountVowelY());
	}

}
