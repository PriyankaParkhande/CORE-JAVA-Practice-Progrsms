import java.util.*;

public class TreeSetDesendingApplication {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeSet ts = new TreeSet();
        ts.add(4);
        ts.add(1);
        ts.add(20);
        ts.add(33);
        ts.add(2);
        ts.add(5);
        NavigableSet nav = ts.descendingSet();
        Iterator i = nav.iterator();
        while (i.hasNext()) {
            Object obj = i.next();
            System.out.println(obj);
        }
    }
}