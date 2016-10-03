public class MyBMIAdmin {
	// By Andrew Parkinson
	// c3128094
	// University of Newcastle
	// SENG3400 Semester 2 - 2016

	// Add a new BMI range to the system
	public boolean addRange(String user, String pwd, String lower, String upper, String name, boolean normal) {
		// Returns false if a range with name already exists, if lower and/or
		// upper overlap with an
		// already-defined range, if normal is set and there is already another
		// range defined as
		// desirable, or the user credentials are invalid; true if the new range
		// has been added.
		//
		// Note: the value of lower for a range can be the same as the value for
		// upper for the adjoining range.
		//
		// The value “*” denotes “unlimited” (i.e. used for defining one end of
		// the highest range).
		// Note also that the desirable range is denoted by true for normal,
		// false otherwise.

		// defined double version of Upper and Lower ranges
		double dblUpper = 0;
		double dblLower = 0;

		// Check user credentials
		if (DB.User.TestUser(user, pwd)) {

			// if * then convert min to 00.00 or max to 99.99
			if ("*" == upper) {
				dblUpper = 99.99;
			} else {
				// try to convert upper to a double
				try {
					dblUpper = Double.parseDouble(upper);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					return false;
				}
			}
			if ("*" == lower) {
				dblLower = 00.00;
			} else {
				// try to convert upper to a double
				try {
					dblUpper = Double.parseDouble(lower);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					return false;
				}
			}
			///////////////////////////////////////

			// Check if name already exists
			for (int i = 0; i < DB.RangeList.size(); i++) {
				// if the existing name = the new name
				if (DB.RangeList.get(i).getName() == name) {
					// returns false and does not continue
					return false;
				}

				// Check if range exists within existing ranges
				if (dblLower > DB.RangeList.get(i).getBMIMin() && dblLower < DB.RangeList.get(i).getBMIMax()) {
					return false;
				} else if (dblUpper > DB.RangeList.get(i).getBMIMin() && dblUpper < DB.RangeList.get(i).getBMIMax()) {
					return false;
					// Check if normal, check if any other range is normal
				} else if (normal && DB.RangeList.get(i).getNormal()) {
					return false;
				}

			}
			//////////////

			// if all the checks have passed
			// try creating the new Range and adding it to the list
			try {
				// Create new BMI range object
				BMIRangeObject Range = new BMIRangeObject();
				// Set properties
				Range.setName(name);
				Range.setBMImin(Double.valueOf(lower));
				Range.setBMImax(Double.valueOf(upper));
				// Add to the ArrayList
				DB.RangeList.add(Range);
				return true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return false;
			}

		} else {
			return false;
		}

		// Done

	}

	public boolean deleteRange(String user, String pwd, String name) {
		// Returns false if a range with name does not exist or the user
		// credentials are invalid, true
		// if the range has been removed.
		if (DB.User.TestUser(user, pwd)) {

			// get list of names
			for (int i = 0; i < DB.RangeList.size(); i++) {
				// if the name = the deleting name
				if (DB.RangeList.get(i).getName() == name) {

					DB.RangeList.remove(i);
					return true;
				}

			}
			// if the for loop finishes, the name does not exist, so return
			// false
			return false;

		} else {
			return false;
		}
		// Done

	}

	// Update the name for a specific range (for example if medical opinions
	// change)
	public boolean setName(String user, String pwd, String oldName, String newName) {
		// Returns false if a range named oldName does not exist or the user
		// credentials are invalid,
		// true if the range exists and its name has been updated.

		// Test username and password
		if (DB.User.TestUser(user, pwd)) {

			// get list of names
			for (int i = 0; i < DB.RangeList.size(); i++) {
				// if the name = the old name
				if (DB.RangeList.get(i).getName() == oldName) {
					// set the new name
					// this function returns true to say that it has been
					// changed
					return DB.RangeList.get(i).setName(newName);
				}

			}
			// if the for loop finishes, the oldname does not exist, so return
			// false
			return false;

		} else {
			return false;
		}

		// Done

	}

	// Retrieve the number of client web service calls performed on either
	// interface since the server started
	public int callCount(String user, String pwd) {
		// Returns -1 if the user credentials are invalid, otherwise returns the
		// total number of calls
		// (including this one) on either of the server interfaces.

		if (DB.User.TestUser(user, pwd)) {
			return DB.User.CallCount();
		} else {
			return -1;
		}
		// Done

	}

	public boolean testUser(String user, String pwd) {
		return DB.User.TestUser(user, pwd);
		// Done
	}
}
