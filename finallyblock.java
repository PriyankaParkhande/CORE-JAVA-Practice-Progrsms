import java.util.*;

class finallyblock {
    public static void main(String x[]) {
        try {

            Scanner sc = new Scanner(System.in);
            int z = sc.nextInt();
            int y = sc.nextInt();
            sc.close();
            int dividebyzero = z / y;
            System.out.println("try block" + dividebyzero);

        } catch (Exception e) {
            System.out.println("arithmetic exception" + e.toString());
        } finally {
            System.out.println("finally block");
        }
    }
}
