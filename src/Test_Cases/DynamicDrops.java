package Test_Cases;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDrops {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
            driver.findElement(By.cssSelector("input[class='inputs ui-autocomplete-input']")).sendKeys("Am");
            Thread.sleep(1000);
            List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
            //option is a variable og WebElement type and options is a list of WebElement type
            //iterating through every element loop for dynamic drop down without select tag.
            for(WebElement option :options)
            {
            	 if(option.getText().equals("America"));
            			 {
            		         option.click();
            		         break;
            			 }
            			 }
            
	
	}
}

