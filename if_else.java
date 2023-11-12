
public class if_else {

	public static void main(String[] args) {
		int age = 45;
		if (age > 10 && age <= 17) {
			System.out.println("You are teenage");
		} else if (age >= 18 && age <= 59) {
			if (age >= 18 && age <= 29) {
				System.out.println("You are in your 20's");
			} else if (age > 29 && age <= 39) {
				System.out.println("You are in your 30's");
			} else if (age > 39 && age <= 49) {
				System.out.println("You are in your 40's");
			} else {
				System.out.println("You are in your 50's");
			}
		} else if (age >= 60) {
			System.out.println("You are the member of Senior Citizen");
		} else {
			System.out.println("you are kid ");
		}

	}

}
