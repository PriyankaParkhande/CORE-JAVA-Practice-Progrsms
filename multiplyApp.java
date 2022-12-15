import java.util.*;

public class multiplyApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        long a;
        long b;
        System.out.println("enter 2  vales");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        long result = 0;
        result = a * b;
        System.out.println(result);
    }
}