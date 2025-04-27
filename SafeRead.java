import java.io.*;

public class SafeRead {
    public static void main(String[] args) {
        try {
            BufferedReader b = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = b.readLine()) != null) System.out.println(line);
            b.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
