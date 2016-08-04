package testfiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	
	@FindBy(name="Home")
	public WebElement homeTab;
	
	@FindBy(name="UK")
	public WebElement UKTab;

}
