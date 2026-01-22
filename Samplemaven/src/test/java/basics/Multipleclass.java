package basics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;



import org.testng.annotations.Test;

public class Multipleclass extends BaseTest{
	
	
	@Test(priority = 2)
	public void dropdown(){
		
		
	
		 WebElement dropdown= BaseTest.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchDropdownBox")));
         Select drop = new Select(dropdown);
         List<WebElement> li = drop.getOptions();

     
         System.out.println(li.size());


         for (WebElement a : li) {
             System.out.println(a.getText());
             if(a.getText().equals("Music")){
                 System.out.println("content matches");
                 break;
             }
         }


	}
}
	






