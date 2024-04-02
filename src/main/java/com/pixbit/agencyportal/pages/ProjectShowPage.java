package com.pixbit.agencyportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProjectShowPage {

	WebDriver driver;

	public ProjectShowPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h6")
	WebElement developerHeading;

	@FindBy(xpath = "//span[@class='mt-2 me-1 btn-sm pt-1']")
	WebElement projectStatus;

	@FindBy(xpath = "(//p[@class='fw-semibold'])[1]")
	WebElement projectName;

	@FindBy(xpath = "(//p[@class='fw-semibold'])[2]")
	WebElement projectNumber;

	@FindBy(xpath = "(//span[@class='fw-semibold'])[2]")
	WebElement projectDescrption;

	@FindBy(xpath = "(//span[@class='fw-semibold'])[3]")
	WebElement escrowField;

	@FindBy(xpath = "(//span[@class='fw-semibold'])[4]")
	WebElement phaseNameField;

	@FindBy(xpath = "(//span[@class='fw-semibold'])[4]")
	WebElement unitStatusField;
	
	@FindBy(xpath = "(//span[@class='fw-semibold'])[6]")
	WebElement postHandoverStatus;

	@FindBy(xpath = "//button[@class='accordion-button ']")
	WebElement paymentPlanName;

	@FindBy(xpath = "(//span[@class='fw-semibold'])[6]")
	WebElement dateField;

	@FindBy(xpath = "(//span[@class='fw-semibold'])[7]")
	WebElement particularField;

	@FindBy(xpath = "(//span[@class='fw-semibold'])[8]")
	WebElement periodField;

	@FindBy(xpath = "(//span[@class='fw-semibold'])[9]")
	WebElement bookingAmountField;

	public void verifyProjectReadyUnitYesPostHandover(String project_developer, String project_status,
			String project_name, String project_number, String project_description, String escrow_number,
			String phase_name, String payment_name, String date, String particular_value, String period,
			String booking_amount) throws InterruptedException {
		Assert.assertEquals(developerHeading.getText(), project_developer);
		Assert.assertEquals(projectStatus.getText(), project_status);
		Assert.assertEquals(projectName.getText(), project_name);
		Assert.assertEquals(projectNumber.getText(), project_number);
		Assert.assertEquals(projectDescrption.getText(), project_description);
		Assert.assertEquals(escrowField.getText(), escrow_number);
		Assert.assertEquals(phaseNameField.getText(), phase_name);
		Assert.assertEquals(unitStatusField.getText(), "Ready");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(.,'" + payment_name + "')]")).click();
		Assert.assertTrue(paymentPlanName.getText().contains(payment_name));
		Assert.assertEquals(dateField.getText(), date);
		Assert.assertEquals(particularField.getText(), particular_value);
		Assert.assertEquals(periodField.getText(), period);
		Assert.assertEquals(bookingAmountField.getText(), booking_amount);
	}

	public void verifyProjectReadyUnitNoPostHandover(String project_developer, String project_status,
			String project_name, String project_number, String project_description,String escrow_number,String phase_name) throws InterruptedException {
		Assert.assertEquals(developerHeading.getText(), project_developer);
		Thread.sleep(2000);
		Assert.assertEquals(projectStatus.getText(), project_status);
		Thread.sleep(2000);
		Assert.assertEquals(projectName.getText(), project_name);
		Thread.sleep(2000);
		Assert.assertEquals(projectNumber.getText(), project_number);
		Thread.sleep(2000);
		Assert.assertEquals(projectDescrption.getText(), project_description);
		Thread.sleep(2000);
		Assert.assertEquals(escrowField.getText(), escrow_number);
		Thread.sleep(2000);
		Assert.assertEquals(phaseNameField.getText(), phase_name);
		Thread.sleep(2000);
		Assert.assertEquals(unitStatusField.getText(), "Ready");
		Thread.sleep(2000);
		Assert.assertEquals(postHandoverStatus.getText(),"No");
		Thread.sleep(2000);
	}
}
