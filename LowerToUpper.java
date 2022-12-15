public class LowerToUpper {
    public static void main(String[] args) {
        String s = "good";
        String resultantString = myToUpperCase(s);
        System.out.println(resultantString);
    }

    public static String myToUpperCase(String s) {

        int len = s.length();
        String s1 = "";
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // int result=(int)ch-32;
                // ch=(char)result;
                ch = (char) ((int) ch - 32);
                s1 = s1 + ch;
            }
        }
        return s1;
    }
}
