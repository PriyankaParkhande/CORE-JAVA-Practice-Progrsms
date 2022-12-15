import java.util.Scanner;//import scanner file

public class sub {
    public static void main(String args[]) {
        int a, b, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number");
        a = sc.nextInt();// input no1
        System.out.println("enter the 1st number");
        b = sc.nextInt();// input no2
        sum = a - b;
        sc.close();
        System.out.println("addition of two number is:" + sum);// DISPLAY OUTPUT
    }
}