import java.util.Scanner;

public class tarray {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.println("enetr the elements in matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
        // System.out.println("Dispaly element of array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(+a[i][j]);
            }
            System.out.print("\n");
        }
    }
}