class Test {
    int no;

    Test(int no) {
        this.no = no;
    }

    public boolean equals(Object obj) {
        Test t = (Test) obj;
        if (this.no == t.no) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return no * 1000;
    }
}

public class TestcollectionApplication {

    public static void main(String[] args) {
        Test t1 = new Test(100);
        Test t2 = new Test(200);
        System.out.println("Hashcode of t1 is " + System.identityHashCode(t1));
        System.out.println("Hashcode of t2 is " + System.identityHashCode(t2));

        if (t1.equals(t2)) {
            System.out.println("Objects are equal");
            System.out.println("User hashcode for t1  " + t1.hashCode());
            System.out.println("User hashcode for t2 " + t2.hashCode());

        } else {
            System.out.println("Objects are not equal");
            System.out.println("User hashcode for t1  " + t1.hashCode());
            System.out.println("User hashcode for t2 " + t2.hashCode());

        }
    }

}