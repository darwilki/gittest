package gittest.gittest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;	
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		

public class AppTest {
	
	@Test

	
	Public void guru99tutorials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darwilki\\Documents\\Selenium\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String eTitle = "Meet Guru99";
		String aTitle = "";
		
		driver.get("http://www.guru99.com/");
		driver.manage().window().maximize();
		aTitle = driver.getTitle();
		
		if (aTitle.contentEquals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		driver.close();
	}
}
