
public class Increment_and_decrement_operator {

	public static void main(String[] args) {
		// ------------------------------------------------
		int a = 4;
		a++;// Post-increment Operator
		System.out.print(a + ",");
		++a; // Pre-increment Operator
		System.out.println(a);
		int b = 5;
		b--; // Post-decrement Operator
		System.out.print(b + ",");
		--b; // Pre-Decrement Operator
		System.out.println(b);
		// Some complex increment and decrement operations
		// Number 1
		int d = 5;
		int c = d++ + ++d + ++d + d++ + --d + d--;// 5+7+8+8+8+8
		System.out.println(c + "," + d);
		// Number 2
		int k = 5;
		int l = k++ + ++k + --k;// 5+7+6
		System.out.println(l + "," + k);

	}

}
