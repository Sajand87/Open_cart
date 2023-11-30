package Com_Hrms_Testscripts;

import org.testng.annotations.Test;

import Com_Hrms_Pages.Loginpage;
import Com_Hrms_Pages.Logoutpage;
import Com_Hrms_Pages.Verifypage;
import Com_Hrms_Utility.Baseclass;

public class TestCase001 {
	
	
	@Test
	public static void TC001() throws Exception {
		
		Baseclass.openapplication();
		Loginpage.login("nareshit","nareshit");
		Verifypage.verifytitle();
		Logoutpage.logout();
		Baseclass.colseapplication();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
