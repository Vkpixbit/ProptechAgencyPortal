package AgencyPortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
	WebDriver driver;

	public UserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//i[@class='bx bx-plus ']")
	WebElement addUsers;
	
	public UserCreatePage openAddUser() throws InterruptedException {
		Thread.sleep(2000);
		addUsers.click();
		return new UserCreatePage(driver);
	}

}
