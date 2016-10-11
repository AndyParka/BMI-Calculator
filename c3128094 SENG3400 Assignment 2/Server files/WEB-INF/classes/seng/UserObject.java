package seng;

public class UserObject {

	private String Username = "admin";
	private String Password = "bodymass";
	private int CallCount = 0;

	public String getUsername() {
		this.Action();
		return this.Username;
	}

	public int CallCount() {
		// returns callcount as int
		return this.CallCount;
	}

	public void Action() {
		// incriments callcount
		this.CallCount = this.CallCount + 1;
	}

	public boolean TestUser(String Uname, String Pword) {
		// Tests entered username and password with valid username and password
		this.Action();
		boolean answer = false;
		if (Uname.equals(this.Username)) {
			if (Pword.equals(this.Password)) {
				answer = true;
			}
		}
		return answer;
	}

}
