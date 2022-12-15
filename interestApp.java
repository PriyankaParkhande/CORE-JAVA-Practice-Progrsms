import java.util.*;

class interest {
    int pamt;
    int irate;
    int dur;
    int tinterest;

    void setPRD(int pamt, int irate, int dur) {
        this.pamt = pamt;
        this.irate = irate;
        this.dur = dur;
    }
}

class calculateInterstRate extends interest {
    void calInteresst() {
        tinterest = (pamt * irate * dur) / 100;
        System.out.println("iterest=" + tinterest);
    }

}

public class interestApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int pamt;
        int irate;
        int dur;
        System.out.println("enter the principle amount,interest rate and duration");
        pamt = sc.nextInt();
        irate = sc.nextInt();
        dur = sc.nextInt();
        sc.close();
        calculateInterstRate c = new calculateInterstRate();
        c.setPRD(pamt, irate, dur);
        c.calInteresst();
    }
}