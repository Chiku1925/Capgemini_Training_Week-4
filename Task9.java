import java.io.*;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("log.txt"));
        String line;
        while ((line = r.readLine()) != null) {
            if (line.toLowerCase().contains("error")) System.out.println(line);
        }
        r.close();
    }
}
