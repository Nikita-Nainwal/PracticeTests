package Test_Cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		//String[] name={'tops', 'jeans'};
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("tops");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> products = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		//int x=products.size();
		//System.out.println(x);

		for (int i = 0; i < products.size(); i++) {

			String pName = products.get(i).getText();
		    if(pName.contains("Women's Crop Top"))
		    {
		    	System.out.println(pName);
		    	Thread.sleep(3000);
		    	driver.findElement(By.linkText("Women's Crop Top")).click();
		    	break;
		    }
		    	
		    }
		    }
		    }
//The script is completely correct if not working try changing the linktext and input to contains(), the corresponding might be unavailable if the script is run in future.
		

	

