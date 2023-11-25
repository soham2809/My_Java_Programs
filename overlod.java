//Write a program to demonstrarte method overloading with three different parameters
class tom {
	int add (int a,int b)
	{
		int result =a+b;
		return result;
    }
	int add (int a,int b,int c)
	{
		int result =a+b+c;
		return result;
	}
	double add (double a,double b)
	{
		double result=a+b;
		return result;
	}
}
public class overlod
{
	public static void main (String args[])
	{
		tom obj =new tom();
		int result=obj.add(88,45);
		System.out.println(result);
		int result1=obj.add(1333,45,67);
		System.out.println (result1);
		double result2=obj.add(22.32,12.89);
		System.out.println(result2);
		
	}
	
}