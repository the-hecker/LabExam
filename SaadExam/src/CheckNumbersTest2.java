import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckNumbersTest2 {
	CheckNumbers c = new CheckNumbers();
	@Test
	void test() {
		boolean output = c.isPrime(3);
		assertEquals(true, output);
	}

}
