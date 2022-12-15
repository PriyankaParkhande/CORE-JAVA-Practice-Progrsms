public class CalLengthStr {
    public static void main(String[] args) {

        String s = "good";
        int count = 0;
        do {
            try {

                s.charAt(count);
                count++;
            } catch (Exception ex) {
                break;
            }
        } while (true);
        System.out.println("Length of string is " + count);
    }
}
