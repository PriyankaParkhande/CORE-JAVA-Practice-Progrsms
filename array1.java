import java.util.Scanner;

public class array1 {
    public static void main(String a[]) {
        Scanner array = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the five element in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("display array \n" + i + "\t" +  arr[i]);
        }
    }
}