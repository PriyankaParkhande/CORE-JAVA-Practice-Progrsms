
public class AutoboxingExample {
    public static void main(String[] args) {
        // Converting an int primitive data type into an Integer object
        int number = 15;
        Integer obj = Integer.valueOf(number); // converting int into Integer explicitly
        System.out.println(number + " " + obj);

        // Converting char primitive data type into a Character object
        char character = 'a';
        Character obj1 = character;
        System.out.println(character + " " + obj1);

        // Using Collection Framework
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(16); // Autoboxing
        arrayList.add(35); // Autoboxing
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
    }
}