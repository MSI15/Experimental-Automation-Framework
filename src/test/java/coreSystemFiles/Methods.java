package coreSystemFiles;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Mohammad.N.H.Siddiqui
 * WebAutomation Framework
 * Created 05/08/2016
 * Methods class for reusable methods
 * in automation scripts
 *
 */

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
	
	public void waitFor(int milliseconds){
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void waitForUrl(String Url){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		ExpectedCondition<Boolean> e = new ExpectedCondition<Boolean>() {
	          public Boolean apply(WebDriver d) {
	              return (d.getCurrentUrl().contains(Url));
	          }
	    };	    
	    wait.until(e);
	}
}
