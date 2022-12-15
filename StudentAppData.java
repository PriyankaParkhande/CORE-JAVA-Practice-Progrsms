import java.util.*;

class student {
    private String name[];
    private int id;
    private float per;

    void setData(int id, String name[], float per) {
        this.name = name;
        this.id = id;
        this.per = per;
    }

    void showData() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Displaying Student Data" + id + "\t" + name + "\t" + per);
        }

    }

}

public class StudentAppData {
    public static void main(String a[]) {
        int id;
        String name;
        float per;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id,name and per of student");
        for (int i = 0; i < 5; i++) {
            id = sc.nextInt();
            name = sc.next();
            per = sc.nextFloat();
        }
        student st = new student();
        st.setData(id, name, per);
        st.showData();

    }
}