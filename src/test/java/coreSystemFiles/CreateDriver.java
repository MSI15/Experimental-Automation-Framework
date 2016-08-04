package coreSystemFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

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
