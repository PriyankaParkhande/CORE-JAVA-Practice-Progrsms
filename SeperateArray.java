import java.util.*;

class segregateArray {
    void ArraySeprate(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = 0;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(" -ve and +ve no Sort array is :");

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);

        }
    }
}

public class SeperateArray {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the  size of array");
        n = sc.nextInt();
        System.out.println("enter the element in array");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        segregateArray s = new segregateArray();
        s.ArraySeprate(a, n);

    }
}