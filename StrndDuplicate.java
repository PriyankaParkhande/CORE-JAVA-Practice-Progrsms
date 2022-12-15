
import java.util.*;

public class StrndDuplicate {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        LinkedHashMap map = new LinkedHashMap();
        do {
            Scanner xyz = new Scanner(System.in);
            String s = xyz.nextLine();
            if (s.length() == 0) {
                break;
            }
            al.add(s);
        } while (true);

        for (String s : al) {
            Integer count = (Integer) map.get(s);
            if (count != null) {
                ++count;
                map.put(s, count);
            } else {
                map.put(s, 1);
            }
        }
        Set<Map.Entry<String, Integer>> s = map.entrySet();
        System.out.println("Duplicated String values are ");
        for (Map.Entry<String, Integer> data : s) {
            if (data.getValue() > 1) {
                System.out.println(data.getKey() + "======>" + data.getValue());
            }
        }
    }
}