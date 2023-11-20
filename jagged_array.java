public class jagged_array
{
	public static void main (String args[])
	{
		int nums[][]=new int [3][];
		nums[0]=new int [2];
		nums[1]=new int [4];
		nums[2]=new int [2];
		nums [0][0]=3;
		nums [0][1]=2;
		nums [1][0]=6;
		nums [1][1]=4;
		nums [1][2]=5;
		nums [1][3]=7;
		nums [2][0]=10;
		nums [2][1]=66;
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<nums[i].length;j++)
			{
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
}}
