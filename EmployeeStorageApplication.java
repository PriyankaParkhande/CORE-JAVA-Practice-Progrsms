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

    private int sal;
}

public class EmployeeStorageApplication {
    public static void main(String[] args) throws Exception {
        ArrayList al = new ArrayList();
        Employee emp[] = new Employee[5]; // array of reference
        for (int i = 0; i < emp.length; i++) {
            Scanner xyz = new Scanner(System.in);
            System.out.println("Enter the name id and salary of employee");
            String name = xyz.nextLine();
            int id = xyz.nextInt();
            int sal = xyz.nextInt();
            emp[i] = new Employee(name, id, sal); // Array of objects
            al.add(emp[i]);
        }
        System.out.println("Employee Records before sorting");
        for (Object obj : al) {
            Employee e = (Employee) obj;
            System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
        }
        Collections.sort(al);
        System.out.println("Employee Records After sorting");
        for (Object obj : al) {
            Employee e = (Employee) obj;
            System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
        }
    }
}
