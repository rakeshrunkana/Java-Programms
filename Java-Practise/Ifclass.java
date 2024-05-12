public class Ifclass {
	public static void main(String[] args) {
		// if...else...if (Laddered if else)
		// nested if statement

		int age = 23;

		if (age > 13) {
			System.out.println("Welcome to my website");
			if (age <= 25 && age >= 20) {
				System.out.println("Congratulations, you have won a discount");
			}
		} else if (age == 13) {
			System.out.println("Please provide us your email id");
		} else {
			System.out.println("You must be above 13 years of age");
		}
		System.out.println("Please leave some feedback");

	}
}
