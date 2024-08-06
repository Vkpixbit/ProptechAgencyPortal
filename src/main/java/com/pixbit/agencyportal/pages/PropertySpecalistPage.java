package com.pixbit.agencyportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pixbit.agencyportal.reusefiles.Components;

public class PropertySpecalistPage extends Components {

	WebDriver driver;

	public PropertySpecalistPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Add Specialist']")
	WebElement addPSButton;
	
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
	

	public PropertySpecalistCreationPage openPropertySpecalistCreationPage() throws InterruptedException {
		Thread.sleep(2000);
		addPSButton.click();
		return new PropertySpecalistCreationPage(driver);
	}

	public void openPsDetails(String ps_name) throws InterruptedException {
		Thread.sleep(2000);
		
		WebElement row = driver.findElement(By.xpath("//td[text()='" + ps_name + "']/parent::tr"));
		row.findElement(By.xpath(
				"//button[contains(@class, 'btn') and contains(@class, 'me-4') and contains(@class, 'btn-sm')]"))
				.click();
	}

	public void verifyPropertySpecalist(String ps_name, String ps_email, String ps_mobile, String ps_address)
			throws InterruptedException {
		Thread.sleep(2000);
		openPsDetails(ps_name);
		visbilityOfElement(psName);
		Assert.assertTrue(psName.getAttribute("value").contains(ps_name), "Name does not match");
		Assert.assertTrue(psEmail.getAttribute("value").contains(ps_email),"Email does not match");
		String actual_mobile=psMobile.getAttribute("value");
		String actual_result=actual_mobile.substring(actual_mobile.indexOf(" ") + 1);
		Assert.assertTrue(actual_result.contains(ps_mobile),"Mobile number does not match");
		Assert.assertTrue(psAddress.getAttribute("value").contains(ps_address),"Address does not match");
		Thread.sleep(2000);
	}

}
