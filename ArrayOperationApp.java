import java.util.*;

interface ArrayOperation {
    void performOperation(int a[]);// by default public abstract performoperation
}

class sorting implements ArrayOperation {

    public void performOperation(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("array after sorting ");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

class insertion implements ArrayOperation {
    int no, ind;

    void setVlue(int no, int ind) {
        this.no = no;
        this.ind = ind;
    }

    public void performOperation(int a[]) {
        for (int i = (a.length - 1); i > ind; i--) {

            a[i] = a[i - 1];

        }
        a[ind] = no;
        System.out.println("array after inserting");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}

class deletion implements ArrayOperation {
    int ind;

    void setVlue(int ind) {

        this.ind = ind;
    }

    public void performOperation(int a[]) {
        int na[] = new int[a.length - 1];
        for (int i = 0, k = 0; i > a.length; i++) {

            if (i != ind) {
                na[k] = a[i];
                k++;
            }

        }

        System.out.println("array after deleting");
        for (int i = 0; i < na.length; i++) {
            System.out.println(na[i]);
        }

    }
}

class reverse implements ArrayOperation {

    public void performOperation(int a[]) {
        System.out.println("reverse of array is:");
        for (int i = 0; i < a.length / 2; i++) {
            int temp;
            temp = a[i];

            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}

public class ArrayOperationApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int size;
        int no;
        int ind;
        // int na[]=new int[size-1];
        System.out.println("enter the size of array ");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("enter the element in array ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        // sorting array call
        sorting s = new sorting();
        s.performOperation(a);
        System.out.println("enter the no which u want to add array ");
        no = sc.nextInt();
        System.out.println("enter the index where u want to add array ");
        ind = sc.nextInt();
        // inserting array call
        insertion i = new insertion();
        i.setVlue(no, ind);
        i.performOperation(a);

        System.out.println("enter the index where u want to add array ");
        ind = sc.nextInt();
        sc.close();
        // deleting array call
        deletion d = new deletion();
        d.setVlue(ind);
        d.performOperation(a);
        // reverse array call
        reverse r = new reverse();
        r.performOperation(a);
    }
}
