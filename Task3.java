import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String a = b.readLine();
        String c = b.readLine();
        String d = b.readLine();
        FileWriter f = new FileWriter("out.txt");
        f.write(a + "\n" + c + "\n" + d);
        f.close();
    }
}
