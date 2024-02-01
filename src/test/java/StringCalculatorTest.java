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

    @Test
    public void testAddWithTwoNumbers(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
        assertEquals(7, calculator.add("3,4"));
    }
    @Test
    public void testAddHandlesNewLines() {
        StringCalculator calculator = new StringCalculator();

        assertEquals(6, calculator.add("1\n2,3"));
        assertEquals(10, calculator.add("1\n2,3,4"));
        // Test to ensure it also works with just new lines and no commas
        assertEquals(6, calculator.add("1\n2\n3"));
    }

    @Test
    public void testAddWithCustomDelimiter() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("//;\n1;2"));
        assertEquals(6, calculator.add("//@\n1@2@3"));
    }

}
