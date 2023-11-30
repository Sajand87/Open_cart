package Com_Hrms_Pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import Com_Hrms_Utility.Baseclass;

public class Logoutpage extends Baseclass{
	
	
	//obj
	static By link_logout= By.linkText("Logout");
	
	
	
	public static void logout() throws Exception {
		driver.findElement(link_logout).click();
		Thread.sleep(3000);
		Reporter.log("Logout Sucessfull");
		
		
	}	
	
	
	
	

}
