package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.facebook.com/");
	//6 locators supported by selenium webdriver are: ID, ClassName, linkText, Xpath, Css, Name to connect to the objrcts on web page	
          //finding by classname  and entering value in it
		//implementation of all 6 locators 		
			driver.findElement(By.name("email")).sendKeys("7534044684");
			driver.findElement(By.id("pass")).sendKeys("Mft123");
			driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
            driver.findElement(By.cssSelector("#login_link > div > a")).click();
            
            driver.findElement(By.linkText("Not you?")).click();
            System.out.println(driver.findElement(By.xpath("//*[@id=\'identify_yourself_flow\']/div/div[2]/div/table/tbody/tr[1]/td[2]/div")).getText());
           //  use of assertion
            Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\'identify_yourself_flow\']/div/div[2]/div/table/tbody/tr[1]/td[2]/div")).getText(), "Please enter your email address or phone number to search for your account.");
			System.out.println("Test passed");
		
				
			
	}

}
