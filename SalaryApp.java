import java.util.*;

class Salary {
    String name;
    int id;
    int contactno;
    int presentday;
    int perdaysalary;
    int sal;

    Salary(String name, int id, int contactno, int presentday, int perdaysalary) {
        this.name = name;
        this.id = id;
        this.contactno = contactno;
        this.presentday = presentday;
        this.perdaysalary = perdaysalary;
    }

    void CalSalary() {
        sal = presentday * perdaysalary;
    }

    void DisplaySal() {
        System.out.println("Employee per month salary is " + id + name + contactno + sal);
    }

}

public class SalaryApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        int id;
        int contactno;
        int presentday;
        int perdaysalary;
        System.out.println("enter the name ,id,contact no,presentday and perday salary");
        name = sc.nextLine();
        id = sc.nextInt();
        contactno = sc.nextInt();
        presentday = sc.nextInt();
        perdaysalary = sc.nextInt();

        sc.close();

        Salary s = new Salary(name, id, contactno, presentday, perdaysalary);
        s.CalSalary();
        s.DisplaySal();

    }
}