
public class BMIRangeObject {

	private String Name;
	private Double BMImin;
	private Double BMImax;
	private boolean isNormal;

	public void setParams(String name, Double min, Double max, boolean isNormal) {
		Name = name;
		BMImin = min;
		BMImax = max;
	}

	public boolean setName(String newName) {
		this.Name = newName;
		if (newName == this.Name) {
			return true;
		} else {
			return false;
		}
	};

	public void setBMImin(Double newBMImin) {
		BMImin = newBMImin;
	};

	public void setBMImax(Double newBMImax) {
		BMImax = newBMImax;
	};

	public String getName() {
		return this.Name;
	}

	public Double getBMIMax() {
		return this.BMImax;
	}

	public Double getBMIMin() {
		return this.BMImin;
	}

	public Boolean getNormal() {
		return this.isNormal;
	}

	public String getRange() {
		String result = this.getName() + " = " + this.getBMIMin() + " - " + this.getBMIMax();
		return result;
	}

}
