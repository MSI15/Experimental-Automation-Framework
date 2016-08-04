package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import testfiles.skynewsNavigate;

public class TestSkyNavStepDef {
	
	WebDriver driver;
	skynewsNavigate testNav;
	
	@Before(value = "@navpg")
	public void setUp(){
		
		driver = new SafariDriver();
		testNav = new skynewsNavigate(driver);
	}
	
	@Given("^I am on the Sky news site$")
	public void I_am_on_the_Sky_news_site(){
		driver.get("http://news.sky.com");
	}
	
//	@When("^I click on a tab$")
//	public void I_click_on_a_tab(){
	//	testNav.clickTab();
//	}

}
