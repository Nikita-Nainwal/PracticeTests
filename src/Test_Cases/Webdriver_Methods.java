package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) {
		// This class contains all important and basic web driver methods
		System.setProperty("webdriver.chrome.driver","D:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//on uncommenting the below line of code fist directly fb will be opened in chrome cauz we are using chrome driver and then google home page
		//driver.get("https://m.facebook.com/");

		driver.get("https://www.google.com");
//To check if we landed oncorrect url not		
		System.out.println(driver.getCurrentUrl());
//to get page title
		driver.getTitle();
//to print Page source 		
	//	System.out.println(driver.getPageSource());
//For navigating to some other page but it will first navigate to goolgle.com and then to other
		driver.get("https://m.facebook.com/");
//For navigating back to the previous page
		driver.navigate().back();
//For navigating to forward
		driver.navigate().forward();

		driver.navigate().to("https://www.yahoo.com");
//For closing the browser
	 driver.close();
		
		

	}

}
