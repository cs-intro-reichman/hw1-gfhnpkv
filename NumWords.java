// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // reciving number
		int number = Integer.parseInt(args[0]);

		//seperating the numbers
		int hundred = (int) Math.ceil(number / 100);
		int tens = (int) Math.ceil(number / 10) % 10;
		int ones = number % 100;

		//printing answer
		System.out.println(hundred + " hundreds, " + tens + " tens, and " + ones + " ones.");

	}
}
