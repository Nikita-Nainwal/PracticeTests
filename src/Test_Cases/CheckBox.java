package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
			//to check if the checkbox is selected or not
			//The below code should return true if the check box is checked and false if not and return in console 
			//System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
			
			//the below code will check if the value returned is true or false if true the code will proceed else test will fail
			Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
			
			//Counting NUMBER OF CHECK BOXEs
			//find a locator common to all check boxes, here for all type="checkbox"
			/*with this we will get size of checkboxes that is the count of check boxes present in the page, even if some new are added type remains the same and 
			   then also we will be getting tyotal number of checkboxes*/
			System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size()); //Returns the count
			Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
			System.out.println("The above code returns as aspected value false i.e. it is not selected");
			driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).click();
			Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
			System.out.println("The above code returns as aspected value True i.e. it is selected");
			
			
			
			 
			
	}

}
