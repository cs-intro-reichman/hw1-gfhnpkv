// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// reciving inputs
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]) / 100;
		int years = Integer.parseInt(args[2]);

		//calculating future value
		rate = rate + 1;
		double futureValue = currentValue * Math.pow(rate, years);
		

		System.out.println("After " + years + " years, $" + currentValue + " saved at " + rate + ".0% will yield $" + futureValue);

	}
}