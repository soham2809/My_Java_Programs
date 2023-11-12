
public class Ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a = 10;
		b = 4;
		c = 8;
		String result = (a < b) ? "b is greater" : "a is greater";
		System.out.println(result);
		String my_result = (a < b) ? ((a < c) ? "a is smallest" : "c is smallest")
				: ((b < c) ? "b is smallest" : "c is smallest");
		System.out.println(my_result);
	}

}
