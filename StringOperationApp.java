
import java.util.Scanner;

abstract class StringOperation {
    abstract void performOperation(String str);
}

class converToUpper extends StringOperation {
    void performOperation(String str) {
        System.out.println(str.toUpperCase());
    }
}

class MaxRepeateStr extends StringOperation {

    int count = 0;
    int new_co;
    String MaxRep;

    void performOperation(String str) {

        int len = str.length();
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

class WordReverseStr extends StringOperation {
    void performOperation(String str) {
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

public class StringOperationApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;
        System.out.println("enter the string");
        str = sc.next();
        sc.close();
        converToUpper c = new converToUpper();
        c.performOperation(str);
        // MaxRepeateStr m = new MaxRepeateStr();
        // m.performOperation(str);
        WordReverseStr w = new WordReverseStr();
        w.performOperation(str);

    }

}
