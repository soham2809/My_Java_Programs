
public class pattern_complex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i+j==(n-1)/2||j-i==(n-1)/2||i-j==(n-1)/2||i+j==((n-1)+(n-1)/2))
				{
					System.out.println ("*");				
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
