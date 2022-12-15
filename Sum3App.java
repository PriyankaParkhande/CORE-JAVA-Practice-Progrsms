import java.util.*;

class Sum3 {
    int sum = 0;

    void findSumOfThreeDigit(int a, int b, int c) {
        sum = a + b + c;
        System.out.println("sum is:" + sum);
    }
}

public class Sum3App {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("enter three no a,b,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
        Sum3 s = new Sum3();
        s.findSumOfThreeDigit(a, b, c);
    }
}