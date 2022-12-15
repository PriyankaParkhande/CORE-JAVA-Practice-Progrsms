import java.util.*;

class AddAmount {
    int amount = 50;

    AddAmount() {
        System.out.println("no amount will be added");
    }

    AddAmount(int addrs) {
        amount += addrs;

    }

    void DisplayFinalRs() {
        System.out.println("final amount in pigie bank is" + amount);
    }

}

public class AddAmountApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int addrs;
        System.out.println("enter the ammount you want to add");
        addrs = sc.nextInt();
        sc.close();
        if (addrs == 0) {
            AddAmount a = new AddAmount();
        }
        AddAmount a = new AddAmount(addrs);
        a.DisplayFinalRs();
    }
}