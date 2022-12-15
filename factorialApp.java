import java.util.*;

class factorial// class declaration

{
    int value;

    factorial(int value) {
        // parametrise constructor for set value
        this.value = value;
    }

    void calFactorial() {
        // method for calculate factorial
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result = result * i;// formula for calculate factorial of given no i.e value =5 the
                                // 1=1*5,5=5*4,20=20*3,60=60*2,120=120*1=120
        }
        System.out.println("factorial of no " + result);
    }
}

public class factorialApp {// driver class
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int value;
        System.out.println("enter no which you want to find factorial");
        value = sc.nextInt();// for input value
        sc.close();
        factorial f = new factorial(value);// parametrise constructor call
        f.calFactorial();// function call for calculate factorial
    }
}