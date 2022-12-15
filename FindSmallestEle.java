import java.util.*;

class FindKthEle {
    int n;

    public void FindPosition(int a[], int k) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("kth position in an array is : " + a[k - 1]);
    }
}

public class FindSmallestEle {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the size of array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements in  array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k;
        System.out.println("enter the position which you want to find");
        k = sc.nextInt();
        sc.close();
        FindKthEle f = new FindKthEle();
        f.FindPosition(a, k);
        // System.out.println("kth position in an array is : " + [k-1]);
    }
}