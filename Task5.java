import java.io.*;

public class Task5 {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("img.png");
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        int x;
        while ((x = f.read()) != -1) b.write(x);
        byte[] data = b.toByteArray();
        ByteArrayInputStream r = new ByteArrayInputStream(data);
        FileOutputStream w = new FileOutputStream("img2.png");
        while ((x = r.read()) != -1) w.write(x);
        f.close(); b.close(); r.close(); w.close();
    }
}
