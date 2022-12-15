import java.util.*;

class Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String toString() {
        return "[" + name + "," + id + "," + sal + "]";
    }

    private int sal;
}

public class ToStringApp {
    public static void main(String x[]) {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("ABC");
        emp.setSal(10000);
        // String s=emp.toString();
        // System.out.println(s);
        System.out.println(emp); // emp.toString()
    }
}