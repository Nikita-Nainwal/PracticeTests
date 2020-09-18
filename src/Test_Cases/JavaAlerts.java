package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			String s="nikita";
			driver.findElement(By.id("name")).sendKeys(s);
			//driver.findElement(By.id("alertbtn")).click();
			//for grabbing text from the alert box
			//System.out.println( driver.switchTo().alert().getText());
			//for alerts use Switch to().alert()
			//driver.switchTo().alert().accept();// to accepet the alert
			//if two buttons ok and or cancel.. 

			driver.findElement(By.id("confirmbtn")).click();
			System.out.println( driver.switchTo().alert().getText());
			//for cancelling use dismiss
			driver.switchTo().alert().dismiss();

	}

}
