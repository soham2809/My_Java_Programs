
public class Logical_operator {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int c = 20;
		System.out.println(a <= b && a <= c && b <= c);
		System.out.println(a <= b && a <= c && c <= b);
		System.out.println(a <= b || a <= c || b <= c);
		System.out.println(a <= b || a <= c || c <= b);

	}

}
