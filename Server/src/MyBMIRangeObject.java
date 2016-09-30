
public class MyBMIRangeObject {

	private String Name;
	private Double BMImin;
	private Double BMImax;

	public void setParams(String name, Double min, Double max) {
		Name = name;
		BMImin = min;
		BMImax = max;
	}

	public void setName(String newName) {
		Name = newName;
	};

	public void setBMImin(Double newBMImin) {
		BMImin = newBMImin;
	};

	public void BMImax(Double newBMImax) {
		BMImax = newBMImax;
	};

	public String getName()

	{
		return this.Name;
	}

	public Double getBMIMax()

	{
		return this.BMImax;
	}

	public Double getBMIMin()

	{
		return this.BMImin;
	}

	public String getRange() {

		String result = this.getName() + " = " + this.getBMIMin() + " - " + this.getBMIMax();
		return result;
	}

}
