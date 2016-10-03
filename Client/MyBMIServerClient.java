import localhost.axis.MyBMIServer_jws.*;

public class MyBMIServerClient
{
	
	// By Andrew Parkinson
	// c3128094
	// University of Newcastle
	// SENG3400 Semester 2 - 2016
	
	public static void main(String[] args)
	{
		try{
		MyBMIServerService bmiAS = new MyBMIServerServiceLocator();
		MyBMIServer BMI = bmiAS.getMyBMIServer();
		
		System.out.println(BMI.listWeights("50"));
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}

}