import java.util.Scanner;

public class arrrev {
    public static void main(String x[]) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("enter the size of array");
        int n;
        n = s.nextInt();
        System.out.println("enter element in array");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n/2; i++) 
        {
            int temp = a[i];
            a[i] = a[n - i- 1];
            a[n - i- 1] = temp;
        }
        System.out.println("display array in reverse manner");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }
}