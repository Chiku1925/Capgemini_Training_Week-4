import java.io.*;

public class Task2 {
    public static void main(String[] args) throws Exception {
        long s = System.nanoTime();
        FileInputStream a = new FileInputStream("big.bin");
        FileOutputStream b = new FileOutputStream("copy1.bin");
        int d;
        while ((d = a.read()) != -1) b.write(d);
        a.close(); b.close();
        long e = System.nanoTime();
        System.out.println("t1: " + (e - s));

        s = System.nanoTime();
        BufferedInputStream x = new BufferedInputStream(new FileInputStream("big.bin"));
        BufferedOutputStream y = new BufferedOutputStream(new FileOutputStream("copy2.bin"));
        byte[] buf = new byte[4096];
        while ((d = x.read(buf)) != -1) y.write(buf, 0, d);
        x.close(); y.close();
        e = System.nanoTime();
        System.out.println("t2: " + (e - s));
    }
}
