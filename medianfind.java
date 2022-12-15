import java.util.*;

public class medianfind {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int merge[] = new int[10];
        int i, j, temp, size, size1, n = 10;
        double mm = 0;
        System.out.println("enter the size of 1st array");
        size = sc.nextInt();
        System.out.println("enter the elements in 1st array");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
            merge[i] = a[i];
        }
        j = i;
        System.out.println("enter the size of second array");
        size1 = sc.nextInt();
        System.out.println("enter the elements in 2nd array");
        for (i = 0; i < size1; i++) {
            a[i] = sc.nextInt();
            merge[j] = b[i];
            j++;
        }
        sc.close();
        for (i = 0; i < merge.length; i++) {
            System.out.println(merge[i]);
        }
        // sort array
        for (i = 0; i < merge.length; i++) {
            for (j = (i + 1); j < merge.length; j++) {
                if (merge[i] > merge[j]) {
                    temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }
        for (i = 0; i < merge.length; i++) {
            System.out.println(merge[i]);
        }
        if (n % 2 == 1) {
            mm = merge[(n + 1) / 2 - 1];

        } else {
            mm = (merge[n / 2 - 1] + merge[n / 2]) / 2;
        }
        System.out.println("median of sorted array is:\n" + mm);
    }
}
