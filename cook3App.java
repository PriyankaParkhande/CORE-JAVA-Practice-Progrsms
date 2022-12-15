import java.util.*;

class cook3 {
    int tlayerCost;

    void findCostOfLyer(int n, int m) {
        tlayerCost = (2 * n) + m;
        System.out.println("total layer cost is: " + tlayerCost);
    }

}

public class cook3App {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int m;// time already
        int n;// no of layer
        System.out.println("enter the layer you want to add");
        n = sc.nextInt();
        System.out.println("enter the time spend by lasagna baking");
        m = sc.nextInt();
        sc.close();
        cook3 c = new cook3();
        c.findCostOfLyer(n, m);
    }
}