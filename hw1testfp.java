import java.util.*;

public class hw1testfp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int size, flag = 0;
        System.out.println("enter the size of subject");
        size = sc.nextInt();
        System.out.println("enter the marks of subject");
        int sub[] = new int[size];
        for (int i = 0; i < size; i++) {
            sub[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (sub[i] <= 3) {
                // System.out.println("FAIL");
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("FAIL");

        } else {
            System.out.println("PASS");

        }

    }
}