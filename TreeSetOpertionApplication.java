import java.util.*;

public class TreeSetOpertionApplication {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeSet hs = new TreeSet();
        do {
            Scanner xyz = new Scanner(System.in);
            System.out.println("1:Add Element in HashSet");
            System.out.println("2:View All Element from HashSet");
            System.out.println("3:Search Element in HashSet");
            System.out.println("4:Remove element from HashSet");
            System.out.println("5:Count the element from HashSet");
            System.out.println("Enter your choice");
            int choice = xyz.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value in set");
                    int val = xyz.nextInt();
                    hs.add(val);
                    break;
                case 2:
                    Iterator i = hs.iterator();
                    while (i.hasNext()) {
                        Object obj = i.next();
                        System.out.println(obj);
                    }
                    break;
                case 3:
                    System.out.println("Enter the search value");
                    int sval = xyz.nextInt();
                    boolean b = hs.contains(sval);
                    if (b) {
                        System.out.println("Element found");
                    } else {
                        System.out.println("element not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter value for delete");
                    val = xyz.nextInt();
                    b = hs.remove(val);
                    if (b) {
                        System.out.println("Value removed success...");
                    } else {
                        System.out.println("Value not removed");
                    }
                    break;
                case 5:
                    System.out.println("Number of element in collection " + hs.size());
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (true);// infinite loop
    }
}
