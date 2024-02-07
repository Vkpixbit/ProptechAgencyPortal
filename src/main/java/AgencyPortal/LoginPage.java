package AgencyPortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	WebElement emailField;

	@FindBy(id = "password")
	WebElement passwordField;

	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement signInButton;

	@FindBy(xpath = "//div[text()='invalid password']")
	WebElement passwordError;

	@FindBy(xpath = "//div[text()='Your email is not registered with Prosper']")
	WebElement emailError;

	public void openLink() {
		driver.get("http://prosper.agency.pixbit.in/login");
	}

	public HomePage login(String email_id, String password) throws InterruptedException {
		emailField.sendKeys(email_id);
		passwordField.sendKeys(password);
		Thread.sleep(1000);
		signInButton.click();
		return new HomePage(driver);
	}

	public void passwordErrorMessage() {
		String actualPasswordError = passwordError.getText();
		org.testng.Assert.assertEquals(actualPasswordError, "invalid password");
	}

	public void emailErrorMessage() {
		String actualEmailError = emailError.getText();
		org.testng.Assert.assertEquals(actualEmailError, "Your email is not registered with Prosper");
	}
}
