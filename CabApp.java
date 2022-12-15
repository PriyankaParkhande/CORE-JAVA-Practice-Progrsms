import java.util.*;

class cab {
    void FindMinCostCab(int xx, int yy) {
        if (xx > yy) {
            System.out.println("second");
        }
        if (xx < yy) {
            System.out.println("first");
        } if(xx==yy) {
            System.out.println("any");
        }
    }
}

public class CabApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int xx, yy;
        System.out.println("enter the 1st cab servies cost");
        xx = sc.nextInt();
        System.out.println("enter the 2nd cab servies cost");
        yy = sc.nextInt();
        sc.close();
        cab c = new cab();
        c.FindMinCostCab(xx, yy);
    }
}