import localhost.axis.MyBMIAdmin_jws.*;

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
		
		String admin = "admin";
		String pwd = "bodymass";
		
		String call = BMI.testUser(admin,pwd);
		
		 System.out.println(call);
		} catch (Exception e){
			e.printStackTrace();
		}
				
	}

}