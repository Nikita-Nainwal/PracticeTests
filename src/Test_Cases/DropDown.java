package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
	       	/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	       	 
            Select s= new Select(driver.findElement(By.cssSelector("select#dropdown-class-example")));
            s.selectByValue("option3");
            s.selectByIndex(0);
            s.selectByVisibleText("Option2");*/
			/*driver.get("https://www.goindigo.in/");
			driver.findElement(By.name("passenger")).click();
			int i;
			/*while(i<5) {
			
				driver.findElement(By.cssSelector("button.pax-plus.btn.btn-info")).click();
		        i++;
			}*/
			//using for loop for static drop downs
			
	/*	  for(i=1;i<=5;i++)
		  {
				driver.findElement(By.cssSelector("button.pax-plus.btn.btn-info")).click();

		  }
			  driver.findElement(By.cssSelector("button.btn.btn-primary.pax-done.btn-pad-y")).click();
         
	}*/
	       //selecting values from dynamic drop downs.
			driver.get("https://www.spicejet.com/");
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
			driver.findElement(By.xpath("//a[@value='BOM']")).click();
			//with index
					
		//	driver.findElement(By.xpath("(//a[@value='DED'])[2]")).click();
			//OR WITHOUT INDEX
			 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DED']")).click();
			
			//or
			
		
	}

}
