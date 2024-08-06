package com.pixbit.agencyportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pixbit.agencyportal.reusefiles.Components;

public class MarkAsSoldPage extends Components {
	
	WebDriver driver;

	public MarkAsSoldPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "")
	WebElement bookingFormField;
	
	@FindBy(xpath = "")
	WebElement bookingProofField;
	
	
	public void uploadBookingForm() {
		
	}
	
	public void uploadPaymentProof() {
		
	}

}
