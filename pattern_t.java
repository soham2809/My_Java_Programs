
public class pattern_t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		for (int j=0;j<n;j++)
		{
			for(int i=0;i<n;i++)
			{
				if(j==0||i==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	   
	}

}
