import java.util.*;

class ContigiousSubArray {
    // int sum = 0;
    int max = 0;

    void MaxSum(int a[], int n) {
        int sum = 0;
        max = a[0];

        for (int i = 0; i < n; i++) {
            // if (a[i] > sum ) {
            sum = sum + a[i];
            // }

            if (sum > max) {
                max = sum;
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("sum of array elements is:" + sum);
        System.out.println("max sum of array elements is:" + max);
    }
}

public class ContigiousSubArrayApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the size of array");
        n = sc.nextInt();
        System.out.println("enter elements in array");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        ContigiousSubArray c = new ContigiousSubArray();
        c.MaxSum(a, n);
    }
}