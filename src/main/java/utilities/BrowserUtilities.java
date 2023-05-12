package utilities;

import java.io.File;

public class BrowserUtilities {
	
	
	public static void setDriverPath(String driverName) {
		
		driverName=driverName.toLowerCase();
		
		String os=System.getProperty("os.name").toLowerCase();
		
		if(os.contains("win")){
			driverName=driverName+".exe";
			
		}
			
		String folderPath=System.getProperty("user.dir");
		folderPath=folderPath+File.separator+"drivers"+File.separator;
				
		if(driverName.contains("chromedriver")) {
			System.setProperty("webdriver.chrome.driver",folderPath+driverName);
			
		}
		
		else if(driverName.contains("geckodriver")){
			
			System.setProperty("webdriver.gecko.driver",folderPath+driverName);
		}
		
		else
		{
			
			System.out.println("invalid driver name");
			
		}
		
		
	}		
		
	}
	

