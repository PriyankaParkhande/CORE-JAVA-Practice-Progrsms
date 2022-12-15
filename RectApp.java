import java.util.*;

class Rectangle {
    private int l, b;

    void setLandW(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void showArea() {
        System.out.println("area of rectangle is:" + l * b);
    }
}

public class RectApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int l;
        int b;
        System.out.println("enter the length and width of rectangle");
        l = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        Rectangle r = new Rectangle();
        r.setLandW(l, b);
        r.showArea();
    }
}