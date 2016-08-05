package coreSystemFiles;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Methods {
	
	public WebDriver driver;
	
	public Methods(WebDriver driver2){		
		this.driver = driver2;		
	}
	
	public List<WebElement>findAListElement(By by){		
		List<WebElement>listWebElement = (List<WebElement>)driver.findElements(by);		
		return listWebElement;
	}
	
	public WebElement findAnElement(By by){
		WebElement webElement = driver.findElement(by);
		return webElement;
	}

}
