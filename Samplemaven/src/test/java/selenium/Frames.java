package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Frames {	
	@Test(priority = 3)
    public void frame() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        try {
            driver.get("https://demo.guru99.com/test/guru99home/");
            System.out.println("URL-" + driver.getTitle());


            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.switchTo().defaultContent();
            driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abcd");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

