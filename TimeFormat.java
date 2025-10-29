// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		System.out.println(hours);
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		System.err.println(minutes);

		// checking AM or PM
		String timezone = "AM";
		if (hours > 12) {
			timezone = "PM";
			hours = hours - 12;
		}
		// adding ":" and 0 if needed
		String sMinutes = "";
		if (minutes < 10) {
			sMinutes = ":0" + minutes;
		} else {
			sMinutes = ":" + minutes;
		}

		System.out.println(hours + sMinutes + " " + timezone);
	}
}