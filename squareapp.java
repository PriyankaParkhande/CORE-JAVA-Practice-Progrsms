import java.util.*;

class Square {
    private int side;

    void getSide(int side) {
        this.side = side;
    }

    void showArea() {
        System.out.println("area of square is:" + side * side);
    }

}

public class squareapp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int side;
        System.out.println("enter the side of square :");
        side = sc.nextInt();
        sc.close();
        Square s = new Square();
        s.getSide(side);
        s.showArea();
    }
}