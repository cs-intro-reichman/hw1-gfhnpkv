// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		if (args.length != 4) {
			System.out.println("Usage: java Bill3 <name1> <name2> <name3> <bill>");
			return;
		}

		//reciving the input off the names
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		
		//reciving the input off the bill dividing by 3 and round it up
		double bill = Math.ceil(Double.parseDouble(args[3]) / 3.0);
		
		//printing the answer
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 +": pay " + bill + "Shekels each.");

	}
}
