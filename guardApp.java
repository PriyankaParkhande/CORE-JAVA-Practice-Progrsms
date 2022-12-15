import java.util.*;

class guards {
    void findPredictGuard(int xx, int yy) {
        if (xx < yy) {
            System.out.println("NO");
        }
        if (xx > yy || xx==yy) {
            System.out.println("YES");
        }
    }
}

public class guardApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int xx, yy;
        xx = sc.nextInt();
        yy = sc.nextInt();
        sc.close();
        guards g = new guards();
        g.findPredictGuard(xx, yy);
    }
}