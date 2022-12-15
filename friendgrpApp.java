import java.util.*;

class friendgrp {
    void checkCapacity(int nn, int mm, int kk) {
        if (nn <= 100 && mm <= 100 && kk <= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

public class friendgrpApp {
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
int nn,mm,kk;
nn=sc.nextInt();
mm=sc.nextInt();
kk=sc.nextInt();
        sc.close();
        friendgrp f=new friendgrp();
        f.checkCapacity(nn,mm,kk);
    }
}