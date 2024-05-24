package com.pixbit.agencyportal.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusefiles.Components;

public class HomePage extends Components {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='User Admin']")
	WebElement usersButton;

	@FindBy(xpath = "//div[text()='Projects']")
	WebElement projectButton;

	@FindBy(xpath = "//div[text()='All Properties']")
	WebElement allPropertiesButton;

	@FindBy(xpath = "//div[text()='Developer']")
	WebElement developer;

	@FindBy(xpath = "//div[text()='Listings']")
	WebElement developerListing;

	@FindBy(xpath = "//div[text()='Settings']")
	WebElement settingsButton;

	@FindBy(xpath = "//div[text()='Property Specialist']")
	WebElement propertySpecalistButton;
	
	@FindBy(xpath = "//div[text()='Secondary']")
	WebElement secondary;
	
	@FindBy(xpath = "//div[text()='Enquiries']")
	WebElement Enquiries;
	

	public void loginVerification() {
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "http://prosper.agency.pixbit.in/dashboard";
		org.testng.Assert.assertEquals(currentURL, expectedURL);
	}

	public UserAdminPage openUserAdmin() throws InterruptedException {
		Thread.sleep(2000);
		settingsButton.click();
		Thread.sleep(2000);
		usersButton.click();
		return new UserAdminPage(driver);
	}

	public ProjectPage openProjects() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Projects']"))) != null) {
			projectButton.click();
			return new ProjectPage(driver);
		} else {
			developer.click();
			projectButton.click();
			return new ProjectPage(driver);
		}

	}

	public DeveloperListingPage openAllProperties() throws InterruptedException {
		Thread.sleep(3000);
		allPropertiesButton.click();
		return new DeveloperListingPage(driver);
	}

	public DeveloperListingPage openDeveloperListingPage() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Listings']"))) == null) {
			developer.click();
			developerListing.click();
			return new DeveloperListingPage(driver);
		} 
		else {
			Thread.sleep(2000);
			developerListing.click();
			return new DeveloperListingPage(driver);		}
	}

	public PropertySpecalistPage openPropertySpecalistPage() throws InterruptedException {
		Thread.sleep(2000);
		settingsButton.click();
		Thread.sleep(2000);
		propertySpecalistButton.click();
		return new PropertySpecalistPage(driver);
	}
	
	public SecondaryEnqueryPage openSecondaryEnquery() throws InterruptedException {
		Thread.sleep(2000);
		secondary.click();
		Thread.sleep(2000);
		Enquiries.click();
		return new SecondaryEnqueryPage(driver);
	}
	
	public DeveloperEnqueryPage developerEnqueryPage() throws InterruptedException {
		Thread.sleep(3000);
		developer.click();
		Thread.sleep(2000);
		Enquiries.click();
		Thread.sleep(2000);
		//System.out.println("Test");
		return new DeveloperEnqueryPage(driver);
	}
		

}
