import java.util.*;

class FindFactorial

{
    int no;

    void FindFact(int no) {
        this.no = no;
    }

    void finffactNO() {
        int result = 1;
        for (int i = 1; i <= no; i++) {
            result = result * i;
        }
        System.out.println("factorial of no " + result);
    }
}

public class FindFactorialApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("enter no which you want to find factorial");
        no = sc.nextInt();
        sc.close();
        FindFactorial f = new FindFactorial();
        f.FindFact(no);
        f.finffactNO();
    }
}