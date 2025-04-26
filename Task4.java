import java.io.*;
import java.util.*;

class T4 implements Serializable {
    int a;
    String b, c;
    double d;
    T4(int x, String y, String z, double w) {
        a = x; b = y; c = z; d = w;
    }
}

public class Task4 {
    public static void main(String[] args) throws Exception {
        List<T4> list = new ArrayList<>();
        list.add(new T4(1, "x", "y", 1000));
        list.add(new T4(2, "m", "n", 2000));
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("emp.dat"));
        o.writeObject(list); o.close();
        ObjectInputStream i = new ObjectInputStream(new FileInputStream("emp.dat"));
        List<?> l = (List<?>) i.readObject();
        for (Object obj : l) System.out.println(obj);
        i.close();
    }
}
