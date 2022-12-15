import java.util.Scanner;

public class rotatearr {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int size;
        System.out.println("enter size of array");
        size = sc.nextInt();
        System.out.println("enter elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int temp;
        temp = arr[0];
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) {
                arr[i] = arr[j];
                break;
            }
            System.out.println("after array rotate:\n" + arr[i]);
        }
        arr[size - 1] = temp;
        System.out.println("after array rotate:\n" + temp);
    }
}