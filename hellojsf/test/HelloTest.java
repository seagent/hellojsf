import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {
	@Test
	public void testHello() throws Exception {
		int a = 5;
		int b = 3;

		// Check that a condition is true
		assertTrue(a < b);

		// Check that a condition is false
		assertFalse(a > b);
	}
}
