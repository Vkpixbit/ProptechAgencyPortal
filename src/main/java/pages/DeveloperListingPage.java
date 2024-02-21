package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeveloperListingPage  {
	
	WebDriver driver;
	
	public DeveloperListingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()=' Add Property']")
	WebElement addProperty;
	
	public PropertyCreatePage openAddProperty() {
		addProperty.click();
		return new PropertyCreatePage(driver);
		
	}
	
	public PropertyPageValidations openAddPropertyValidations() {
		addProperty.click();
		return new PropertyPageValidations(driver);
	}

}
