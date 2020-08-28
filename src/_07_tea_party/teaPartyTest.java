package _07_tea_party;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class teaPartyTest {
	/**
	 * Jane Austen is a woman, so say “Hello Ms. Austen”. 
	 * George Orwell is a man, so say “Hello Mr. Orwell”. 
	 * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
	 **/

	@Test
	public void testIsWomanNotKnighted() {
		teaParty teaParty = new teaParty();
		String greeting = teaParty.welcome(null, false, false);
		assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
	}

	@Test
	public void testIsManNotKnighted() {
		teaParty teaParty = new teaParty();
		String greeting = teaParty.welcome(null, false, false);
		assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
	}

	@Test
	public void testIsManKnighted() {
		teaParty teaParty = new teaParty();
		String greeting = teaParty.welcome(null, false, false);
		assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
	}
	
	@Test
	public void testIsWomanKnighted() {
		teaParty teaParty = new teaParty();
		String greeting = teaParty.welcome(null, false, false);
		assertEquals("Hello Lady Laura", teaParty.welcome("Laura", true, true));
	}

}
