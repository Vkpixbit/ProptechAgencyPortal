package com.pixbit.agencyportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusefiles.Components;

public class UserAdminCreatePage extends Components {

	WebDriver driver;

	public UserAdminCreatePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "name")
	public WebElement nameField;

	@FindBy(id = "email")
	public WebElement emailField;

	@FindBy(id = "mobile")
	public WebElement mobileField;

	@FindBy(id = "address")
	public WebElement addressField;

	@FindBy(xpath = "//select[@class='PhoneInputCountrySelect']")
	public WebElement dropdwon;

	@FindBy(xpath = "//select[@aria-label='Phone number country']")
	WebElement countryPicker;

	@FindBy(xpath = "//button[text()='Done']")
	WebElement done;

	@FindBy(xpath = "(//div[@class=' css-1xc3v61-indicatorContainer'])[2]")
	WebElement roleDropdwon;

	@FindBy(xpath = "//h5[.='User has been added']")
	WebElement userSucess;

	public void selectRole(String user_role) throws InterruptedException {
		roleDropdwon.click();
		Thread.sleep(2000);
		WebElement req_role = driver
				.findElement(By.xpath("//div[@class='p-5 card']//div[6]//div[text()='" + user_role + "']"));
		req_role.click();
	}

	public UserAdminPage createNewUserAdminActive(String name, String email, String country_code, String mobile,
			String address, String user_role) throws InterruptedException {

		nameField.sendKeys(name);
		emailField.sendKeys(email);
		selectFromDropdown(dropdwon, country_code);
		mobileField.sendKeys(mobile);
		addressField.sendKeys(address);
		selectRole(user_role);
		saveAndSendPassword();
		Thread.sleep(5000);
		done.click();
		Thread.sleep(2000);
		return new UserAdminPage(driver);
	}

	public void createNewUserAdmin_Inactive_NoCountryCodeChange_SecondaryAdmin(String new_name, String new_email,
			String new_mobile, String new_address) {
		nameField.sendKeys(new_name);
		emailField.sendKeys(new_email);
		mobileField.sendKeys(new_mobile);
		// inactive
		addressField.sendKeys(new_address);

	}

	public void createNewUserAdmin_Active_ChangeCountryCode_TrakheesiAdmin(String new_name, String new_email,
			String country, String new_mobile, String new_address) {
		nameField.sendKeys(new_name);
		emailField.sendKeys(new_email);
		// country code
		mobileField.sendKeys(new_mobile);
		addressField.sendKeys(new_address);
	}

	public void createNewuserAdmin_Inactive_ChangeCountryCode_PropertiesSpecailist(String new_name, String new_email,
			String country, String new_mobile, String new_address) {
		nameField.sendKeys(new_name);
		emailField.sendKeys(new_email);
		// country code
		mobileField.sendKeys(new_mobile);
		// inactive
		addressField.sendKeys(new_address);

	}

	public UserAdminPage createUserWithoutAddress(String new_name, String new_email, String country_name,
			String new_mobile) throws InterruptedException {
		nameField.sendKeys(new_name);
		emailField.sendKeys(new_email);
		selectFromDropdown(countryPicker, country_name);
		mobileField.sendKeys(new_mobile);
		saveAndSendPassword();
		Thread.sleep(5000);
		done.click();
		return new UserAdminPage(driver);
	}

	public void verifySucessMessage() {
		if (userSucess.isDisplayed()) {
			System.out.println("User Created Correctly!");
		} else {
			System.out.println("User Not Created!");
		}
	}

}
