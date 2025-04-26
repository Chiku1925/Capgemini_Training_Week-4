import java.io.*;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("u.txt"), "UTF-8"));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("v.txt"), "UTF-8"));
        String line;
        while ((line = r.readLine()) != null) {
            w.write(line.toLowerCase());
            w.newLine();
        }
        r.close(); w.close();
    }
}
