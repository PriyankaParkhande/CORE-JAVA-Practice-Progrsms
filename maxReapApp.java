import java.util.*;

class maxReap {
    int count = 0;
    int new_co;
    String MaxRep;

    void finfMaxRepChar(String str) {

        // int len = str.length();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; i < str.length(); j++) {
                if (i == j) {
                    count++;

                }
                if (new_co < count) {
                    count = new_co;
                    MaxRep = str;
                }

            }

        }
        System.out.print("max repeatative char is:");
        System.out.println(MaxRep);
    }
}

public class maxReapApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;
        System.out.println("enter the string");
        str = sc.next();
        sc.close();
        maxReap s = new maxReap();
        s.finfMaxRepChar(str);

    }
}