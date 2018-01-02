import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
	@Test
	public void fizzbuzz() {
		assertEquals("fizzbuzz", Main.fizzbuzz(15, ""));
	}

	@Test
	public void fizz() {
		assertEquals("fizz", Main.fizzbuzz(3, ""));
	}

	@Test
	public void buzz() {
		assertEquals("buzz", Main.fizzbuzz(5, ""));
	}

	@Test
	public void number() {
		assertEquals("7", Main.fizzbuzz(7, ""));
	}
}

