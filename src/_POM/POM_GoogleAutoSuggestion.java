package _POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_GoogleAutoSuggestion {
	
	@FindBy(xpath="//input[@title='Search']")
			private WebElement searchtextfield;
	
	@FindBy(xpath="//span[text()='selenium']")
	private List<WebElement> suggestions;
	
	public POM_GoogleAutoSuggestion(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void SearchMethod() throws InterruptedException
	{
		searchtextfield.sendKeys("selenium");
		Thread.sleep(5000);
		System.out.println(suggestions.size());
		
		for(int i =0;i<suggestions.size();i++)
		{
			System.out.println(suggestions.get(i).getText());
		}
	        suggestions.get(4).click();
	}
}
