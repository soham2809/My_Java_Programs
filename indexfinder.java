public class indexfinder 
{
	int finder (int nums[],int n)
	{
		for (int i=0;i<nums.length;i++)
		{
			if (nums[i]==n)
			{ 
		      return i;
			}
		}
		return -1;
	}
public static void main(String args[]){
	int nums[]={12,22,23,44,34,55};
	int element = 23;
	indexfinder obs =new indexfinder();
	int index=obs.finder (nums,element);
	System.out.println ("Index of the element"+element+"is"+index);
}}
