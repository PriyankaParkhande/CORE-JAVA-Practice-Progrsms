import java.util.*;

class student {
    private String name;
    private int id;
    private float per;

    void setData(int id, String name, float per) {
        this.name = name;
        this.id = id;
        this.per = per;
    }

    void showData() {
        System.out.println("Displaying Student Data" + id + name + per);

    }

}

public class StudentApp {
    public static void main(String a[]) {
        int id;
        String name;
        float per;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id,name and per of student");
        id = sc.nextInt();
        name = sc.nextLine();
        per = sc.nextFloat();
        sc.close();
        student st = new student();
        st.setData(id, name, per);
        st.showData();

    }
}