import org.example.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    UserRegistration ur = new UserRegistration();

    @Test
    void testValidUser() {
        assertDoesNotThrow(() -> ur.registerUser("john", "john@example.com", "secret123"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> ur.registerUser("john", "johnexample.com", "secret123"));
    }

    @Test
    void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> ur.registerUser("john", "john@example.com", "123"));
    }

    @Test
    void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> ur.registerUser(null, null, null));
    }
}
