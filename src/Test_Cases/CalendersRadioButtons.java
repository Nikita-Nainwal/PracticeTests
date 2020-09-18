package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendersRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		//TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1_CTXT\']")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);

		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        //By not giving index, the parent of both the collections will be different
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
         //for picking current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//to check if calender for departure is disabled or enabled, the opacity is changing so we will use that attribute as check point
		driver.findElement(By.id("Div1")).getAttribute("style");

		}



		


	    
	
		
	    
	}


