import java.util.*;

public class MapLinkedhashApp {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> h = new LinkedHashMap<Integer, String>();
        h.put(1, "ABC");
        h.put(100, "PQR");
        h.put(345, "STV");
        h.put(234, "ABCD");
        h.put(10, "STX");
        h.put(33, "OOOO");
        h.put(44, "ram");
        h.put(543, "Shyam");
        h.put(987, "TSSS");
        Set<Map.Entry<Integer, String>> setData = h.entrySet();
        for (Map.Entry<Integer, String> s : setData) {
            System.out.println(s.getKey() + "\t" + s.getValue());
        }
    }
}