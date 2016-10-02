
public class UserObject {

	private String Username = "admin";
	private String Password = "bodymass";
	private int CallCount = 0;

	public String getUsername() {
		Action();
		return this.Username;
	}

	public int CallCount() {
		// Incriments callcount and returns callcount as int
		Action();
		return this.CallCount;
	}

	public void Action() {
		// incriments callcount
		this.CallCount = this.CallCount++;
	}

	public boolean TestUser(String Uname, String Pword) {
		// Tests entered username and password with valid username and password
		Action();
		boolean answer = false;
		if (Uname.equals(this.Username)) {
			if (Pword.equals(this.Password)) {
				answer = true;
			}
		}
		return answer;
	}

}
