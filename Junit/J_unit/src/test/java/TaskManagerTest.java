import org.example.TaskManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {
    @Test
    @Timeout(2)
    void testLongRunningTask() throws InterruptedException {
        TaskManager tm = new TaskManager();
        tm.longRunningTask();
    }
}
