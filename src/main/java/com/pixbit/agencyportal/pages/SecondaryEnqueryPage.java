package com.pixbit.agencyportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pixbit.agencyportal.reusefiles.Components;

public class SecondaryEnqueryPage extends Components {
	
	WebDriver driver;
	
	public SecondaryEnqueryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//button[text()='Rental']")
	WebElement rentalTab;
	
	
	public void openSecRentalEnq() throws InterruptedException {
		Thread.sleep(2000);
		rentalTab.click();
	}
	
	public void openEnqueryDetailsPage(String enqueried_person) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//tr[td[text()='"+enqueried_person+"']])[1]/child::td[9]")).click();
	}
	
	public RentalAddPage openAddRental() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add Rental Details']")).click();
		return new RentalAddPage(driver);
	}
	
}
