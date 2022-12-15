import java.util.*;

class arrayBase {
    int size;

    int a[] = new int[size];

    // parametrize constructor
    arrayBase(int a[]) {
        this.a = a;
    }

    // metod for array operation repetative array
    void findThird() {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        // for print 3rd largest element;
        // int max=a[2];
        System.out.println("third largest element in array is");
        for (int i = 2; i <= 2; i++) {
            System.out.println(a[2]);

        }

    }
}

public class arrayBaseApp {
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
        arrayBase a1 = new arrayBase(a);// obj creation
        a1.findThird();// method call
    }
}