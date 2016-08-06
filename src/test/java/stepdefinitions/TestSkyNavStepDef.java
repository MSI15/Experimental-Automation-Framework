package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.springframework.util.Assert;
import coreSystemFiles.CreateDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testfiles.skynewsNavigate;

/**
 * 
 * @author Mohammad.N.H.Siddiqui
 * WebAutomation Framework
 * Created 05/08/2016
 * Cucumber step definitions 
 *
 */


public class TestSkyNavStepDef {
	
	public skynewsNavigate testNav;
	public WebDriver DRIVER;
	public CreateDriver creDriver;
	
	@Before(value = "@navpg")
	public void setUp(){		
		creDriver = new CreateDriver();
		DRIVER = creDriver.SafDriver();
		testNav = new skynewsNavigate(DRIVER);	
	}
	
	@Given("^I navigate to the sky news site$")
	public void I_am_on_the_Sky_news_site(){
		testNav.driver.get("http://news.sky.com");
	}
	
	@When("^the home page is loaded and displayed$")
	public void the_home_page_is_loaded_and_displayed(){
		Assert.isTrue(testNav.isHomePageDisplayed(), "home page is displayed");
	}
	
	@Then("^I can navigate to other pages using the tabs$")
    public void I_click_on_a_tab(){
       Assert.isTrue(testNav.clickNCheck(), "Correct page is displayed upon clicking");
	}

}
