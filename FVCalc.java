// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// reciving inputs
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		//making rate a precent & calcuting futre value & making future value int
		int futureValue = (int)(currentValue * Math.pow(rate / 100 + 1, years));
		
		//printing future value
		System.out.println("After " + years + " years, $" + currentValue + " saved at " + rate +
							 "% will yield $" + futureValue);

	}
}