

class Encrypt {

    Encrypt(String string) {

        int count = 0;

        char temp = '0';

        System.out.println("string after encrption is");

        for (int i = 0; i < string.length(); i++) {

            count = 0;

            for (int j = 0; j < string.length(); j++) {

                if (string.charAt(i) == string.charAt(j)) {

                    count++;

                }

            }

            if (temp != string.charAt(i)) {

                temp = string.charAt(i);

                System.out.printf("%s%d", string.charAt(i), count);

            }

        }

    }

    public void beforeEncryption(String string) {

        System.out.println("\nThe original String is: " + string);

    }

}

public class EncryptiontApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");

        String string = sc.next();

        sc.close();

        Encrypt En = new Encrypt(string);

        En.beforeEncryption(string);

    }

}