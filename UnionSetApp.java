import java.util.*;

class UnionSet {
    void FindUnion(int a[], int b[], int merge[], int c) {
        c = 0;
        for (int i = 0; i < a.length; i++) {
            merge[i] = a[i];
            c++;
        }
        for (int j = 0; j < b.length; j++) {
            merge[c++] = b[j];

        }
        System.out.println("after merging array");
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i]);
        }
        System.out.println("after union array");
        for (int i = 0; i < merge.length; i++) {
            for (int j = 0; j < merge.length; j++) {
                if (a[i] != a[j]) {
                    // break;
                    System.out.println(merge[i]);
                    c++;
                } else {
                    break;
                }
            }
        }
        System.out.println("count is:" + c);
        // for (int i = 0; i < merge.length; i++) {
        // System.out.println(merge[i]);
        // }
        //
        // 0; i < merge.length; i++) {
        // j = i + 1; j < merge.length; j++) {
        // a[i] > a[j]) {
        // int temp;
        // temp = a[i];
        // a[i] = a[j];
        // a[j] = temp;
        // }
        // }
        // }
        // System.out.println("array after merge");
        // for (int i = 0; i < merge.length; i++) {
        // System.out.println(merge[i]);
        // }

    }
}

public class UnionSetApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int a[] = new int[5];
        System.out.println("enter the elements in array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[5];
        System.out.println("enter the elements in 2nd array");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        int merge[] = new int[10];
        sc.close();

        UnionSet u = new UnionSet();
        u.FindUnion(a, b, merge, c);
    }
}