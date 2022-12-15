package inheritance;

import java.util.Scanner;

class per
{
	int result;
	int agg;
	void calPer(int sub[])
	{
		for (int i=0;i<sub.length;i++)
		{
		agg+=sub[i];
		
		}
		result=agg/sub.length;
	}
}
class CSE extends per
{
	String name;
	int id;
	String address;
	String year;
	CSE(String name,int id,String address,String year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	void ShowCSEPer()
	{
		System.out.println("result of CSE student is"+ result +"%");
	}
	}
class ETC extends per
{
	String name;
	int id;
	String address;
	String year;
	ETC(String name,int id,String address,String year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	void ShowETCPer()
	{
		System.out.println("result of CSE student is"+ result +"%");
	}
}
public class ResultApp {

	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name;
	int id;
	String address;
	String year;
	
		System.out.println("enter the name of cse student ");
	name=sc.nextLine();
	System.out.println("enter the id of cse student ");
	id=sc.nextInt();
	System.out.println("enter the address of cse student ");
	address=sc.nextLine();
	System.out.println("enter the year of cse student ");
	year=sc.nextLine();
	System.out.println("enter the 6 SUB marks of cse student ");
	int sub[]=new int[6];
	for(int i=0;i<sub.length;i++)
	{
		sub[i]=sc.nextInt();
	}
	CSE c=new CSE(name,id,address,year);
	c.calPer(sub);
	c.ShowCSEPer();
	
	System.out.println("enter the name of etc student ");
	name=sc.nextLine();
	System.out.println("enter the id of etc student ");
	id=sc.nextInt();
	System.out.println("enter the address of etc student ");
	address=sc.nextLine();
	System.out.println("enter the year of etc student ");
	year=sc.nextLine();
	System.out.println("enter the 6 SUB marks of cse student ");
	for(int i=0;i<sub.length;i++)
	{
		sub[i]=sc.nextInt();
	}
	ETC e=new ETC(name,id,address,year);
	e.calPer(sub);
    e.ShowETCPer();
	
	
	}

}
