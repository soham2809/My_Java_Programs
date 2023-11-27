// Write a java program to calculate the sum of all elements in an integer array
class sum
{
	int sum (int arr[])
	{
		int result =0;
		for (int n:arr)
		{
		 result =result+n;
		}
		return result;
	}
	
}

public class sumarry 
{
	public static void main (String args[])
	{
		display obj =new display();
		int n=obj.display(new int[] {12,23,22,1,45,5});
		System.out.println(n);
	}
	
}