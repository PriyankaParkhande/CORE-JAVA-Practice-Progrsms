import java.util.*;

class occuranceerationt3 {
    int size;
    int a[] = new int[size];

    // parametrize constructor
    arrayOperationt3(int a[]) {
        this.a = a;
    }

    // metod for array operation repetative array

    void arrOp() {
        System.out.println("repeatative element in array is:");
        for (int i = 0; i < a.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                // if (a[i] > a[j]) {
                // int temp;
                // temp = a[i];
                // a[i] = a[j];
                // a[j] = temp;
                // }
                if (a[i] == a[j]) {
                    count++;

                } else {
                    break;
                }
            }
            if (count > 1) {
                System.out.println(a[i] + "->" + count);
                i += (count - 1);
            }
        }

    }
}

public class arrayOperationt3Appocceren {
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