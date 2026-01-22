package basics;







import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Mouseactions extends BaseTest{
	
	
	@Test(priority = 3)
	public void Test2() throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		Actions obj = new Actions(BaseTest.driver);
            WebElement amazon= BaseTest.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Fresh')]")));
            obj.moveToElement(amazon).perform();

            WebElement fresh = BaseTest.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[img[@alt='Amazon Fresh']]")));
            fresh.click();
            WebElement groceries = BaseTest.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[img[contains(@alt, 'vegetables')]]")));
            groceries.click();
            Thread.sleep(2000);
        


	}



@AfterSuite

public void exit() {
	BaseTest.driver.quit();
}

}



