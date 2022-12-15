import java.util.*;

class RemoveSpace {
    int count = 0;
    char[] str;

    public void acceptString(char[] str) {
        str = str;

    }

    public String RemoveSpceSTR(char[] str) {

        for (int i = 0; i < str.length; i++) {
            if (str[i] != ' ')
                str[count++] = str[i];
        }

        return count;
    }
}

public class RemovedSpaceString {
    public static void main(String x[]) {
        char[] str;
        System.out.println("enter 1st string");

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        // RemoveSpace m = n;

        int i = RemoveSpceSTR(str);
        System.out.println(String.valueOf(str).subSequence(0, i));
    }
}
