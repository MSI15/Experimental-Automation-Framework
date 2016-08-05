package testfiles;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	
	@FindBy(linkText="Home")
	public WebElement homeTab;
	
	@FindBy(linkText="UK")
	public WebElement UKTab;
	
	@FindBy(linkText="World")
	public WebElement worldTab;

	@FindBy(xpath=".//*[@id='root']/body/div[2]/header/div/div/div/div/ul/*")
	public List<WebElement> headerNavGroup;
	
	@FindBy(xpath = ".//*[contains(text(), 'Top Stories')]")
	public WebElement topStoriesHeadline;
	

}
