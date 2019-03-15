package scislak.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import scislak.program.SummaryString;

public class AppTest {
	public SummaryString sun;
	
	@Before
	public void init() {
		sun = new SummaryString("djfi fwoiu  jeiojw fo ofopeppo poe ythtygf");
		sun.summaryText();
	}
	
	@Test
	public void testCount() {
		assertEquals(7, sun.getCountWords());
	}
	
	@Test
	public void testAverrage() {
		assertEquals(5, sun.getAverrageCount(), 0.01);
	}
	
	@Test
	public void testShorter() {
		assertEquals("fo", sun.getShorterWord());
	}
	
	@Test
	public void testLonger() {
		assertEquals("ofopeppo", sun.getLongerWord());
	}

}
