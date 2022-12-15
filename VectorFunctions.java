package vectorPrograms;
import java.util.*;

public class VectorFunctions {

	public static void main(String[] args) {
Vector list=new Vector();

list.addElement("priya");
list.addElement("ankita");
list.addElement("anuja");
list.addElement("vinya");
list.addElement("rushi");
System.out.println("add element function: "+list);
list.insertElementAt("piya", 3);
System.out.println("insert ellemnt function : "+list);
System.out.println("list function: "+list.size());
list.removeElement("piya");
System.out.println("remove element function: "+list);
list.addElement("piya");
System.out.println("add element fun: "+list);
list.removeElementAt(5);
System.out.println("remove element at function"+list);
list.removeAllElements();
System.out.println("remove all element function: "+list);

	}

}
