import java.io.*;

public class Task8 {
    public static void main(String[] args) throws Exception {
        PipedOutputStream a = new PipedOutputStream();
        PipedInputStream b = new PipedInputStream(a);

        Thread t1 = new Thread(() -> {
            try {
                a.write("text".getBytes());
                a.close();
            } catch (IOException e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                int c;
                while ((c = b.read()) != -1) System.out.print((char)c);
                b.close();
            } catch (IOException e) {}
        });

        t1.start();
        t2.start();
        t1.join(); t2.join();
    }
}
