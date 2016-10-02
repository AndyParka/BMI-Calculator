public class MyBMIServer {

	String calcBMI(String weight, String height) {
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
				return String.format("%.2f", BMI) + DB.RangeList.get(i).getName().toUpperCase();

			}

		}

		return String.format("%.2f", BMI) + " UNDEFINED";

		// Done

	}

	// Provide the BMI ranges known to the calculator
	String listRanges() {
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
	String listWeights(String height) {
		// Returns a String providing the ideal lower and upper weights,
		// separated by “ – “. Return
		// UNDEFINED if no desirable range has been specified.

		return "";

		// list the minimum or maximum possible weight for a healthy bmi range

	}
}
