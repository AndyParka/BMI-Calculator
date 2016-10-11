import localhost.axis.MyBMIServer_jws.*;

import org.apache.axis.client.*;

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
		

		if (args[0].equals("calcBMI")){
			
			System.out.println(BMI.calcBMI(args[1], args[2]));
			
		} else if (args[0].equals("listRanges")) {
			
			System.out.println(BMI.listRanges());
			
		} else if (args[0].equals("listWeights")) {
			
			System.out.println(BMI.listWeights(args[1]));
			
		} else if (args[0].equals("testStringServer")) {
			
			System.out.println(BMI.testStringServer());
			
		} else {
			System.out.println("Argument Error");
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
				
	}

}