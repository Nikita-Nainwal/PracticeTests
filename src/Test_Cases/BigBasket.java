package Test_Cases;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.bigbasket.com/");
		String[] vnames = { "onion", "potato", "cucumber" };// we declared array first as i will take less memory and on
															// run time we will convert it to arraylist
		// array of string type created for giving multiple veggies name as input
		driver.findElement(By.cssSelector("input[qa='searchBar']")).sendKeys("vegetables");
		driver.findElement(By.cssSelector("button[qa='searchBtn']")).click();
		Thread.sleep(5000);
		List<WebElement> veg = driver.findElements(By.cssSelector("a[data-trigger='focus']"));
		int i;
		for (i = 0; i < veg.size(); i++) {

			String[] name = veg.get(i).getText().split("-");
			String realName = name[0].trim();
			// The name that we extracted needs to be formatted for getting only vegetable
			// name
			// Checking if the name extracted is present in the requirement array or nor, we
			// will convert the array to arraylist as array list will support contains()

			List<String> vlist = Arrays.asList(vnames);

			int j = 0;
			if (vlist.contains(realName))

			{
				j++;

				System.out.println(name);
				Thread.sleep(3000);

				driver.findElements(By.cssSelector("button.btn.btn-add.col-xs-9")).get(i).click();
				// break; we cannot use break with array list with single element we can use
				// break
				if (j == 3)
					;
				break;
			}

		}

	}
}
