
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

		//get classification





		return BMI
	}

	// Provide the BMI ranges known to the calculator
	String listRanges() {
		// Returns a String containing each of the currently known BMI ranges
		// separated by “\n”.
		// Return UNDEFINED if no ranges have been defined.
	}

	// Provide the ideal range of weights for a given height
	String listWeights(String height) {
		// Returns a String providing the ideal lower and upper weights,
		// separated by “ – “. Return
		// UNDEFINED if no desirable range has been specified.
	}
}
