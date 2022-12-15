import java.util.Scanner;
import java.util.Arrays;

public class ArrRotate {
    public static void main(String x[]) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[10];

        System.out.println("enter the size of array");
        int n;

        n = s.nextInt();
        // n = sizeof(a) / sizeof(a[0]);
        int y;
        y = a[n - 1];
        System.out.println("enter element in array");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
            a[0] = y;
            // break;

        }
        System.out.println("display array in reverse manner");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        // a[n - 1] = y;
        System.out.println(y);

    }
}