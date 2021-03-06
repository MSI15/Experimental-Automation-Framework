package testfiles;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import coreSystemFiles.Methods;

/**
 * 
 * @author Mohammad.N.H.Siddiqui
 * WebAutomation Framework
 * Created 05/08/2016
 * skynewsNavigate class
 * to reference in tests 
 *
 */

public class skynewsNavigate extends Methods{
	
	        private PageObjects pgobj;
	        public WebDriver driver;
	
    public 	skynewsNavigate(WebDriver driver2){
    	    super(driver2);
    	    this.driver = driver2;
	        pgobj = new PageObjects();	
	        PageFactory.initElements(driver, pgobj);
    }
    
    public boolean isHomePageDisplayed() {
    	return pgobj.topStoriesHeadline.isDisplayed();
    }

    public boolean clickNCheck(){
    	
    	 List<WebElement>tabs = findAListElement(By.xpath(".//*[@id='root']/body/div[2]/header/div/div/div/div/ul/*"));
         Iterator<WebElement>pageIter = tabs.iterator();
         int size = tabs.size();
         int n = 0;
         int i = 0;
         System.out.println("The number of tab item is :" + size);
  
         String [] recordTabs = new String[size];

         while(pageIter.hasNext()){
  	        WebElement weL = pageIter.next();    	    	
  	        recordTabs[i] = weL.getText();	    	
               i = i + 1;
         }
         for (n=1;n<size;n++){  
        	    System.out.println(recordTabs[n]);
  		        findAnElement(By.linkText(recordTabs[n])).click();
  		        waitFor(1000);        
  		        waitForUrl("http://news.sky.com/"+recordTabs[n].toLowerCase().replace(" ", ""));
  		        if (recordTabs[n].equalsIgnoreCase(findAnElement(By.className("section-header__headline")).getText())){
  			       System.out.println(recordTabs[n] + " page is displayed");
  		        }else{
  		           return false;
  		        }
         }
		return true;
    	
    }


}
