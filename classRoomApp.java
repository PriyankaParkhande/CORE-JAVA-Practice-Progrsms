
import java.util.*;

public class classRoomApp {
    public static void main(String[] args) {
        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<String, ArrayList<String>>();
        ArrayList<String> FE = new ArrayList<String>();
        FE.add("rohit");
        FE.add("virat");
        FE.add("surya");
        ArrayList<String> SE = new ArrayList<String>();
        SE.add("SHRAVNI");
        SE.add("AKSH");
        SE.add("MANKR");
        ArrayList<String> TE = new ArrayList<String>();
        TE.add("warnar");
        TE.add("smith");
        TE.add("finch");
        ArrayList<String> BE = new ArrayList<String>();
        BE.add("AKSHU");
        BE.add("Rutu");
        BE.add("Shreya");
        map.put("FE", FE);
        map.put("SE", SE);
        map.put("TE", TE);
        map.put("BE", BE);
        Set<Map.Entry<String, ArrayList<String>>> setData = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> data : setData) {
            String key = data.getKey();
            System.out.println("Class " + key);
            System.out.println("_____________");

            ArrayList<String> al = data.getValue();
            for (String v : al) {
                System.out.println(v);
            }
        }
    }
}