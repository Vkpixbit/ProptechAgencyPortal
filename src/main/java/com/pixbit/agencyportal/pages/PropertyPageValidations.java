package com.pixbit.agencyportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import reusefiles.Components;

public class PropertyPageValidations extends Components {

	WebDriver driver;
	
	public PropertyPageValidations(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='text-danger'])[1]")
	WebElement projectFieldError;
	
	public void verifyProjectError() throws InterruptedException {
		visbilityOfElement(save);
		Thread.sleep(3000);
		clickSave();
		String actualProjectError=projectFieldError.getText();
		Assert.assertEquals(actualProjectError,"Project is required");
	}
	
	
}
