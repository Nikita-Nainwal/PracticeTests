package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCssCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		/*d.navigate().to("https://login.salesforce.com/?locale=in");
		//for creating xpath: //tagName[@attribute='value']
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("xpath generated is correct");
		//for creating css: tagname[attribute='value']
		d.findElement(By.cssSelector("input[name='username']")).sendKeys("css generated is correct");*/
       	d.get("https://www.amazon.in/");
       	//another way of writing css:
       	//for id put # :  tagname#id 
       	
       	d.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("tops");
       	//for ,class name put .  :  tagname.classname
       	d.findElement(By.cssSelector("a.nav-a")).click();
       	
       	
       	
       	

	}

}
