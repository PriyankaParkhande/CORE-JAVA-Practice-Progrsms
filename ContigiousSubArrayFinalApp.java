import java.util.*;

class ContigiousSubArrayFinal {
    int sum;
    int max = 0;

    void MaxSum(int a[]) {
       

        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                System.out.println(sum);
                compare(sum);

            }
        }

    }

    void compare(int sum) {
        if (sum > max) {
            max = sum;
        }

    }

    void DisplaySum() {
        System.out.println("max sum is" + max);
    }

}

public class ContigiousSubArrayFinalApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("enter the size of array");
        n = sc.nextInt();
        System.out.println("enter elements in array");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        ContigiousSubArrayFinal c = new ContigiousSubArrayFinal();
        c.MaxSum(a);

        c.compare(sum);
        c.DisplaySum();
    }
}