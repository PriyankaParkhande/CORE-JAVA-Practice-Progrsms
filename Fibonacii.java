import java.util.*;

public class Fibonacii {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int n, n1 = 0, n2 = 1, i, no;
        n = n1 + n2;
        System.out.println("enter no where you want to print");
        no = sc.nextInt();
        sc.close();
        System.out.print("fibonacii series is : \n " + n1 + "  " + n2);
        for (i = 2; i < no; i++) {
            n = n1 + n2;
            System.out.print(" " + n);
            n1 = n2;
            n2 = n;

        }

    }
}