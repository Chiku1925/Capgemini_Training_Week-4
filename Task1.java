import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        try {
            File f = new File("a.txt");
            if (!f.exists()) {
                System.out.println("no file");
                return;
            }
            FileInputStream r = new FileInputStream(f);
            FileOutputStream w = new FileOutputStream("b.txt");
            int x;
            while ((x = r.read()) != -1) w.write(x);
            r.close(); w.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
