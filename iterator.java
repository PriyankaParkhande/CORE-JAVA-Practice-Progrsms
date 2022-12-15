import java.util.*;

public class iterator {
    public static void main(String x[]) {
        Vector v = new Vector();
        v.add(20);
        v.add(44);
        v.add(33);
        v.add(88);
        v.add(11);
        Iterator i = v.iterator();
        while (i.hasNext()) {
            Object obj = i.next();
            System.out.println(obj);
        }
    }
}