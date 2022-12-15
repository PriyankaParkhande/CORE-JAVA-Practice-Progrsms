// if we create project of constructor inheritance then we create object of child class then it will automatically call the logic of
//  parent constructor fist and then calll logic of child

class a1 {
    a1() {
        System.out.println("i am parent class ");
    }
}

class c extends a1 {
    c() {
        System.out.println("i am child class ");
    }
}

public class ConstructorInheritance {
    public static void main(String x[]) {
        c c1 = new c();
    }
}