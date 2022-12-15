import java.util.*;

public class MapWithCollection {
    public static void main(String[] args) {
        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<String, ArrayList<String>>();
        ArrayList<String> ind = new ArrayList<String>();
        ind.add("rohit");
        ind.add("virat");
        ind.add("surya");
        ArrayList<String> aus = new ArrayList<String>();
        aus.add("warnar");
        aus.add("smith");
        aus.add("finch");
        map.put("India", ind);
        map.put("Aus", aus);
        Set<Map.Entry<String, ArrayList<String>>> setData = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> data : setData) {
            String key = data.getKey();
            System.out.println("Team Name " + key + " ========== ");
            ArrayList<String> al = data.getValue();
            for (String v : al) {
                System.out.println(v);
            }
        }
    }
}