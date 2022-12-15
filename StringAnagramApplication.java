import java.util.*;

public class StringAnagramApplication {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        System.out.println("enter the first string");
        String first = xyz.nextLine();
        System.out.println("enter the second string");
        String second = xyz.nextLine();
        char ch[] = first.toCharArray();
        ArrayList al = new ArrayList();
        for (char c : ch) {
            al.add(c);
        }
        Collections.sort(al);
        char ch1[] = second.toCharArray();
        ArrayList al1 = new ArrayList();
        for (char c1 : ch1) {
            al1.add(c1);
        }
        Collections.sort(al1);
        if (al1.size() == al.size()) {
            String f = al.toString();
            String s = al.toString();
            if (f.equals(s)) {
                System.out.println("Strings are anagram");
            } else {
                System.out.println("Strings are not anagram");
            }
        } else {
            System.out.println("Not Anagram");
        }
    }
}
