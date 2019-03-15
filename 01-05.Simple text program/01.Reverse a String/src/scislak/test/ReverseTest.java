package scislak.test;
import static org.junit.Assert.*;

import org.junit.Test;

import scislak.program.Reverse;

public class ReverseTest {

	@Test
	public void test() {
		String first = "1234567890";
		assertEquals("0987654321", Reverse.reverseText(first));
	}
	
	@Test
	public void testSecond() {
		String first = "   87  KK  8l.';a ";
		assertEquals(" a;'.l8  KK  78   ", Reverse.reverseText(first));
	}
	
	@Test
	public void testThirdth() {
		String first = "asdfg hjk l";
		assertEquals("l kjh gfdsa", Reverse.reverseText(first));
	}

}
