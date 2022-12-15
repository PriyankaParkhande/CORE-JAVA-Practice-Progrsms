import java.util.*;

class MyConCat {
    String str = "", str1, str2;

    public void acceptString(String str1, String str2) {
        str1 = str1;
        str2 = str2;
    }

    public String performConcat(String str1, String str2) {
        int l = str1.length();
        int m = str2.length();
        for (int i = 0; i <= l - 1; i++) {
            str += str1.charAt(i);
        }
        for (int j = 0; j <= m - 1; j++) {
            str += str2.charAt(j);
        }
        System.out.println(str);
        return str;
    }
}

public class Concatstr {
    public static void main(String x[]) {
        String str, str1, str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st string");
        str1 = sc.nextLine();
        System.out.println("enter 2n string");
        str2 = sc.nextLine();
        MyConCat m = new MyConCat();
        m.acceptString(str1, str2);
        m.performConcat(str1, str2);
    }
}
