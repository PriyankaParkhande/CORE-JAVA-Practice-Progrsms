import java.util.*;

class mergeArr {// class for merging array
    int c = 0;// variable for store count the array element or add two array

    void marray(int x[], int y[], int merge[]) {
        // method for marging array 1st
        for (int i = 0; i < x.length; i++) {
            merge[i] = x[i];// mergin 1st array
            c++;
        }
        for (int j = 0; j < y.length; j++) {
            // for array second
            merge[c++] = y[j];// merging 2nd array

        }
        System.out.println("after merging array");
        // for printing merge array
        System.out.println("merging array is");
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i]);
        }
        // for sort array
        for (int i = 0; i < merge.length; i++) {
            for (int j = i + 1; j < merge.length; j++) {
                if (merge[i] < merge[j]) {
                    int temp;
                    temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }
        // for print merge sorted array
        System.out.println("sorted merging array is");
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i]);
        }

    }

}

public class mergeArray {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int s1;// for array size 1st
        int s2;// for array size 2nd

        System.out.println("enter the size of 1st array");
        s1 = sc.nextInt();// inputsize 1
        int x[] = new int[s1];
        System.out.println("enter element in 1st array");

        for (int i = 0; i < s1; i++) {
            x[i] = sc.nextInt();// input 2nd array
        }
        System.out.println("enter the size of 2nd array");
        s2 = sc.nextInt();// input size of 1st array
        int y[] = new int[s2];
        System.out.println("enter element in 2nd array");
        for (int i = 0; i < s2; i++) {
            y[i] = sc.nextInt();// input 2nd array
        }
        int merge[] = new int[x.length + y.length];// aray for merging array

        sc.close();
        mergeArr m = new mergeArr();// obj creation
        m.marray(x, y, merge);// call method merge and sort array

    }
}