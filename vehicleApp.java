package inheritance;

import java.util.Scanner;

class vehicle
{
	String model;
	int vno;
	int speed;
	int passangerNo;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	int capacity;
	int consumption;
	int distance;
	int time;
	int cargowt;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}

	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	void fuelNeeded(int distance)
	{
		this.distance=distance;
		consumption=(time*100)/(distance);
		
	}
	void distanceCovered(int time)
	{
		this.time=time;
		speed=distance/time;
		System.out.println(speed);
		
	}
	public int getPassangerNo() {
		return passangerNo;
	}

	public void setPassangerNo(int passangerNo) {
		this.passangerNo = passangerNo;
	}
	public int getCargowt() {
		return cargowt;
	}
	public void setCargowt(int cargowt) {
		this.cargowt = cargowt;
	}
	void display()
	{
		
		
		System.out.println("speed of vehicle is"+"model:"+getModel()+"\t"+"vehicle no :"+getVno()+"\t"+"capacity of vehicle"+getCapacity()+"\t"+"consumtion of vehicle:"+consumption+"\t"+"Distance of vehicle :"+distance+"\t"+"speed of vehicle:"+speed);
	}
	
}
	
class bus extends vehicle
{
	
	

	void display()
	{
		System.out.println("speed of vehicle is"+"model of"+getModel()+"\t"+getVno()+"\t"+getCapacity()+"\t"+consumption+"\t"+getPassangerNo()+"\t"+distance+"\t"+speed);
		
	}
	
}
class truck extends vehicle
{
	
		
	
	void display()
	{
		
		System.out.println("speed of vehicle is: "+"\t"+getModel()+"\t"+getVno()+"\t"+getCapacity()+"\t"+consumption+"\t"+distance+"\t"+getCargowt()+"\t"+speed);
	}
		
	
}


public class vehicleApp {
	public static void main(String x[])
	{
		String model;
		int vno;
		int speed;
		int capacity;
		int consumption;
		int distance;
		int time;
		int passangerNo;
		int cargowt = 0;
		Scanner sc=new Scanner(System.in);
		
		bus b=new bus();

		System.out.println("enter the model name of a bus");
		model=sc.nextLine();
		System.out.println("enter the model name of a bus");
		 vno=sc.nextInt();
		 System.out.println("enter the capacity of a bus");
		capacity=sc.nextInt();
		System.out.println("enter the distance of a bus");
		distance=sc.nextInt();
		System.out.println("enter te time of a bus");
		time=sc.nextInt();
		System.out.println("enter the count  of passanger in the  bus");
		passangerNo=sc.nextInt();
		b.setModel(model);
		b.setVno(vno);
		b.setCapacity(capacity);
		b.fuelNeeded(distance);
		b.distanceCovered( time);
		b.display();
		
		truck t=new truck();
		System.out.println("enter the model name of a truck");
		model=sc.nextLine();
		System.out.println("enter the vehicle no of a truck");
		 vno=sc.nextInt();
		 System.out.println("enter the capacity of a truck");
		capacity=sc.nextInt();
		System.out.println("enter the consumtion distance of a truck in km");
		distance=sc.nextInt();
		System.out.println("enter te time of a truck");
		time=sc.nextInt();
		
		t.setModel(model);
		t.setVno(vno);
		t.setCapacity(capacity);
		t.setCargowt(cargowt);
		t.fuelNeeded(distance);
		t.distanceCovered( time);
		t.display();
		
		
	}

}
