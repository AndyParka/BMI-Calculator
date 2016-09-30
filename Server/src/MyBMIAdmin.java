import java.util.ArrayList;

public class MyBMIAdmin {
	// Add a new BMI range to the system
	boolean addRange(String user, String pwd, String lower, String upper, String name, boolean normal) {
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

		MyBMIRangeObject Range = new MyBMIRangeObject();

		Range.setName(name);
		Range.setBMImin(Double.valueOf(lower));
		Range.setBMImax(Double.valueOf(upper));

	}

	boolean deleteRange(String user, String pwd, String name) {
		// Returns false if a range with name does not exist or the user
		// credentials are invalid, true
		// if the range has been removed.

	}

	// Update the name for a specific range (for example if medical opinions
	// change)
	boolean setName(String user, String pwd, String oldName, String newName) {
		// Returns false if a range named oldName does not exist or the user
		// credentials are invalid,
		// true if the range exists and its name has been updated.
		boolean answer = false;

		if (testUser(user,pwd)){

			//get list of names

			if(newName == object){return false;}

			if (oldName == ){

			}else{return false;}


		} else {
			return false;
		}


	}

	// Retrieve the number of client web service calls performed on either
	// interface since the server started
	int callCount(String user, String pwd) {
		// Returns -1 if the user credentials are invalid, otherwise returns the
		// total number of calls
		// (including this one) on either of the server interfaces.
	}

	private boolean testUser(String user, String pwd) {
		boolean answer = false;
		if (user.equals("admin")) {
			if (pwd.equals("bodymass")) {
				answer = true;
			}
		}
		return answer;
	}
}
