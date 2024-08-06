package com.pixbit.agencyportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pixbit.agencyportal.reusefiles.Components;

public class UserAdminPage extends Components {

	WebDriver driver;
	
	

	public UserAdminPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='bx bx-plus ']")
	WebElement addUsers;
	
	@FindBy(id = "name")
	public WebElement nameField;
	
	@FindBy(id = "email")
	public  WebElement emailField;
	
	@FindBy(id = "mobile")
	public  WebElement mobileField;
	
	@FindBy(id = "address")
	public WebElement addressField;

	public UserAdminCreatePage openAddUser() throws InterruptedException {
		Thread.sleep(2000);
		addUsers.click();
		return new UserAdminCreatePage(driver);
	}

	public void openUserDetails(String name) throws InterruptedException {
		Thread.sleep(2000);

		WebElement row = driver.findElement(By.xpath("//td[text()='" + name + "']/parent::tr"));
		row.findElement(By.xpath(
				"//button[contains(@class, 'btn') and contains(@class, 'btn-outline-primary') and contains(@class, 'mt-2') and contains(@class, 'me-4') and contains(@class, 'btn-sm')]"))
				.click();
	}

	public void verifyUserAdmin(String name , String email, String mobile_number, String address)
			throws InterruptedException {
		openUserDetails(name);
		visbilityOfElement(nameField);
		Assert.assertTrue(nameField.getAttribute("value").contains(name),"phone number not valid");
		Assert.assertTrue(emailField.getAttribute("value").contains(email),"email id is not valid");
		String actual_mobile=mobileField.getAttribute("value");
		String actual_result=actual_mobile.substring(actual_mobile.indexOf(" ") + 1);
		Assert.assertTrue(actual_result.contains(mobile_number),"phone number is not valid");
		Assert.assertTrue(addressField.getAttribute("value").contains(address),"address is not valid");
		Thread.sleep(2000);
	}

}
