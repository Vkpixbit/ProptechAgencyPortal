package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusefiles.Components;

public class PropertySpecalistPage extends Components {
	
	WebDriver driver;

	public PropertySpecalistPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Add Specialist']")
	WebElement addPSButton;
	
	public PropertySpecalistCreationPage openPropertySpecalistCreationPage() throws InterruptedException {
		Thread.sleep(2000);
		addPSButton.click();
		return new PropertySpecalistCreationPage(driver);
	}
	
	
}
