package com.pixbit.agencyportal.pages;

import org.openqa.selenium.By;
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
	
	public PropertyDetailsPage openPropertyDetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr[1]//button")).click();
		return new PropertyDetailsPage(driver);
	}

}
