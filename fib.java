import java.util.*;

public class fib {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int n1 = 0, n2 = 1, n3 = 0, i;
        for (i = 0; i <= n; i++) {
            System.out.println(n3);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        sc.close();
    }
}