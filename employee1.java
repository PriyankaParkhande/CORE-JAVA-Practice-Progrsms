import java.util.*;
class employeeApp
{
	int id;
	String name;
	int sallury;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSallury() {
		return sallury;
	}
	public void setSallury(int sallury) {
		this.sallury = sallury;
	}
	void display()
	{
		System.out.println(getId());
		System.out.println( getName());
		System.out.println(getSallury());
	}
}
public class employee1 {

	public static <String> void main(String[] args) {
		// TODO Auto-generated method stub
		int id,sallury;
		String name;
		employeeApp a=new employeeApp();
		a.setId(id);
		a.setName(name);
		a.setSallury(sallury);
		a.display();

	}

}
