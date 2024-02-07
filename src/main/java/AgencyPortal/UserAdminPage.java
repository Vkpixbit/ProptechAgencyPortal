package AgencyPortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAdminPage {
	
	WebDriver driver;

	public UserAdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//i[@class='bx bx-plus ']")
	WebElement addUsers;
	
	public UserAdminCreatePage openAddUser() throws InterruptedException {
		Thread.sleep(2000);
		addUsers.click();
		return new UserAdminCreatePage(driver);
	}

}
