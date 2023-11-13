package AgencyPortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Users']")
	WebElement usersButton;
	
	@FindBy(xpath = "//div[text()='Projects']")
	WebElement projectButton;
	
	@FindBy(xpath = "//div[text()='All Properties']")
	WebElement allPropertiesButton;
	
	public void loginVerification() {
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "http://prosper.agency.pixbit.in/dashboard";
		org.testng.Assert.assertEquals(currentURL, expectedURL);
	}
	
	public UserPage openUsers() throws InterruptedException {
		Thread.sleep(2000);
		usersButton.click();
		return new UserPage(driver);
	}

	public ProjectPage openProjects() throws InterruptedException {
		Thread.sleep(2000);
		projectButton.click();
		return new ProjectPage(driver);
	}

	public AllPropertiesPage openAllProperties() throws InterruptedException {
		Thread.sleep(3000);
		allPropertiesButton.click();
		return new AllPropertiesPage(driver);
	}

}
