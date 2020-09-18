package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCssRegulaExpression {
	      
	public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	       	driver.get("https://www.amazon.in/");
			//xpath Regular Expression : //tagName[contains(@attribute, 'value')]
			driver.findElement(By.xpath("//input[contains(@id, 'twotabsearchtext')]")).sendKeys("tops");
			//CSS regular expression : (tagName[Attribute*='value'])
			driver.findElement(By.cssSelector("input[id*='twotabsearchtext']")).sendKeys("css");

}
}