import org.junit.jupiter.api.Test;
import org.stringCalculator_2024.StringCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    public void testAddWithEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

}
