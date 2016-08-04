package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import testfiles.skynewsNavigate;


public class TestSkyNavStepDef {
	
	public skynewsNavigate testNav;
	public WebDriver driver;
	
	@Before(value = "@navpg")
	public void setUp(){		
	    driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
		testNav = new skynewsNavigate(driver);
	}
	
	@Given("^I am on the Sky news site$")
	public void I_am_on_the_Sky_news_site(){
		driver.get("https://www.google.co.uk");
	}
	
//	@When("^I click on a tab$")
//	public void I_click_on_a_tab(){
	//	testNav.clickTab();
//	}

}
