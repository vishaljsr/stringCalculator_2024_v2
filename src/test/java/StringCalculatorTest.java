import org.junit.jupiter.api.Test;
import org.stringCalculator_2024.StringCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    public void testAddWithEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void testAddWithSingleNumber(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(1,calculator.add("1"));
        assertEquals(5,calculator.add("5"));
    }

}
