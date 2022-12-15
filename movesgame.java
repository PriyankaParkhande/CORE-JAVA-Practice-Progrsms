import java.util.*;

public class movesgame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size, flag = 0;
        System.out.println("enter the size of moves");
        size = sc.nextInt();
        int moves[] = new int[size];
        for (int i = 0; i < size; i++) {y
            moves[i] = sc.nextInt();
        }
        for (int i = size - 1; i <= size - 1; i++) {
            if (moves[size - 1] % 2 == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("jayansh");
        } else {
            System.out.println("jay");
        }
    }

}
