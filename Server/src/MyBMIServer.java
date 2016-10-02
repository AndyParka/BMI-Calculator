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

		String result = String.format("%.2f", BMI) + " UNDEFINED";

		// get Range Classification
		for (int i = 0; i < DB.RangeList.size(); i++) {

			double min = DB.get(i).getBMIMin().doubleValue();
			double max = DB.get(i).getBMIMax().doubleValue();

			if (BMI <= max && BMI >= min) {

				// return BMI result + Range Classification
				result = String.format("%.2f", BMI) + DB.get(i).getName();

			}

		}

		return result;
	}

	// Provide the BMI ranges known to the calculator
	String listRanges() {
		// Returns a String containing each of the currently known BMI ranges
		// separated by “\n”.
		// Return UNDEFINED if no ranges have been defined.

		String result = "Undefined";

		for (int i = 0; i < DB.size(); i++) {

			result = result + DB.get(i).getName() + " " + DB.get(i).getRange() + "\n";

		}

		return result;

	}

	// Provide the ideal range of weights for a given height
	String listWeights(String height) {
		// Returns a String providing the ideal lower and upper weights,
		// separated by “ – “. Return
		// UNDEFINED if no desirable range has been specified.

		String result = "";

	}
}
