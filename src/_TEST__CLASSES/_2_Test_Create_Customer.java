package _TEST__CLASSES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import _POM._2_Create_Customer;

public class _2_Test_Create_Customer {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		_2_Create_Customer CreateCustomer = new _2_Create_Customer(driver);
		CreateCustomer.LoginMethod();
		CreateCustomer.CreateCustomer();
//		CreateCustomer.CancelCustomer();

	}

}
