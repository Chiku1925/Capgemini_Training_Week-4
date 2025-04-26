import java.io.*;

public class Task7 {
    public static void main(String[] args) throws IOException {
        DataOutputStream d = new DataOutputStream(new FileOutputStream("stud.dat"));
        d.writeInt(11);
        d.writeUTF("abc");
        d.writeDouble(9.5);
        d.close();

        DataInputStream in = new DataInputStream(new FileInputStream("stud.dat"));
        System.out.println(in.readInt());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        in.close();
    }
}
