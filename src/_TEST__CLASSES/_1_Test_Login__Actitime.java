package _TEST__CLASSES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import _POM._1__POM_ACTITIME__LOGIN;

public class _1_Test_Login__Actitime {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		_1__POM_ACTITIME__LOGIN login = new _1__POM_ACTITIME__LOGIN(driver);
		
		login.LoginMethod();

	}

}
