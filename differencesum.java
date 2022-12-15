import java.util.*;

public class differencesum {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, result;
        System.out.println("enter two number ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if (n1 > n2) {
            result = n1 - n2;
        } else {
            result = n1 + n2;
        }
        System.out.println(result);
    }
}