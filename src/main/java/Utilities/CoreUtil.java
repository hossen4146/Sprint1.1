package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoreUtil implements CoreMethods{
	WebDriver driver;
	

	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\BTC_180927E\\workspace 01292019\\Sprint1.1\\src\\test\\resources\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		
	}

	public void GoToWebapp() {
		driver.get("https://www.fedex.com/en-us/home.html");
		
		
		
		
	}

	public void CloseBroser() {
		
		if(driver !=null) {
		driver.quit();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	
		
	}



}
