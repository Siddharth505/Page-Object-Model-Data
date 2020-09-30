package _TEST__CLASSES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import _POM._3_Create_Work;

public class _3_Test_Create_Work {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		_3_Create_Work CreateWork = new _3_Create_Work(driver);
				
				CreateWork.LoginMethod();
		        CreateWork.CreateWork();

	}

}
