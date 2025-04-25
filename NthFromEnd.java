import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;

        int i = 0;
        String result = null;

        for (String current : list) {
            if (i >= list.size() - n) {
                result = current;
                break;
            }
            i++;
        }

        System.out.println(result);
    }
}
