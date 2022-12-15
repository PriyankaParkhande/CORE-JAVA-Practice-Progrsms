import java.util.*;

class cook {
    int ttimetobake = 40;
    int timebake;

    void Findcook(int time) {
        if (time >= 40) {
            System.out.println("invalid time");
        } else {
            timebake = ttimetobake - time;
        }
        System.out.println("total  time for bake is: " + timebake);

    }
}

public class cookApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int time;
        System.out.println("enter the time need to bake");
        time = sc.nextInt();
        sc.close();
        cook c = new cook();
        c.Findcook(time);
    }
}