import java.util.*;
abstact class value {
    int a, b;

    void setValue(int x, int y) {
        a = x;
        b = y;
    }
}

class add extends value {
    void performCalculation() {
        System.out.println("addition is" + a + b);
    }
}

class mul extends value {
    void performCalculation() {
        System.out.println("multiplication is" + a * b);
    }
}

class div extends value {
    void performCalculation() {
        System.out.println("division is" + a / b);
    }
}

class sub extends value {
    void performCalculation() {
        System.out.println("substraction is" + a - b);
    }
}

class calculator {
    void performCalculation(value v) {
        v.performCalculation();
    }
}

public class looseCouplingApp {
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
         int a,b;
         System.out.println("enter the value of a and b");
         a=sc.nextInt();
         b=sc.nextInt();
         sc.close();
         int c;
         switch(c)
         {
             case 1:
            add a1=new add();
            a1.performCalculation();
            case 2:
            mul b1=new mul();
            b1.performCalculation();
            case 3:
            div c1=new div();
            c1.performCalculation();
            case 4:
            sub d1=new sub();
            d1.performCalculation();

            defualt:
            System.out.println("invalid entry");
         }
        
    }
}