import java.util.*;

class ContigiousSubArray1 {
    int start;
    int end;
    int sum;
    int max;

    void FindMaxSubArray(int a[], int n) {
        max = a[0];
        System.out.println("subarray is:");
        for (start = 0; start < n; start++) {
            for (end = start; end < n; end++) {
                for (int k = start; k <= end; k++)

                {
                    System.out.println(a[k] + "  ");

                    sum = sum + a[k];
                    // k++;
                }

                System.out.println();
            }

        }
        for (start = 0; start < n; start++) {
            for (int k = start; k < n; k++) {
                if (sum > max) {

                    max = sum;
                }

            }
        }

        System.out.println("max element in subarray is" + max);

    }
    // System.out.println("max element in subarray is"+max);
}

public class ContigiousSubArray1App {
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
        ContigiousSubArray1 c = new ContigiousSubArray1();
        c.FindMaxSubArray(a, n);
    }
}