/*

feedback:

Great Work

Yam

*/




// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Reciving number and generating random numbers
		int input = Integer.parseInt(args[0]);
		int limit = input + 1;
		int n1 = (int) (Math.random() * limit);
		int n2 = (int) (Math.random() * limit);
		int n3 = (int) (Math.random() * limit);

		// printing numbers not in order
		System.out.println(n1 + " " + n2 + " " + n3);
		
		//sorting number
		int min = Math.min(n3, Math.min(n1, n2));
		int max = Math.max(n3, Math.max(n1, n2));
		int middle = n1 + n2 + n3 - min - max;

		//printing ordered numbers
		System.out.println(min + " " + middle + " " + max);

		
	}
}

