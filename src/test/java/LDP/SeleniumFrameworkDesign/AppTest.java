package LDP.SeleniumFrameworkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

/**
 * Unit test for simple App.
 */
public class AppTest 
{    
    @Test
    public void BrowerLaunch()
    {
    	WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.LINUX).setup();
    	WebDriver driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("http://facebook.com");    	
        
    }

}
