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

public class ToStringEgApp {
    public static void main(String x[]) {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("ABC");
        emp.setSal(10000);

        Employee emp1 = new Employee();
        emp1.setId(2);
        emp1.setName("MNO");
        emp1.setSal(20000);

        Employee emp2 = new Employee();
        emp2.setId(3);
        emp2.setName("PQR");
        emp2.setSal(30000);

        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(emp1);
        al.add(emp2);
        al.add(emp);

        for (Employee e : al) {
            System.out.println(e);
        }

    }
}