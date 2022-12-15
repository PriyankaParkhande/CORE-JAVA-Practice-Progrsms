
class aa {
    private static aa a1 = null;

    private aa() {
        System.out.println("i am private constructor");
    }

    public static aa getInstance() {
        if (a1 == null) {
            a1 = new aa();
        }
        return a1;
    }
}

public class SingleTone {
    aa a1 = aa.getInstance();
}