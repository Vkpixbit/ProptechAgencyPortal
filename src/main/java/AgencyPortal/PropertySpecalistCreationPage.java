package AgencyPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusefiles.Components;

public class PropertySpecalistCreationPage extends Components {

	WebDriver driver;

	public PropertySpecalistCreationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='profile_image']")
	WebElement psProfileImage;
	
	@FindBy(xpath = "//input[@id='name']")
	public WebElement psName;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement psEmail;
	
	@FindBy(xpath = "//input[@id='mobile']")
	public WebElement psMobile;
	
	@FindBy(xpath = "//div[@class=' css-19bb58m']")
	WebElement clickStatusDropdown;
	
	@FindBy(xpath = "//textarea[@id='address']")
	public WebElement psAddress;
	
	@FindBy(xpath = "//input[@name='broker_card_image']")
	WebElement brokerImageField;
	
	
	public void uploadImage(String ps_profile_photo) throws InterruptedException {
		Thread.sleep(2000);
		psProfileImage.sendKeys("/Users/vk14/Downloads/"+ps_profile_photo);
	}
	
	public void selectStatus(String ps_status) throws InterruptedException {
		clickStatusDropdown.click();
		Thread.sleep(3000);
		if(ps_status=="Blocked") {
			WebElement statusOption=driver.findElement(By.xpath("//div[text()='"+ps_status+"']"));
			statusOption.click();
		}
	}
	
	public void uploadBrokerCardImage(String broker_card_image) {
		brokerImageField.sendKeys("/Users/vk14/Downloads/"+broker_card_image);
	}
	
	public void saveAndSendPassword() throws InterruptedException {
		driver.findElement(By.xpath("//button[.='Save & Send Password']")).click();
		Thread.sleep(3000);
	}
	
}
