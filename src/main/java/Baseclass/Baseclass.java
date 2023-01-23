package Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	public static WebDriver driver;
	public static void browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\mvn\\271222\\Flipkart\\src\\test\\resources\\driver\\chromedriver.exe");
			 driver=new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\mvn\\271222\\Flipkart\\src\\test\\resources\\driver\\msedgedriver.exe");
			 driver=new EdgeDriver();
		}else if (browser.equalsIgnoreCase(browser)) {
			System.setProperty("webdriver.gecko.driver", "");
			 driver=new FirefoxDriver();
		}
	}
	
	public static void getURL(String url) {
try {
	driver.get(url);
} catch (Exception e) {
	System.out.println("Invalid URL :"+e.getMessage());
}
	}
	
	public static void window_max() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("Unable to Window MAx "+e.getMessage());
		}

	}
	
	public static void elementSendKeys(WebElement element,String value) {
try {
	
	element.sendKeys(value);
} catch (Exception e) {
	System.out.println("Unable to Enter the values "+e.getMessage());
}
	}
	
	public static void elementClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("Unable to Click :"+e.getMessage());
		}

	}
	
}
