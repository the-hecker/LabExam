import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckNumbersTest {
	CheckNumbers c = new CheckNumbers();
	@Test
	void test() {
		String output = c.evenInteger(3);
		assertEquals("Not Even Number", output);
	}
}
