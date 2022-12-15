import java.util.*;

class MusicInstrument {
    void checkIQ(int xx) {
        if (xx>=163) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

public class MusicInstrumentApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int xx = sc.nextInt();
        sc.close();
        MusicInstrument s = new MusicInstrument();
        s.checkIQ(xx);
    }
}