import java.util.Scanner;

public class FindMin {
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("enter the five element in array");
        for (int i = 0; i < a.length; i++) {
            a[i] = xyz.nextInt();
        }
        xyz.close();
        int min = a[0];
        System.out.println("Displaying array element");
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            System.out.println("Display elements\n" + i + "\t" + a[i]);
        }
        System.out.println("the min no in an array is : \n" + min);
    }
}