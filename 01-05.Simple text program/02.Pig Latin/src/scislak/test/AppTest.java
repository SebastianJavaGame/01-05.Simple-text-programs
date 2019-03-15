package scislak.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import scislak.program.App;

public class AppTest {

	@Test
	public void zeroVowel() {
		String changed = App.changeString("BcHHh");		
		assertEquals("bchhhay", changed);
	}
	
	@Test
	public void oneVowel() {
		String changed = App.changeString("dUck");
		assertEquals("uckday", changed);
		
		String changed1 = App.changeString("dckkkkkkkokk");
		assertEquals("okkdckkkkkkkay", changed1);
	}
	
	@Test
	public void firstVowel() {
		String changed = App.changeString(" enDS   ");		
		assertEquals("endsway", changed);
	}
	
	@Test
	public void firstAndThirdVowel() {
		String changed = App.changeString("   smile");
		assertEquals("ilesmay", changed);
	}

}
