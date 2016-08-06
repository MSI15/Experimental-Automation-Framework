package coreSystemFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * 
 * @author Mohammad.N.H.Siddiqui
 * WebAutomation Framework
 * Created 05/08/2016
 * CreateDriver class for 
 * generating various drivers
 *
 */

public class CreateDriver {
	
	WebDriver driver;
	
	public WebDriver FfoxDriver(){
		
		driver = new FirefoxDriver();
		
		return driver;
		
	}
	
    public WebDriver SafDriver(){
		
		driver = new SafariDriver();
		
		return driver;
		
	}

}
