
class a {
    a() {
        this(5);
        System.out.println("i am default constuctor");
    }

    a(int i) {
        this(5.5f);
        System.out.println("i am integer constuctor");
    }

    a(float i) {
        System.out.println("i am flot constuctor");
    }

}

public class thisconstructor {
    public static void main(String x[]) {
        a a1 = new a();
    }
}