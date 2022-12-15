package studentinfo;
import java.util.*;
class GetDetails{
	 int id,per;
     String name;
     //getter setter method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void findTopper(int id,String name,int per) {
		//fun for finding topper
		this.id=id;
		this.name=name;
		this.per=per;
		
		
	}
	void display() {
		
		//fun for display data
		System.out.println(getId()+"\t"+getName()+"\t"+getPer());
	}
}
public class StudentAppLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int id = 0 ;
        int per = 0;
        String name = null;
        LinkedList lst = new LinkedList();//creating linkelist
        System.out.println("enter id,name and per of student");
        for(int i=0;i<10;i++) {
        	id=sc.nextInt();
        	name=sc.nextLine();
        	per=sc.nextInt();
        	lst.add(id);
        	lst.add(name);
        	lst.add(per);
        	
        }
        GetDetails st=new GetDetails();
        st.setId(id);
        st.setName(name);
        st.setPer(per);
        st.findTopper(id, name, per);//fun call
        st.display();//fun call for display
        
        
        System.out.println("LinkedList display");
        for (Object obj : lst) {
   
            System.out.println(obj);// display after sorting linked list
        }
        

	}

}
