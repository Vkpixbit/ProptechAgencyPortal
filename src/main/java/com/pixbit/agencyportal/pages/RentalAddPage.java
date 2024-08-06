package com.pixbit.agencyportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pixbit.agencyportal.reusefiles.Components;

public class RentalAddPage extends Components {
	 

	WebDriver driver;
	
	public RentalAddPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "(//input[@type='file'])[1]")
	WebElement ejariUploadField;
	
	@FindBy(xpath = "(//input[@type='file'])[2]")
	WebElement tenancyUploadField;
	
	@FindBy(name = "ejari_contract_number")
	WebElement ejariContractNumberField;
	
	@FindBy(name = "tenancy_contract_date")
	public WebElement tenancyContractDateField;
	
	@FindBy(name = "ejari_registration_date")
	public WebElement ejariRegistrationDateField;
	
	@FindBy(name = "tenancy_contract_number")
	WebElement tenancyContractNumberField;
	
	@FindBy(name = "building_name")
	WebElement buildingNameNumberField;
	
	@FindBy(name = "land_area")
	WebElement landAreaField;
	
	@FindBy(name = "plot_number")
	WebElement plotNumberField;
	
	@FindBy(name = "land_dm_number")
	WebElement landDmNumberField;
	
	@FindBy(name = "uae_ng_no")
	WebElement uaeNgNumberField;
	
	@FindBy(name = "property_no")
	WebElement propertyNumberField;
	
	@FindBy(name = "property_size")
	WebElement propertySizeField;
	
	@FindBy(name = "property_sub_type")
	WebElement propertySubTypeField;
	
	@FindBy(name = "dewa_premise_number")
	WebElement dewaPremiseNumberField;
	
	@FindBy(name = "owner_name")
	WebElement ownerNameField;
	
	@FindBy(name = "owner_number")
	WebElement ownerNumberField;
	
	@FindBy(name = "owner_mobile_number")
	WebElement ownerMobileNumberField;
	
	@FindBy(name = "owner_email")
	WebElement ownerEmailField;
	
	@FindBy(name = "owner_nationality")
	WebElement ownerNationalityField;
	
	
	public void uploadEjariTenancy(String ejari_document,String tenancy_document) throws InterruptedException {
		ejariUploadField.sendKeys("/Users/vk14/Downloads/Docs_for_testing/Ejary/"+ejari_document);
		Thread.sleep(2000);
		tenancyUploadField.sendKeys("/Users/vk14/Downloads/Docs_for_testing/Tenancy_Contract/"+tenancy_document);
		clickNext();
	}
	
	public void enterEjariNumber(String ejari_contract_number) throws InterruptedException {
		clearDataInField(ejariContractNumberField);
		Thread.sleep(2000);
		ejariContractNumberField.sendKeys(ejari_contract_number);
		clickNext();
		waitForElementToBeClickable(ejariContractNumberField);
	}
	
	public String tenancyContractDate(String tenancy_contract_date) {
		if(tenancyContractDateField.getAttribute("value").isEmpty()) {
			tenancyContractDateField.sendKeys(tenancy_contract_date);
			return tenancy_contract_date;
		}
		else {
			String actual_tenancy_contract_date =tenancyContractDateField.getAttribute("value");
			System.out.println(actual_tenancy_contract_date);
			return actual_tenancy_contract_date;
		}
		
	}
	
	public String ejariRegistrationDate(String ejari_registration_date) {
		if(ejariRegistrationDateField.getAttribute("value").isEmpty()) {
			ejariRegistrationDateField.sendKeys(ejari_registration_date);
			return ejari_registration_date;
		}
		else {
			String actual_ejari_registration_date =ejariRegistrationDateField.getAttribute("value");
			//System.out.println(actual_ejari_registration_date);
			return actual_ejari_registration_date;
		}
		
	}
	

	public String tenancyContractNumber(String tenancy_contract_number) {
		if(tenancyContractNumberField.getText().isEmpty()) {
			tenancyContractNumberField.sendKeys(tenancy_contract_number);
			return tenancy_contract_number;
		}
		else {
			String acutal_tenancy_contract_number =tenancyContractNumberField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_tenancy_contract_number;
		}
	}
	
	public String buildingNameNumber(String building_name_number) {
		if(buildingNameNumberField.getText().isEmpty()) {
			tenancyContractNumberField.sendKeys(building_name_number);
			return building_name_number;
		}
		else {
			String acutal_building_name_number =buildingNameNumberField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_building_name_number;
		}
	}
	
	public String landArea(String land_area) {
		if(landAreaField.getText().isEmpty()) {
			landAreaField.sendKeys(land_area);
			return land_area;
		}
		else {
			String acutal_landarea =landAreaField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_landarea;
		}
	}
	
	public String plotNumber(String plot_number) {
		if(plotNumberField.getText().isEmpty()) {
			plotNumberField.sendKeys(plot_number);
			return plot_number;
		}
		else {
			String acutal_plotnumber =plotNumberField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_plotnumber;
		}
	}
	
	public String landDmNumber(String land_dm_number) {
		if(landDmNumberField.getText().isEmpty()) {
			landDmNumberField.sendKeys(land_dm_number);
			return land_dm_number;
		}
		else {
			String acutal_landDmNumber =landDmNumberField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_landDmNumber;
		}
	}
	
	public String uaeNgNumber(String uae_ng_number) {
		if(uaeNgNumberField.getText().isEmpty()) {
			uaeNgNumberField.sendKeys(uae_ng_number);
			return uae_ng_number;
		}
		else {
			String acutal_uae_ng_number =uaeNgNumberField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_uae_ng_number;
		}
	}
	
	public String propertyNumber(String property_number) {
		if(propertyNumberField.getText().isEmpty()) {
			propertyNumberField.sendKeys(property_number);
			return property_number;
		}
		else {
			String acutal_property_number =propertyNumberField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_property_number;
		}
	}

	public String propertySize(String property_size) {
		if(propertySizeField.getText().isEmpty()) {
			propertySizeField.sendKeys(property_size);
			return property_size;
		}
		else {
			String acutal_property_size =propertySizeField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_property_size;
		}
	}
	
	public void select_property_type(String property_type) {
		driver.findElement(By.xpath("//button[text()='"+property_type+"']")).click();
	}
	
	public String propertySubType(String property_sub_type) {
		if(propertySubTypeField.getText().isEmpty()) {
			propertySubTypeField.sendKeys(property_sub_type);
			return property_sub_type;
		}
		else {
			String acutal_property_sub_type =propertySubTypeField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_property_sub_type;
		}
	}
	
	public void select_property_usage(String property_usage) {
		driver.findElement(By.xpath("//button[text()='"+property_usage+"']")).click();
	}
	
	public String dewapremiseNumber(String dewa_premise_number) {
		if(dewaPremiseNumberField.getText().isEmpty()) {
			dewaPremiseNumberField.sendKeys(dewa_premise_number);
			return dewa_premise_number;
		}
		else {
			String acutal_dewa_premise_number =dewaPremiseNumberField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_dewa_premise_number;
		}
	}
	
	public String ownerName(String owner_name) {
		if(ownerNameField.getText().isEmpty()) {
			ownerNameField.sendKeys(owner_name);
			return owner_name;
		}
		else {
			String acutal_owner_name =ownerNameField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_owner_name;
		}
	}
	
	public String ownerNumber(String owner_number) {
		if(ownerNumberField.getText().isEmpty()) {
			ownerNumberField.sendKeys(owner_number);
			return owner_number;
		}
		else {
			String acutal_owner_number =ownerNumberField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_owner_number;
		}
	}
	
	public String ownerPhoneNumber(String owner_phone_number) {
		if(ownerMobileNumberField.getText().isEmpty()) {
			ownerMobileNumberField.sendKeys(owner_phone_number);
			return owner_phone_number;
		}
		else {
			String acutal_owner_phone_number =ownerMobileNumberField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_owner_phone_number;
		}
	}
	
	public String ownerEmail(String owner_email) {
		if(ownerEmailField.getText().isEmpty()) {
			ownerEmailField.sendKeys(owner_email);
			return owner_email;
		}
		else {
			String acutal_owner_email =ownerEmailField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_owner_email;
		}
	}
	
	public String ownerNationality(String owner_nationality) {
		if(ownerMobileNumberField.getText().isEmpty()) {
			ownerMobileNumberField.sendKeys(owner_nationality);
			return owner_nationality;
		}
		else {
			String acutal_owner_email =ownerMobileNumberField.getText();
			//System.out.println(acutal_tenancy_contract_number);
			return acutal_owner_email;
		}
	}
	
}
