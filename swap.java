import java.util.Scanner;

public class swap {
    public static void main(String args[]) {
        int n1, n2, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1 st no");
        n1 = sc.nextInt();
        System.out.println("enter the 1 st no");
        n2 = sc.nextInt();
        sc.close();
        System.out.println("befor swapping of two no is \n " + "a=" + n1 + "\t b=" + n2);
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("swapping of two no is \n " + "a=" + n1 + "\t b=" + n2);
        // System.out.println("swapping of two no is:"+n2);
    }
}