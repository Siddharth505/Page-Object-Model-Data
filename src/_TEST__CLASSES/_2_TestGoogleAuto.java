package _TEST__CLASSES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import _POM.POM_GoogleAutoSuggestion;

public class _2_TestGoogleAuto {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		POM_GoogleAutoSuggestion obj = new POM_GoogleAutoSuggestion(driver);
		obj.SearchMethod();
		

	}

}
