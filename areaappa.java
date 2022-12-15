
import java.util.Scanner;

abstract class areaappa1 {

	abstract void CalArea();

}

class circle extends areaappa1 {
	int radius;

	public circle(int radius) {
		// super();
		// TODO Auto-generated constructor stub

		this.radius = radius;
	}

	void CalArea() {
		System.out.println("area of circle is:" + (Math.PI * radius * radius));

	}

}

class recta extends areaappa1 {
	int length;
	int width;

	public recta(int length, int width) {

		this.length = length;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	void CalArea() {

		System.out.println("area of rectangle is:" + length * width);

	}

}

public class areaappa {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		int length;
		int width;
		int radius;

		System.out.println("enter the radius");
		radius = sc.nextInt();
		circle c = new circle(radius);
		c.CalArea();

		System.out.println("enter length and width");
		length = sc.nextInt();
		width = sc.nextInt();
		sc.close();
		recta r = new recta(length, width);
		r.CalArea();
	}
}
