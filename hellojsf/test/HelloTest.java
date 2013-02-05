import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {
	@Test
	public void testHello() throws Exception {
		int a = 5;
		int b = 3;
		int c = 4;
		
		// Check that a condition is true
		assertTrue(c < a);
		

		// Check that a condition is true
		assertTrue(b < c);

		// Check that a condition is false
		assertFalse(a < b);
	}
}
