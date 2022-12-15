import java.util.*;

class Encrypt {
    String msg;
    String temp;
    int count = 1;

    Encrypt(String msg) {
        this.msg = msg;
        temp = msg;

        for (int i = 0; i < msg.length(); i++) {
            for (int j = i; j < msg.length(); j++) {

                while ((i + 1) < msg.length()) {
                    if (i == j)
                        i++;
                    count++;
                }
            }

        }
    }

    void BeforeEncrypt() {
        System.out.println("msg after encryption:" + msg + count);
    }

    void AfterEncrypt() {
        System.out.println("msg after encryption:" + count + temp);
    }

}

public class EncryptApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        String msg;
        System.out.println("enter msg which you want to encrypt");
        msg = sc.nextLine();
        sc.close();
        Encrypt e = new Encrypt(msg);
        e.BeforeEncrypt();
        e.AfterEncrypt();

    }

}