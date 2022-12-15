import java.util.*;

class ContigiousMaxProduct {
    int Product;
    int max = 0;

    void MaxProduct(int a[]) {
       

        for (int i = 0; i < a.length; i++) {
            Product = 0;
            for (int j = i; j < a.length; j++) {
                Product = Product * a[j];
                System.out.println(Product);
                compare(Product);

            }
        }

    }

    void compare(int Product) {
        if (Product > max) {
            max = Product;
        }

    }

    void DisplayProduct() {
        System.out.println("max Product is" + max);
    }

}

public class ContigiousMaxProductApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        int Product = 0;
        System.out.println("enter the size of array");
        n = sc.nextInt();
        System.out.println("enter elements in array");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        ContigiousMaxProduct c = new ContigiousMaxProduct();
        c.MaxProduct(a);

        c.compare(Product);
        c.DisplayProduct();
    }
}