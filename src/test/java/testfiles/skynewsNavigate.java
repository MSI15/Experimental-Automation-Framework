package testfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class skynewsNavigate {
	
	        private PageObjects pgobj;
	        public WebDriver driver;
	
    public 	skynewsNavigate(WebDriver driver2){
    	    ///driver = new ChromeDriver();
    	    this.driver = driver2;
	        pgobj = new PageObjects();	
	        PageFactory.initElements(driver, pgobj);
    }

	public void clickTab(){		
		    pgobj.worldTab.click();;		
	}

}
