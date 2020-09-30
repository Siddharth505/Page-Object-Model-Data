package _POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class _3_Create_Work {
	
	@FindBy(id="username")
	private WebElement usernametextfield ;
	
	
	@FindBy(name="pwd")
	private WebElement passwordtextfield ; 
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement menubutton;
	
	@FindBy(xpath="//a[text()='Types of Work']")
	private WebElement work1button;
	

	@FindBy(xpath="//span[text()='Create Type of Work']")
	private WebElement work2button;
	

	@FindBy(name="name")
	private WebElement worknametextfield;
	

	@FindBy(xpath="//select[@name='active']")
	private WebElement statusdropdown;
	
	//Select sel = new Select(statusdropdown);
	
	@FindBy(xpath="(//input[@name='billable'])[1]")
	private WebElement billradiobutton;
	
	@FindBy(name="rateStr")
	private WebElement billingtextfield;
	
	@FindBy(xpath="//input[@value='   Create Type of Work   ']")
	private WebElement createworkbutton;
	
	public _3_Create_Work(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginMethod()
	{
		usernametextfield.sendKeys("admin");
		
		passwordtextfield.sendKeys("manager");
		
		loginbutton.click();
	}
	
	public void CreateWork() throws InterruptedException
	{
		menubutton.click();
		Thread.sleep(6000);
		work1button.click();
		Thread.sleep(5000);
		work2button.click();
		Thread.sleep(5000);
		worknametextfield.sendKeys("Testing Job");
		Thread.sleep(5000);
		statusdropdown.click();
		Thread.sleep(5000);
		
		Select sel = new Select(statusdropdown);
		sel.selectByIndex(1);
		Thread.sleep(5000);
		billradiobutton.click();
		Thread.sleep(5000);
		billingtextfield.sendKeys("10");
		Thread.sleep(3000);
		createworkbutton.click();
	}
	
}
