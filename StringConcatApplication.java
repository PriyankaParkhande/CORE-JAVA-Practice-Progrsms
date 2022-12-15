
import java.util.*;

public class StringConcatApplication {
    public static void main(String[] args) {
        String s = "good";
        String s1 = "bad";
        System.out.println("Before Concat s points to  " + System.identityHashCode(s));
        s = s.concat(s1);
        System.out.println("After Concat s points to   " + System.identityHashCode(s));
        System.out.println(s);
    }
}