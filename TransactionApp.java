import java.util.*;

class Transaction {
    double acbalance = 0;

    void FindWidtawalAmt(double x, double y) {
        // y = 120;

        if (x / 5 != 0 && x <= y) {
            acbalance = (y - x) - (0.50f);
            System.out.println(acbalance);
        } if ( x / 5 == 0 || x > y)

        {
            System.out.println(y);
        }
    }
}

public class TransactionApp {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();
        Transaction t = new Transaction();
        t.FindWidtawalAmt(x, y);
    }
}