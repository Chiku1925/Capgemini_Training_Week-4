import org.example.FileProcessor;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {
    FileProcessor fp = new FileProcessor();
    String filename = "testfile.txt";

    @Test
    void testWriteAndReadFile() throws IOException {
        fp.writeToFile(filename, "hello");
        String result = fp.readFromFile(filename);
        assertEquals("hello", result);
    }

    @Test
    void testFileExists() throws IOException {
        fp.writeToFile(filename, "data");
        File file = new File(filename);
        assertTrue(file.exists());
    }

    @Test
    void testIOException() {
        assertThrows(IOException.class, () -> fp.readFromFile("nonexistent.txt"));
    }
}
