package com.pixbit.agencyportal.pages;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusefiles.Components;

public class ProjectCreatePage extends Components {

	WebDriver driver;

	public ProjectCreatePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "developer")
	WebElement developerDropdown;

	@FindBy(id = "status")
	WebElement idDropdown;

	@FindBy(id = "organization")
	WebElement projectNameField;

	@FindBy(name = "projectNumber")
	WebElement projectNumberField;

	@FindBy(name = "projectDescription")
	WebElement projectDescriptionField;

	@FindBy(name = "escrowAccount")
	WebElement escrowNumberField;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.phase_name']")
	WebElement phaseNameField1;

	@FindBy(xpath = "//input[@id='developer_project_phases.0.noc_document']")
	WebElement nocUpload_1;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.0.project_payment_plan_name']")
	WebElement firstPhasePlanNameField;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.0.project_payment_schedules.0.payment_schedule_date']")
	WebElement dateField_1_1_1;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.0.project_payment_plan_name']")
	WebElement paymentNameField1;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.0.project_payment_schedules.0.payment_schedule_particular']")
	WebElement particularField_1_1_1;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.0.project_payment_schedules.0.payment_schedule_period']")
	WebElement periodField_1_1_1;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.0.project_payment_schedules.0.project_payment_amount']")
	WebElement bookingAmountField_1_1_1;

	@FindBy(xpath = "//div[.='Payment Plan 1']")
	WebElement paymentPlanElement;

	@FindBy(xpath = "//div//h5")
	WebElement projectSuccessMessage;

	@FindBy(xpath = "(//button[text()='Add Payment Schedule'])[1]")
	WebElement addPaymentShedule1_1;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.0.project_payment_schedules.1.payment_schedule_date']")
	WebElement dateField_1_1_2;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.0.project_payment_schedules.1.payment_schedule_particular']")
	WebElement particularField_1_1_2;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.0.project_payment_schedules.1.payment_schedule_period']")
	WebElement periodField_1_1_2;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.0.project_payment_schedules.1.project_payment_amount']")
	WebElement bookingAmountField_1_1_2;

	@FindBy(xpath = "(//button[text()='Add Payment Plan'])[1]")
	WebElement addPaymentPlan2;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.1.project_payment_plan_name']")
	WebElement paymentNameField2;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.1.project_payment_schedules.0.payment_schedule_date']")
	WebElement dateField3;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.1.project_payment_schedules.0.payment_schedule_particular']")
	WebElement particularField3;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.1.project_payment_schedules.0.payment_schedule_period']")
	WebElement periodField3;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.1.project_payment_schedules.0.project_payment_amount']")
	WebElement bookingAmountField3;

	@FindBy(xpath = "(//button[text()='Add Payment Schedule'])[2]")
	WebElement addPaymentShedule2;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.1.project_payment_schedules.1.payment_schedule_date']")
	WebElement dateField4;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.1.project_payment_schedules.1.payment_schedule_particular']")
	WebElement particularField4;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.1.project_payment_schedules.1.payment_schedule_period']")
	WebElement periodField4;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.1.project_payment_schedules.1.project_payment_amount']")
	WebElement bookingAmountField4;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.1.project_payment_schedules.2.payment_schedule_date']")
	WebElement dateField5;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.1.project_payment_schedules.2.payment_schedule_particular']")
	WebElement particularField5;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.1.project_payment_schedules.2.payment_schedule_period']")
	WebElement periodField5;

	@FindBy(xpath = "//input[@name='developer_project_phases.0.project_payment_plans.1.project_payment_schedules.2.project_payment_amount']")
	WebElement bookingAmountField5;

	@FindBy(xpath = "(//button[text()='Add Phase'])[1]")
	WebElement addPhase_2;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.phase_name']")
	WebElement phaseNameField_2;

	@FindBy(xpath = "//input[@id='developer_project_phases.1.noc_document']")
	WebElement nocUpload_2;
	
	@FindBy(xpath = "//input[@id='under-construction.1']")
	WebElement underConstructionPhase_2;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.0.project_payment_plan_name']")
	WebElement paymentNameField_2_1;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.0.project_payment_schedules.0.payment_schedule_date']")
	WebElement dateField_2_1_1;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.0.project_payment_schedules.0.payment_schedule_particular']")
	WebElement particularField_2_1_1;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.0.project_payment_schedules.0.payment_schedule_period']")
	WebElement periodField_2_1_1;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.0.project_payment_schedules.0.project_payment_amount']")
	WebElement bookingAmountField_2_1_1;

	@FindBy(xpath = "(//button[text()='Add Payment Schedule'])[2]")
	WebElement addPaymentShedule3;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.0.project_payment_schedules.1.payment_schedule_date']")
	WebElement dateField_2_2;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.0.project_payment_schedules.1.payment_schedule_particular']")
	WebElement particularField_1_1_2_2;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.0.project_payment_schedules.1.payment_schedule_period']")
	WebElement periodField_1_1_2_2;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.0.project_payment_schedules.1.project_payment_amount']")
	WebElement bookingAmountField_1_1_2_2;

	@FindBy(xpath = "(//button[text()='Add Payment Plan'])[2]")
	WebElement addPaymentPlan2_1;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.1.project_payment_plan_name']")
	WebElement paymentNameField2_2;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.1.project_payment_schedules.0.payment_schedule_date']")
	WebElement dateField_1_1_2_3;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.1.project_payment_schedules.0.payment_schedule_particular']")
	WebElement particularField_1_1_2_3;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.1.project_payment_schedules.0.payment_schedule_period']")
	WebElement periodField_1_1_2_3;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.1.project_payment_schedules.0.project_payment_amount']")
	WebElement bookingAmountField_1_1_2_3;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.1.project_payment_schedules.1.payment_schedule_date']")
	WebElement dateField_1_1_2_4;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.1.project_payment_schedules.1.payment_schedule_particular']")
	WebElement particularField_1_1_2_4;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.1.project_payment_schedules.1.payment_schedule_period']")
	WebElement periodField_1_1_2_4;

	@FindBy(xpath = "//input[@name='developer_project_phases.1.project_payment_plans.1.project_payment_schedules.1.project_payment_amount']")
	WebElement bookingAmountField_1_1_2_4;

	public void selectDeveloperAndStatus(String project_developer, String project_status) throws InterruptedException {
		developerDropdown.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='" + project_developer + "']")).click();
		Thread.sleep(2000);
		idDropdown.click();
		driver.findElement(By.xpath("//div[text()='" + project_status + "']"));
	}

	public void enterProjectDetails(String project_name, String project_number, String project_description,
			String escrow_number) throws InterruptedException {
		projectNameField.sendKeys(project_name);
		projectNumberField.sendKeys(project_number);
		projectDescriptionField.sendKeys(project_description);
		escrowNumberField.sendKeys(escrow_number);
		Thread.sleep(2000);
	}

	// Ready Unit status and Yes Post Handover status
	public void readyUnitYesPostHandover_1(String phase_name_1, String noc_document, String unit_status,
			String post_handover_status, String payment_name, String date, String particular_value, String period,
			String booking_amount) throws InterruptedException, AWTException {
		phaseNameField1.sendKeys(phase_name_1);
		Thread.sleep(2000);
		nocUpload_1.sendKeys("/Users/vk14/Downloads/" + noc_document);
		scrollToElement(paymentPlanElement);
		Thread.sleep(3000);
		driver.findElement(By.id("ready-status.0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("1.0")).click();
		Thread.sleep(2000);
		paymentNameField1.sendKeys(payment_name);
		dateField_1_1_1.sendKeys(date);
		particularField_1_1_1.sendKeys(particular_value);
		periodField_1_1_1.sendKeys(period);
		bookingAmountField_1_1_1.sendKeys(booking_amount);
		Thread.sleep(2000);
		clickSave();
		Thread.sleep(2000);
		clickDone();
	}

	/*
	 * Ready Status Phase 1 Payment Plan 2 Shedules
	 */
	public void ReadyUnitYesPostHandover_2(String phase_name_1, String noc_document, String unit_status,
			String post_handover_status, String payment_name, String date_1_1, String particular_value_1_1,
			String period_1_1, String booking_amount_1_1, String date_1_2, String particular_value_1_2,
			String period_1_2, String booking_amount_1_2) throws InterruptedException {
		phaseNameField1.sendKeys(phase_name_1);
		Thread.sleep(2000);
		nocUpload_1.sendKeys("/Users/vk14/Downloads/" + noc_document);
		scrollToElement(paymentPlanElement);
		Thread.sleep(3000);
		driver.findElement(By.id("ready-status.0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("1.0")).click();
		Thread.sleep(2000);
		paymentNameField1.sendKeys(payment_name);
		dateField_1_1_1.sendKeys(date_1_1);
		particularField_1_1_1.sendKeys(particular_value_1_1);
		periodField_1_1_1.sendKeys(period_1_1);
		bookingAmountField_1_1_1.sendKeys(booking_amount_1_1);
		Thread.sleep(2000);
		addPaymentShedule1_1.click();
		dateField_1_1_2.sendKeys(date_1_2);
		particularField_1_1_2.sendKeys(particular_value_1_2);
		periodField_1_1_2.sendKeys(period_1_2);
		bookingAmountField_1_1_2.sendKeys(booking_amount_1_2);
		Thread.sleep(2000);
	}

	// Ready Unit status and No Post handover
	public ProjectPage readyUnitNoPostHandover(String phase_name_1, String noc_document) throws InterruptedException {
		phaseNameField1.sendKeys(phase_name_1);
		Thread.sleep(2000);
		nocUpload_1.sendKeys("/Users/vk14/Downloads/" + noc_document);
		scrollToElement(paymentPlanElement);
		Thread.sleep(2000);
		driver.findElement(By.id("ready-status.0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("0.0")).click();
		Thread.sleep(2000);
		clickSave();
		System.out.println("Project saved correctly !");
		return new ProjectPage(driver);
	}

	// Under construction unit status and mandatory post handover
	public ProjectPage underconstructionUnit(String phase_name_1, String noc_document, String payment_name, String date,
			String particular_value, String period, String booking_amount) throws InterruptedException {
		phaseNameField1.sendKeys(phase_name_1);
		Thread.sleep(2000);
		nocUpload_1.sendKeys("/Users/vk14/Downloads/" + noc_document);
		scrollToElement(paymentPlanElement);
		Thread.sleep(2000);
		driver.findElement(By.id("under-construction.0")).click();
		Thread.sleep(2000);
		paymentNameField1.sendKeys(payment_name);
		dateField_1_1_1.sendKeys(date);
		particularField_1_1_1.sendKeys(particular_value);
		periodField_1_1_1.sendKeys(period);
		bookingAmountField_1_1_1.sendKeys(booking_amount);
		Thread.sleep(2000);
		clickSave();
		Thread.sleep(3000);
		clickDone();
		return new ProjectPage(driver);
	}

	// Ready Unit status and Yes Post Handover status
	// 2 Payment Plan contains with multiple payment shedule
	// First payment plan contains two payment shedules and second payment plan
	// contains three payment shedules
	public void readyUnitYesPostHandover_2(String phase_name_1, String noc_document, String payment_name_1,
			String date_1, String particular_value_1, String period_1, String booking_amount_1, String date_2,
			String particular_value_2, String period_2, String booking_amount_2, String payment_name_2, String date_3,
			String particular_value_3, String period_3, String booking_amount_3, String date_4,
			String particular_value_4, String period_4, String booking_amount_4, String date_5,
			String particular_value_5, String period_5, String booking_amount_5) throws InterruptedException {
		phaseNameField1.sendKeys(phase_name_1);
		Thread.sleep(2000);
		nocUpload_1.sendKeys("/Users/vk14/Downloads/" + noc_document);
		scrollToElement(paymentPlanElement);
		Thread.sleep(3000);
		driver.findElement(By.id("ready-status.0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("1.0")).click();
		Thread.sleep(2000);
		paymentNameField1.sendKeys(payment_name_1);
		dateField_1_1_1.sendKeys(date_1);
		particularField_1_1_1.sendKeys(particular_value_1);
		periodField_1_1_1.sendKeys(period_1);
		bookingAmountField_1_1_1.sendKeys(booking_amount_1);
		addPaymentShedule1_1.click();
		dateField_1_1_2.sendKeys(date_2);
		particularField_1_1_2.sendKeys(particular_value_2);
		periodField_1_1_2.sendKeys(particular_value_2);
		bookingAmountField_1_1_2.sendKeys(booking_amount_2);
		Thread.sleep(2000);
		addPaymentPlan2.click();
		paymentNameField2.sendKeys(payment_name_2);
		dateField3.sendKeys(date_3);
		particularField3.sendKeys(particular_value_3);
		periodField3.sendKeys(period_3);
		bookingAmountField3.sendKeys(booking_amount_3);
		scrollToElement(addPaymentShedule2);
		waitForElementToBeClickable(addPaymentShedule2);
		addPaymentShedule2.click();
		dateField4.sendKeys(date_4);
		particularField4.sendKeys(particular_value_4);
		periodField4.sendKeys(period_4);
		bookingAmountField4.sendKeys(booking_amount_4);
		scrollToElement(addPaymentShedule2);
		Thread.sleep(2000);
		addPaymentShedule2.click();
		dateField5.sendKeys(date_5);
		particularField5.sendKeys(particular_value_5);
		periodField5.sendKeys(period_5);
		bookingAmountField5.sendKeys(booking_amount_5);
	}

	// Underconstruction with mandatory payment plans
	// 2 Payment Plan contains with multiple payment shedule
	// First Payment Plan contains three shedules and second payment plan contains
	// two shedules
	public void underConstructionUnit2(String phase_name_1, String noc_document, String payment_name_1, String date_1,
			String particular_value_1, String period_1, String booking_amount_1, String date_2,
			String particular_value_2, String period_2, String booking_amount_2, String payment_name_2, String date_3,
			String particular_value_3, String period_3, String booking_amount_3, String date_4,
			String particular_value_4, String period_4, String booking_amount_4, String date_5,
			String particular_value_5, String period_5, String booking_amount_5) throws InterruptedException {
		phaseNameField1.sendKeys(phase_name_1);
		Thread.sleep(2000);
		nocUpload_1.sendKeys("/Users/vk14/Downloads/" + noc_document);
		scrollToElement(paymentPlanElement);
		Thread.sleep(2000);
		driver.findElement(By.id("under-construction.0")).click();
		Thread.sleep(2000);
		paymentNameField1.sendKeys(payment_name_1);
		dateField_1_1_1.sendKeys(date_1);
		particularField_1_1_1.sendKeys(particular_value_1);
		periodField_1_1_1.sendKeys(period_1);
		bookingAmountField_1_1_1.sendKeys(booking_amount_1);
		addPaymentShedule1_1.click();
		dateField_1_1_2.sendKeys(date_2);
		particularField_1_1_2.sendKeys(particular_value_2);
		periodField_1_1_2.sendKeys(particular_value_2);
		bookingAmountField_1_1_2.sendKeys(booking_amount_2);
		addPaymentShedule1_1.click();
		dateField3.sendKeys(date_3);
		particularField3.sendKeys(particular_value_3);
		periodField3.sendKeys(period_3);
		bookingAmountField3.sendKeys(booking_amount_3);
		Thread.sleep(2000);
		addPaymentPlan2.click();
		dateField4.sendKeys(date_4);
		particularField4.sendKeys(particular_value_4);
		periodField4.sendKeys(period_4);
		bookingAmountField4.sendKeys(booking_amount_4);
		scrollToElement(addPaymentShedule2);
		waitForElementToBeClickable(addPaymentShedule2);
		addPaymentShedule2.click();
		dateField5.sendKeys(date_5);
		particularField5.sendKeys(particular_value_5);
		periodField5.sendKeys(period_5);
		bookingAmountField5.sendKeys(booking_amount_5);
		Thread.sleep(2000);
		clickSave();
		Thread.sleep(2000);
		clickDone();
	}

	public void ReadyAndUnderconstructionCases(String phase_name_1, String noc_document, String payment_name_1,
			String date_1, String particular_value_1, String period_1, String booking_amount_1, String date_2,
			String particular_value_2, String period_2, String booking_amount_2, String payment_name_2, String date_3,
			String particular_value_3, String period_3, String booking_amount_3, String date_4,
			String particular_value_4, String period_4, String booking_amount_4, String date_5,
			String particular_value_5, String period_5, String booking_amount_5, String phase_name_2,
			String payment_name_2_1, String date2_1, String particular_2_1, String period_2_1,
			String booking_amount_2_1, String date_2_2, String particular_value_2_2, String period_2_2,
			String booking_amount_2_2, String payment_name_2_2, String date_2_3, String particular_value_2_3,
			String period_2_3, String booking_amount_2_3, String date_2_4, String particular_value_2_4,
			String period_2_4, String booking_amount_2_4) throws InterruptedException {
		readyUnitYesPostHandover_2(phase_name_1, noc_document, payment_name_1, date_1, particular_value_1, period_1,
				booking_amount_1, date_2, particular_value_2, period_2, booking_amount_2, payment_name_2, date_3,
				particular_value_3, period_3, booking_amount_3, date_4, particular_value_4, period_4, booking_amount_4,
				date_5, particular_value_5, period_5, booking_amount_5);
		scrollToElement(addPhase_2);
		waitForElementToBeClickable(addPhase_2);
		addPhase_2.click();
		phaseNameField_2.sendKeys(phase_name_2);
		nocUpload_2.sendKeys("/Users/vk14/Downloads/" + noc_document);
		scrollToElement(driver.findElement(By.xpath("(//div[.='Payment Plan 1'])[2]")));
		Thread.sleep(3000);
		driver.findElement(By.id("under-construction.1")).click();
		paymentNameField_2_1.sendKeys(payment_name_2_1);
		dateField_2_1_1.sendKeys(date2_1);
		particularField_2_1_1.sendKeys(particular_2_1);
		periodField_2_1_1.sendKeys(period_2_1);
		bookingAmountField_2_1_1.sendKeys(booking_amount_2_1);
		scrollToElement(driver.findElement(By.xpath("(//button[text()='Add Payment Schedule'])[3]")));
		waitForElementToBeClickable(driver.findElement(By.xpath("(//button[text()='Add Payment Schedule'])[3]")));
		driver.findElement(By.xpath("(//button[text()='Add Payment Schedule'])[3]")).click();
		dateField_2_2.sendKeys(date_2_2);
		particularField_1_1_2_2.sendKeys(particular_value_2_2);
		periodField_1_1_2_2.sendKeys(period_2_2);
		bookingAmountField_1_1_2_2.sendKeys(booking_amount_2_2);
		Thread.sleep(2000);
		addPaymentPlan2_1.click();
		paymentNameField2_2.sendKeys(payment_name_2_2);
		dateField_1_1_2_3.sendKeys(date_2_3);
		particularField_1_1_2_3.sendKeys(particular_value_2_3);
		periodField_1_1_2_3.sendKeys(period_2_3);
		bookingAmountField_1_1_2_3.sendKeys(booking_amount_2_3);
		scrollToElement(driver.findElement(By.xpath("(//button[text()='Add Payment Plan'])[2]")));
		waitForElementToBeClickable(driver.findElement(By.xpath("(//button[text()='Add Payment Schedule'])[4]")));
		driver.findElement(By.xpath("(//button[text()='Add Payment Schedule'])[4]")).click();
		dateField_1_1_2_4.sendKeys(date_2_4);
		particularField_1_1_2_4.sendKeys(particular_value_2_4);
		periodField_1_1_2_4.sendKeys(period_2_4);
		bookingAmountField_1_1_2_4.sendKeys(booking_amount_2_4);
	}

	/*
	 * First phase Ready contain 1 payment plan 2 shedules second phase
	 * Underconstruction contain 2 payment plan first plan 1 shedule and second plan
	 * 2 shedule third phase contain 1 payment plan 1 shedule
	 */
	public void TwoReadyOneUnderconstructionCase(String phase_name_1, String noc_document, String payment_name_1_1,
			String date_1_1_1, String particular_value_1_1_1, String period_1_1_1, String booking_amount_1_1_1,
			String date_1_1_2, String particular_value_1_1_2, String period_1_1_2, String booking_amount_1_1_2,
			String phase_name_2,String payment_name_2_1) throws InterruptedException {
		phaseNameField1.sendKeys(phase_name_1);
		nocUpload_1.sendKeys(noc_document);
		firstPhasePlanNameField.sendKeys(payment_name_1_1);
		dateField_1_1_1.sendKeys(date_1_1_1);
		particularField_1_1_1.sendKeys(particular_value_1_1_1);
		periodField_1_1_1.sendKeys(period_1_1_1);
		bookingAmountField_1_1_1.sendKeys(booking_amount_1_1_1);
		addPaymentShedule1_1.click();
		dateField_1_1_2.sendKeys(date_1_1_2);
		particularField_1_1_2.sendKeys(particular_value_1_1_2);
		periodField_1_1_2.sendKeys(period_1_1_2);
		bookingAmountField_1_1_2.sendKeys(booking_amount_1_1_2);
		addPhase_2.click();
		phaseNameField_2.sendKeys(phase_name_2);
		nocUpload_2.sendKeys(noc_document);
		underConstructionPhase_2.click();
		paymentNameField_2_1.sendKeys(payment_name_2_1);

	}

	public void projectSave() throws InterruptedException {
		Thread.sleep(2000);
		clickSave();
		Thread.sleep(2000);
		clickDone();
	}

}
