package Com_Hrms_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static void openapplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\jjj\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application opened");
		
	}
	public static void colseapplication() {
		
		driver.quit();
		Reporter.log("Application closed");
		
	}
	
	
	
	
	
	
	
	

}
