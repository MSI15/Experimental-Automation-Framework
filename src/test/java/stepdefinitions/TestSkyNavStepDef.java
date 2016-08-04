package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import coreSystemFiles.CreateDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import testfiles.skynewsNavigate;


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
	
	@Given("^I am on the Sky news site$")
	public void I_am_on_the_Sky_news_site(){
		testNav.driver.get("http://news.sky.com");
	}
	
    @When("^I click on a tab$")
    public void I_click_on_a_tab(){
       // DRIVER.findElement(By.xpath("html/body/div[2]/header/div/div/div/div/ul/li[2]/a")).click();
    	testNav.clickTab();
	}

}
