import java.util.*;

static void displayelement(int a[],int n){for(int i=0;i<n;i++){for(int j=0;j<n;j++){if(i!=j&&a[i]==a[j]){break;}if(j==n)

System.out.println("nonrepeate integer count is:"+a[i]);return;}

}}

public class inttgernorepateApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a[] = new int[10];
        System.out.println("enter the size of array");
        n = sc.nextInt();
        System.out.println("enter the elements in  array");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

      //  displayelement(a, n);
    }
}