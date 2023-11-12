
public class pattern_a_new_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Column Creation
		int n = 12;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				if (i == 0 || j == 0 || j == (n - 1) / 2 || i == (n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
