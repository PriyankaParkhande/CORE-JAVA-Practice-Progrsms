import java.util.*;

class arrayOperationt3 {
    int size;
    int a[] = new int[size];
    int count = 0;

    // parametrize constructor
    arrayOperationt3(int a[]) {
        this.a = a;
    }

    // metod for array operation repetative array

    void arrOp() {
        System.out.println("repeatative element in array is:");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
            }
        }

    }
}

public class arrayOperationt3App {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("enter the size of array");
        size = sc.nextInt();// input array size
        int a[] = new int[size];// array declartion
        System.out.println("enter the element in array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();// for input array
        }
        sc.close();
        arrayOperationt3 a1 = new arrayOperationt3(a);// obj creation
        a1.arrOp();// method call
    }
}