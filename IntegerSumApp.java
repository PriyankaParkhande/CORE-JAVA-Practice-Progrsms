import java.util.*;

class IntegerSum {
    // private int n;
    private int k;
    private int count = 0;
    private int a[];

    // int setarr(int a[],int n,int k)
    // {
    // this.a=a;
    // this.k=k;
    // this.n=n;

    void displaySum() {
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if ((a[i] + a[j]) == k)
                    count++;
        System.out.println("sum of intyeger count is:" + count);
        // return count;

    }
}

public class IntegerSumApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int n;

        int a[] = new int[10];
        System.out.println("enter the size of array");
        n = sc.nextInt();
        System.out.println("enter the elements in  array");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the sum of integer");
        int k;
        k = sc.nextInt();
        sc.close();
        IntegerSum s = new IntegerSum();

        s.displaySum();
    }
}