import java.util.Scanner;

public class add {
    public static void main(String args[]) {
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number whic you want to add");
        int n1 = sc.nextInt();
        System.out.println("enter second number whic you want to add");
        int n2 = sc.nextInt();
        sc.close();
        sum = n1 + n2;
        System.out.println("addition of two no is:" + sum);
    }
}