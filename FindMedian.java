import java.util.*;

public class FindMedian {
    public static void main(String x[]) {
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int m[] = new int[15];
        double mm = 0;
        System.out.println("enter element in first array");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        // i = j;
        sc.close();
        System.out.println("enter element in second array");
        for (j = 0; j < 5; j++) {
            b[j] = sc.nextInt();
        }

        for (i = 0; i < 10; i++) {
            m[i] = a[i];
            m[i + 5] = b[i];
        }
        for (i = 0; i < 10; i++) {
            System.out.println(m[i]);
        }
        for (i = 0; i < 10; i++) {
            for (j = i + 1; j < 10; j++) {
                if (m[i] > m[j]) {
                    int temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
        for (i = 0; i < 10; i++) {
            System.out.println("sorted 1st array is: \n" + m[i]);
        }
        for (i = 0; i < 10; i++) {
            if (a[i] % 2 == 1) {
                mm = m[(i + 1) / 2 - 1];
            }
            System.out.println("sorted 1st array is: \n" + mm);
        }

    }
}