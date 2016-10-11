import seng.DB;

public class MyBMIServer {
	// By Andrew Parkinson
	// c3128094
	// University of Newcastle
	// SENG3400 Semester 2 - 2016

	public String calcBMI(String weight, String height) {
		// Returns a String representing the BMI (to 2 decimal places) and
		// Classification (all caps)
		// separated by a space character. If no classification matches the BMI,
		// return UNDEFINED for
		// the classification.
		double dblWeight = Double.valueOf(weight.trim());
		double dblHeight = Double.valueOf(height.trim());
		double BMI = dblWeight / (dblHeight * dblHeight);

		// get Range Classification
		for (int i = 0; i < DB.RangeList.size(); i++) {

			// pull in min and max range as doubles just in case
			double min = DB.RangeList.get(i).getBMIMin().doubleValue();
			double max = DB.RangeList.get(i).getBMIMax().doubleValue();

			if (BMI <= max && BMI >= min) {

				// return BMI result + Range Classification
				return String.format("%.2f", BMI) + " " + DB.RangeList.get(i).getName().toUpperCase();

			}

		}

		return String.format("%.2f", BMI) + " UNDEFINED";

		// Done

	}

	// Provide the BMI ranges known to the calculator
	public String listRanges() {
		// Returns a String containing each of the currently known BMI ranges
		// separated by “\n”.
		// Return UNDEFINED if no ranges have been defined.

		String result = "";

		if (DB.RangeList.size() == 0) {

			return "UNDEFINED";

		} else {

			for (int i = 0; i < DB.RangeList.size(); i++) {

				result = result + DB.RangeList.get(i).getName() + " " + DB.RangeList.get(i).getRange() + "\n";

			}
			return result;
		}

		// Done

	}

	// Provide the ideal range of weights for a given height
	public String listWeights(String height) {
		// Returns a String providing the ideal lower and upper weights,
		// separated by “ – “. Return
		// UNDEFINED if no desirable range has been specified.

		double dblLower = 0;
		double dblUpper = 0;
		double dblHeight = Double.parseDouble(height);
		double dblHeightSq = dblHeight * dblHeight;

		for (int i = 0; i < DB.RangeList.size(); i++) {

			if (DB.RangeList.get(i).getNormal()) {
				dblLower = DB.RangeList.get(i).getBMIMin() * dblHeightSq;
				dblUpper = DB.RangeList.get(i).getBMIMax() * dblHeightSq;

				return String.format("%.2f", dblLower) + " - " + String.format("%.2f", dblUpper);

			}

		}

		// If it can't find anything
		return "UNDEFINED";

	}

	public String testStringServer() {
		return "Success";
	}
}
