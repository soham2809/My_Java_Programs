class multi
{
	int multiply (int a,int b)
	{
		int res=a*b;
		return res;
	}
}
public class relation
{
	public static void main (String args[])
	{
		multi obs =new multi ();
		int result=obs.multiply(45,65);
		System.out.println ("The value is ="+result);
	}
}