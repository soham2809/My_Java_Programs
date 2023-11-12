
public class pattern_o {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int n=6;
				//Column Generation
				for (int j=0;j<n;j++)
				{
					//Row Generation
					for (int i=0;i<n;i++)
					{
						if (i==0||j==0||i==n-1||j==n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.println ();
				}

			}

		}
