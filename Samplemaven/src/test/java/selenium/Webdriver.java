package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

class locators {
    List<By> locatorlist = Arrays.asList(
            By.name("firstName"),
            By.name("lastName"),
            By.name("phone"),
            By.name("userName"),
            By.name("address1"),
            By.name("city"),
            By.name("state"),
            By.name("postalCode"),
            By.id("email"),
            By.name("password"),
            By.name("confirmPassword"));
}

class Data{
    String[] data= {"sri", "valli", "77804878", "acs.gr@gmail.com", "Rajiv nagar, mm road", "HYD", "AP", "XYZ", "abcd", "trf432m", "trf432m"};
}




public class Webdriver {
	@Test(priority = 4)
    public void basicprog() throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/selenium/newtours/register.php");
        System.out.println("URL-" + driver.getTitle());
        locators obj=new locators();
        Data obj1=new Data();
        for(int i=0;i<obj.locatorlist.size();i++){
            driver.findElement(obj.locatorlist.get(i)).sendKeys(obj1.data[i]);
        }



             Thread.sleep(3000);



driver.quit();
    }
}
