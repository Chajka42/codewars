import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class DigitizeExampleTests {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Kata.digitize(35231));
        assertArrayEquals(new int[] {0}, Kata.digitize(0));
    }
}
