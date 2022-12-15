// Java program to illustrate toString() Method

class tostringmethod {
    public static void main(String[] args) {
        Integer I = new Integer(10);
        String s = I.toString();
        String s = Integer.toString(10);
        System.out.println(s);

        String s1 = Character.toString('a');
        System.out.println(s1);
        System.out.println(s);
        String s = Integer.toString(15, 2);
        System.out.println(s);

        String s1 = Long.toString(11110000, 4);
        System.out.println(s1);
    }
}
