package selenium;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

	public class Alerts {
		@Test(priority = 1)
	    public void alert(){
	        WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	        System.out.println(driver.getTitle());
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	            WebElement alt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Prompt Alert']")));
	            for (boolean array:new boolean[]{true,false}) {
	                Thread.sleep(1000);
	                alt.click();
	                Alert alrt = wait.until(ExpectedConditions.alertIsPresent());
	                System.out.println(alrt.getText());
	                Thread.sleep(1000);
	                if (array) {
	                    Thread.sleep(1000);
	                    alrt.sendKeys("abcdefgh");
	                    System.out.println("text entered & accepted");

	                    alrt.accept();
	                } else {
	                    alrt.dismiss();
	                    System.out.println("alert  dismissed ");
	                }
	            }


	        } catch (Exception e) {
	            System.out.println("error - " + e.getMessage());
	        }
	        driver.quit();

	        }
	}



