package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test_Case_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //invoking chrome browser from code
		//1-Create driver object for chrome browser
		// Implement webdriver interface
//invoke .exe file first
		System.setProperty( "webdriver.chrome.driver", "D:\\work\\chromedriver.exe");
//Creating driver object
		WebDriver driver= new ChromeDriver();
//hitting URL to get opened
		driver.get("https://www.google.com/");
// knowing title of the page opened in browser and displaying it on console
		System.out.println(driver.getTitle());
		
		
		
		
		
	     		
	     


	}

}
