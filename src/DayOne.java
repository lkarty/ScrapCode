import java.util.Scanner;

public class DayOne {



	public static void main(String[] args) {

		char s = '@';

		// this is a constant and cannot change
		final String TEST = "hello";


		System.out.println("Hello World");

		Scanner scan = new Scanner(System.in);

		s++; // post increment
		s--;

		++s; // pre-increment

		String words = "this is a sentence";
		// this concatenation might be used in a loop
		words += " and I aded some words";

		System.out.println(words);

		// implicit casting example
		int age = 35;
		double myAge = age; // make it 35.0
		System.out.println(myAge);

		// explicit casting example. Truncates the decimal information
		double sTotal = 259.44;
		int newTotal = (int) sTotal;
		System.out.println(newTotal);

		scan.close();

	}
}
