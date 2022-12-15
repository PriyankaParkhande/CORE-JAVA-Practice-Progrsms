import java.util.*;

public class StringEndWITHCountApplication {
    public static void main(String[] args) {
        String s[] = new String[10];
        System.out.println("Enter the data of 10 strings");
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            Scanner xyz = new Scanner(System.in);
            s[i] = new String();
            s[i] = xyz.nextLine();
            if (s[i].endsWith("sh")) {
                count++;
            }
        }
        System.out.println("Number of strings ends with sh " + count);
    }
}