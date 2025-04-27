import org.example.Calculators;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorsTest {
    @Test
    void testDivideByZero() {
        Calculators calc = new Calculators();
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}
