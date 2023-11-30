package Com_Hrms_Pages;

import Com_Hrms_Utility.Baseclass;

public class Verifypage extends Baseclass {
	
	
	
	
	
	public static void verifytitle() {
		
		if(driver.getTitle().equals("Orang hrm")) {
			System.out.println("Title matched");
		}
		else {
			
			System.out.println(driver.getTitle());
		}
		
	}

}
