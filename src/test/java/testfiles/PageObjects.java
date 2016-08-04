package testfiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	
	@FindBy(linkText="Home")
	public WebElement homeTab;
	
	@FindBy(linkText="UK")
	public WebElement UKTab;
	
	@FindBy(linkText="World")
	public WebElement worldTab;

}
