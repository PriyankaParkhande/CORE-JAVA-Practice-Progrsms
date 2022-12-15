import java.util.*;

public class StringEndStratApplication {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the first string");
        String first = xyz.nextLine();
        boolean b = first.endsWith("sh");
        if (b) {

            System.out.println("String ends with sh");
        } else {
            System.out.println("string not ends with sh");
        }
    }
}