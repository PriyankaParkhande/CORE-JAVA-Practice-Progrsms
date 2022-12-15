import java.util.*;

class SubArray {
    int s;

    public void FindSum(int a[], int n, int cs) {
        for (int i = 0; i < n; i++) {
            cs = a[i];
            for (int j = i + 1; j <= n; j++) {
                if (cs == s) {
                    int temp;
                    temp = j - 1;
                    System.out.println("index between addition : " + i + "&" + temp);
                } else {
                    break;
                }
            }
        }

        System.out.println("sum not found : ");
    }
}

public class SubArrayApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int n;
       // int cs;
        System.out.println("enter the size of array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements in  array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int s;
        System.out.println("enter the sum which you want to find");
        s = sc.nextInt();
        sc.close();
        SubArray f = new SubArray();
        f.FindSum(a, n, s);
        // System.out.println("sth position in an array is : " + [k-1]);
    }
}