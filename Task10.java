import java.io.*;
import java.util.*;

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("words.txt"));
        Map<String, Integer> m = new HashMap<>();
        String l;
        while ((l = r.readLine()) != null) {
            for (String s : l.split("\\W+")) {
                if (!s.isEmpty()) m.put(s, m.getOrDefault(s, 0) + 1);
            }
        }
        r.close();
        m.entrySet().stream()
         .sorted((a, b) -> b.getValue() - a.getValue())
         .limit(5)
         .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
