package testfiles;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import coreSystemFiles.Methods;

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
  	       try {	  
  		        findAnElement(By.linkText(recordTabs[n])).click();
  		        Thread.sleep(1000);	    		
  		        if (recordTabs[n].equalsIgnoreCase(findAnElement(By.className("section-header__headline")).getText())){
  			       System.out.println(recordTabs[n] + " page is displayed");
  		        }else{
  		           return false;
  		        }
		    
		       } catch (InterruptedException e) {
			        // TODO Auto-generated catch block
			        e.printStackTrace();
		       }
         }
		return true;
    	
    }


}
