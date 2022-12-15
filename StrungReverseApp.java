import java.util.*;

class StrungReverse {
    void revStr(String str) {
        String nstr = "";
        char ch;
        System.out.println("string after reverse");
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            // System.out.println(str);
            nstr = nstr + str.charAt(i);
        }
        System.out.println(nstr);
    }
}

public class StrungReverseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;
        System.out.println("enter the string");
        str = sc.next();
        sc.close();
        StrungReverse s = new StrungReverse();
        s.revStr(str);

    }
}