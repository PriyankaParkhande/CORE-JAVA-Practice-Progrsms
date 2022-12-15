import java.util.*;

public class MapWithinMap {
    public static void main(String[] args) {
        LinkedHashMap<String, LinkedHashMap<Integer, String>> map = new LinkedHashMap<String, LinkedHashMap<Integer, String>>();
        LinkedHashMap<Integer, String> fe = new LinkedHashMap<Integer, String>();
        fe.put(1, "ABC");
        fe.put(2, "MNO");
        fe.put(3, "PQR");
        LinkedHashMap<Integer, String> se = new LinkedHashMap<Integer, String>();
        se.put(1, "STV");
        se.put(2, "XYZ");
        se.put(3, "SSS");
        map.put("FE", fe);
        map.put("SE", se);
        Set<Map.Entry<String, LinkedHashMap<Integer, String>>> s = map.entrySet();
        for (Map.Entry<String, LinkedHashMap<Integer, String>> sdata : s) {
            String className = sdata.getKey();
            System.out.println("======== " + className + " ============ ");
            LinkedHashMap<Integer, String> value = sdata.getValue();
            Set<Map.Entry<Integer, String>> s1 = value.entrySet();
            for (Map.Entry<Integer, String> sdata1 : s1) {
                Integer id = sdata1.getKey();
                String name = sdata1.getValue();
                System.out.println(id + "\t" + name);
            }
        }
    }
}
