import java.util.*;

public class MapDemoApp {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<Integer, String>();
        h.put(1, "ABC");
        h.put(100, "PQR");
        h.put(345, "STV");
        h.put(234, "ABCD");
        h.put(10, "STX");
        h.put(33, "OOOO");
        h.put(44, "ram");
        h.put(543, "Shyam");
        h.put(987, "TSSS");
        Set keys = h.keySet();
        for (Object key : keys) {
            Object value = h.get(key);
            System.out.println(key + "\t" + value);
        }
    }
}