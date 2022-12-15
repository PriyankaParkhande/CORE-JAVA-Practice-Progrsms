public class StringMethodsApp {
    public static void main(String[] args) {
        String s = "good";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            System.out.printf("%c ---->%d\n", ch, i);

            s.toUpperCase();
            System.out.println(s);
        }
    }
}