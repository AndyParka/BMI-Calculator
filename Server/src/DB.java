import java.util.ArrayList;

public class DB {

	public static ArrayList<BMIRangeObject> RangeList = new ArrayList<BMIRangeObject>();
	public static UserObject User = new UserObject();

	// initialize RangeList ArrayList for psudo database
	// This code can only be run once and will be run the first time a command
	// has been entered

	private boolean isInit = false;

	public boolean init() {

		// if isInit is not true
		if (!isInit) {

			// Create standard BMI Range Objects
			BMIRangeObject Underweight = new BMIRangeObject();
			BMIRangeObject Normal = new BMIRangeObject();
			BMIRangeObject Overweight = new BMIRangeObject();
			BMIRangeObject Obese = new BMIRangeObject();

			// Init values of object
			Underweight.setParams("Underweight", 0.00, 18.50, false);
			Normal.setParams("Normal", 18.51, 24.99, true);
			Overweight.setParams("Overweight", 25.00, 29.99, false);
			Obese.setParams("Obese", 30.00, 99.99, false);

			// Add objects to ArrayList
			DB.RangeList.add(Underweight);
			DB.RangeList.add(Normal);
			DB.RangeList.add(Overweight);
			DB.RangeList.add(Obese);

			// set isInit to true to not allow this code to run again
			isInit = true;

			// Return true to allow next lines of code
			return isInit;
		} else {
			return isInit;
		}

	}

}
