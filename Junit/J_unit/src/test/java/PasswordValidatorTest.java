import org.example.PasswordValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Passw0rd"));
    }

    @Test
    void testShortPassword() {
        assertFalse(validator.isValid("P0a"));
    }

    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("Password"));
    }
}
