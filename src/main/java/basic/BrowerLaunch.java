package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;



public class BrowerLaunch {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://facebook.com");
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	for(int i=0;i<links.size();i++)
	{
		String linkname=links.get(i).getText();
		System.out.println(linkname);
	}
	
	}

}