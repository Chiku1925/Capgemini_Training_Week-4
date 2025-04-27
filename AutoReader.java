import java.io.*;

public class AutoReader {
    public static void main(String[] args) {
        try (BufferedReader b = new BufferedReader(new FileReader("info.txt"))) {
            System.out.println(b.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
