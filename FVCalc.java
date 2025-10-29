// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// reciving inputs
		int currentValue = Integer.parseInt(args[0]);
		int rate = Integer.parseInt(args[1]);
		int years = Integer.parseInt(args[2]);

		//calculating future value
		double futureValue = currentValue * (Math.pow((1 + rate), years));

		System.out.println("After " + years + " years, $" + currentValue + "saved at " + rate + "% will yield $" + futureValue);

	}
}