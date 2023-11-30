package Com_Hrms_Pages;

import org.openqa.selenium.By;

import Com_Hrms_Utility.Baseclass;

public class Loginpage extends Baseclass {
	//obj
	static By txt_username= By.name("txtUserName");
	static By txt_password= By.name("txtPassword");
	static By login_btn= By.name("Submit");
	
	
	public static void login(String username,String password) {
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(login_btn).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
