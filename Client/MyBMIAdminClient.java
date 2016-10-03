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
		} catch (Exception e){
			e.printStackTrace();
		}
		
		if("addRange" == args[0]){
			
			
		}else if("deleteRange" == args[0]){
			
		}else if("setName" == args[0]){
			
		}else if("callCount" == args[0]){
			
		}else if("testUser" == args[0]){
			
		}else if("testStringAdmin" == args[0]){
			
			 System.out.println(BMI.testStringAdmin());
			
		}else {
			
		}
		

				
	}

}
