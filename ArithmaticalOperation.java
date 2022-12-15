import java.util.*;

class Value {
    int a, b;
    int result;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class add extends Value {
    void showAdd() {
        result = a + b;
        System.out.println("Addition of two no is:" + result);
    }

}

class mul extends Value {
    void showMul() {
        result = a * b;
        System.out.println("Multiplication of two no is:" + result);
    }

}

class div extends Value {
    void showDiv() {
        result = a / b;
        System.out.println("division of two no is:" + result);
    }

}

class sub extends Value {
    void showSub() {
        result = a - b;
        System.out.println("Substraction of two no is:" + result);
    }

}

public class ArithmaticalOperation {
    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a and b:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("enter the choise:");
        int ch = sc.nextInt();
        sc.close();

        switch (ch) {
            case 1:
                add a1 = new add();
                a1.setValue(a, b);
                a1.showAdd();
                break;
            case 2:
                mul m1 = new mul();
                m1.setValue(a, b);
                m1.showMul();
                break;
            case 3:
                div d1 = new div();
                d1.setValue(a, b);
                d1.showDiv();
                break;
            case 4:
                sub s1 = new sub();
                s1.setValue(a, b);
                s1.showSub();

                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }
}
