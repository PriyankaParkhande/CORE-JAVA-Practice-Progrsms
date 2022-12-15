import java.util.*;

class cook2 {
    int tlayerCost;

    void findCostOfLyer(int layer) {
        tlayerCost = 2 * layer;
        System.out.println("total layer cost is: " + tlayerCost);
    }

}

public class cook2App {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int layer;
        System.out.println("enter the layer you want to add");
        layer = sc.nextInt();
        sc.close();
        cook2 c = new cook2();
        c.findCostOfLyer(layer);
    }
}