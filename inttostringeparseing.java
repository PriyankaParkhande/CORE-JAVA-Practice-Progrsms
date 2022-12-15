package wrapperClassPracticepac;

public class inttostringeparseing {
	public static void main(String x[])
	{
		String s1="120";
		String s2="130";
		System.out.println("before parsimng string is"+ s1+"\t"+s2);
		int p1=Integer.parseInt(s1);
		int p2=Integer.parseInt(s2);
		int p=p1+p2;
		System.out.println("after parsing string :"+p);
		if(p==250)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
	}
}
