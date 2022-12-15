package inheritance;

import java.util.Scanner;

abstract class StringOperation
{
	abstract void performOperation(String str);
}
class converToUpper extends StringOperation
{
	void performOperation(String str)
	{
		System.out.println(str.toUpperCase());
	}
}
class MaxRepeateStr extends StringOperation
{
	void performOperation(String str)
	{
		
	}
}

class WordReverseStr extends StringOperation
{
	void performOperation(String str)
	{
		
	}
}

public class StringOperationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

String str;
System.out.println("enter the string");
str=sc.nextLine();
converToUpper c=new converToUpper();
c.performOperation(str);
MaxRepeateStr m=new MaxRepeateStr();
m.performOperation(str);
WordReverseStr w=new WordReverseStr();

	}

}
