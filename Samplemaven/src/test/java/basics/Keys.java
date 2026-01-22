package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

class xpath{

         List<By> locatorlist = Arrays.asList(
                 By.id("sac-suggestion-row-1"),
                 By.id("sac-suggestion-row-2"),
                 By.id("sac-suggestion-row-3"));
         
        

    }
 class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeSuite
    public void setup() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://www.amazon.in");
    }
}

public class Keys {
	
                  
		@Test(priority = 1)

	public void keys() throws InterruptedException {
		 xpath obj=new xpath();
		   
		 
		
         WebElement search = BaseTest.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
        search.sendKeys("R for Rabbit strollers" );

                for(By list: obj.locatorlist)
                {
                    if(list.toString().contains("3"))
                    {

                        WebElement element=BaseTest.wait.until(ExpectedConditions.visibilityOfElementLocated(list));
                             
                                 element.click();
                                 System.out.println("element clicked");
                            

                       
                    }
                    else {
                        Thread.sleep(500);
                        search.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
                    }
                }


    

	}
}
	
	



	