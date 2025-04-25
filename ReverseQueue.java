import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        reverse(queue);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty()) return;
        int item = queue.remove();
        reverse(queue);
        queue.add(item);
    }
}
