import java.util.*;

class MergeArray// class declaration for merging two array
{
    int size1;
    int size2;
    int a[] = new int[size1];
    int b[] = new int[size2];
    int a1 = a.length;
    int b1 = b.length;
    int m = a1 + b1;
    int[] merge= new int[m];

    for(
    int i = 0;i<m1.length;i++)
    {
        System.out.println(merge[i]);
    }

}

public class MergeArrayApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int size1;
        int size2;

        System.out.println("enter the size of 1st array");
        size1 = sc.nextInt();
        System.out.println("enter the elements in array");
        int a[] = new int[size1];// declaring array 1
        for (int i = 0; i < size1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the size of 2nd array");
        size2 = sc.nextInt();
        System.out.println("enter the elements in array");
        int b[] = new int[size2];// declaring array 2
        int merge[] = new int[a.length + b.length];
        for (int i = 0; i < size1; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();
        MergeArray m = new MergeArray();
    
    }
}