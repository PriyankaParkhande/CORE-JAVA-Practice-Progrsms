public class stringoperation {
    public static void main(String ar[]) {
        String s1 = "Java is a programming language. Java is a platform. Java is an Island.";
        String replaceString = s1.replace("Java", "Kava");// replaces all occurrences of "Java" to "Kava"
        System.out.println(replaceString);
        int a = 10;
        String s = String.valueOf(a);
        System.out.println(s + 10);
        String s = new String("Sachin");
        String s2 = s.intern();
        System.out.println(s2);// Sachin
        String s = "Sachin";
        System.out.println(s.length());// 6
        String s = "Sachin";
        System.out.println(s.charAt(0));// S
        System.out.println(s.charAt(3));// h
        String s = "Sachin";
        System.out.println(s.startsWith("Sa"));// true
        System.out.println(s.endsWith("n"));// true
        String s = "  Sachin  ";
        System.out.println(s);// Sachin
        System.out.println(s.trim());// Sachin
        String s = "Sachin";
        System.out.println(s.toUpperCase());// SACHIN
        System.out.println(s.toLowerCase());// sachin
        System.out.println(s);// Sachin(no change in original)
    }
}