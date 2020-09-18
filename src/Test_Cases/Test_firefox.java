package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting property for firefox driver, download .exe file for geckodriver before this
		System.setProperty("webdriver.gecko.driver", "D:\\work\\geckodriver.exe");
		//automating both driver from same test case.
		System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe");

		//Creating driver object of Firefox browser
		WebDriver driver= new FirefoxDriver();
        WebDriver web= new ChromeDriver();
        web.get("https://www.google.com/");
		//
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

}
