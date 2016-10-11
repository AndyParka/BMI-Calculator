import localhost.axis.MyBMIAdmin_jws.*;

import org.apache.axis.client.*;

public class MyBMIAdminClient
{
	
	// By Andrew Parkinson
	// c3128094
	// University of Newcastle
	// SENG3400 Semester 2 - 2016
	
	public static void main(String[] args)
	{
		try{
		MyBMIAdminService bmiAS = new MyBMIAdminServiceLocator();
		MyBMIAdmin BMI = bmiAS.getMyBMIAdmin();
		

		
		if(args[0].equals("addRange")){
			
			System.out.println("Your arguments for "+args[0]+" are:");
			System.out.println("User: "+args[1]);
			System.out.println("Pass: "+args[2]);
			System.out.println("Lower: "+args[3]);
			System.out.println("Upper: "+args[4]);
			System.out.println("Name: "+args[5]);
			System.out.println("Normal: "+args[6]);
			// This was added because adding a * without quotes ie "*" breaks the arguments in windows cmd.
			// It just starts passing in the names of files in the directory
			
			System.out.println(BMI.addRange(args[1],args[2],args[3],args[4],args[5],args[6]));
			
		}else if(args[0].equals("deleteRange")){
			
			System.out.println(BMI.deleteRange(args[1],args[2],args[3]));
			
		}else if(args[0].equals("setName")){
			
			System.out.println(BMI.setName(args[1],args[2],args[3],args[4]));
			
		}else if(args[0].equals("callCount")){
			
			System.out.println(BMI.callCount(args[1],args[2]));
			
		}else if(args[0].equals("testUser")){
			
			System.out.println(String.valueOf(BMI.testUser(args[1],args[2])));
			
		}else if(args[0].equals("testStringAdmin")){
			
			 System.out.println(BMI.testStringAdmin());
			
		}else {
			
			System.out.println("Argument Error");
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
			System.out.println(args[3]);
			System.out.println(args[4]);
			System.out.println(args[5]);
			System.out.println(args[6]);
			
		}
		} catch(Exception e) {
			e.printStackTrace();
		}

				
	}

}
