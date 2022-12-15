import java.util.*;

class Circle {
    private int radius;
    // private int area;

    void setRadius(int radius) {
        this.radius = radius;
    }

    void showArea() {
        // int area;
        // area = 3.14 * (radius * radius);
        System.out.println("area of circle is:" + 3.14 * (radius * radius));
    }
}

public class circleapp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int radius;
        System.out.println("enter the radius of circle ");
        radius = sc.nextInt();
        sc.close();
        Circle a = new Circle();
        a.setRadius(radius);
        a.showArea();
    }
}
