import java.util.*;

public class listIteratornext {
    public static void main(String x[]) {
        Vector v = new Vector();
        v.add(20);
        v.add(44);
        v.add(33);
        v.add(88);
        v.add(11);
        ListIterator i = v.listIterator(v.size());
        System.out.println("before rempove" + v);
        while (i.hasNext()) {
            Object obj = i.next();
            System.out.println(obj);

        }
        System.out.println("before rempove" + v);
    }
}