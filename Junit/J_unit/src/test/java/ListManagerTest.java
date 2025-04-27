import org.example.ListManager;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {
    ListManager manager = new ListManager();

    @Test
    void testAddElement() {
        ArrayList<Integer> list = new ArrayList<>();
        manager.addElement(list, 5);
        assertTrue(list.contains(5));
    }

    @Test
    void testRemoveElement() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        manager.removeElement(list, 5);
        assertFalse(list.contains(5));
    }

    @Test
    void testGetSize() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertEquals(2, manager.getSize(list));
    }
}
