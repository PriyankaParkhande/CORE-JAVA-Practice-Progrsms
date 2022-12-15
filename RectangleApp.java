import java.util.*;

class rect {
    int length;
    int breadth;
    int area;

    rect() {
        length = 0;
        breadth = 0;
    }

    rect(int l, int b) {
        length = l;
        breadth = b;
    }

    rect(int a) {
        area = a;
    }

    void CalArea() {
        area = length * breadth;
        System.out.println("area of rectangle is:" + area);
    }

}

public class RectangleApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int length = 0;
        int breadth = 0;
        int area = 0;
        System.out.println("enter the length of rectangle:");
        length = sc.nextInt();
        System.out.println("enter the breadth of rectangle:");
        breadth = sc.nextInt();
        sc.close();
        // rect r = new rect();
        // r.CalArea();
        rect r0 = new rect(length, breadth);
        r0.CalArea();
        rect r1 = new rect(area);
        // r1.CalArea();

    }
}