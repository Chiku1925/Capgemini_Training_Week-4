import org.example.DateFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {
    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("08-05-2025", formatter.formatDate("2025-05-08"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(Exception.class, () -> formatter.formatDate("invalid-date"));
    }
}
