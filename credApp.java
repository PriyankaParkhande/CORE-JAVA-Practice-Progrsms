import java.util.*;

class cred {
    void PredictCred(int x) {
        if (x < 750) {
            System.out.println("NO");
        }
        if (x > 750) {
            System.out.println("YES");
        }
    }
}

public class credApp {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        sc.close();
        cred c = new cred();
        c.PredictCred(x);
    }
}