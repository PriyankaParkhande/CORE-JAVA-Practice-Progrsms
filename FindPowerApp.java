import java.util.*;

class FindPower {
    int b1;
    int p1;
    int b2;
    int p2;

    void PowerFind(int b1, int p1, int b2, int p2) {
        this.b1 = b1;
        this.b2 = b2;
        this.p1 = p1;
        this.p2 = p2;
    }

    void AdditionOfPower() {
        int power = 1;
        int index;
        index = p1 + p2;
        for (int i = 0; i < index; i++) {
            power = power * b1;
        }
        System.out.println("Addition of power is:" + power);

    }
}

public class FindPowerApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int b1;
        int b2;
        int p1;
        int p2;
        System.out.println("enter the 1st base and power");
        b1 = sc.nextInt();
        p1 = sc.nextInt();
        System.out.println("enter the 2nd base and power");
        b2 = sc.nextInt();
        p2 = sc.nextInt();
        sc.close();
        FindPower p = new FindPower();
        p.PowerFind(b1, p1, b2, p2);
        p.AdditionOfPower();

    }
}