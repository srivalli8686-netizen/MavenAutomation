package selenium;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
	import java.util.Arrays;
	import java.util.List;

	class Data1{

	    List<By> array= Arrays.asList(
	           By.xpath("//div[@id='nav-al-your-account']"),
	           By.xpath("//div[@id='nav-al-wishlist']"));


	}
	public class assignment {

		@Test(priority = 2)
	    public void Assignment(){
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        try {
	            driver.get("https://www.Amazon.in");
	            Thread.sleep(1000);
	            System.out.println("URL-" + driver.getTitle());

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	            WebElement data = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[div[span[contains(.,'Hello, sign in')]]]")));
	            Actions act = new Actions(driver);
	            act.moveToElement(data).perform();
	            Thread.sleep(5000);
	            Data1 obj=new Data1();
	            for(int i=0; i<obj.array.size();i++)
	            {

	            List<WebElement> element=driver.findElements(obj.array.get(i));
	            for (WebElement wishlist : element) {
	                System.out.println(wishlist.getText());
	            }
	            }


	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}




