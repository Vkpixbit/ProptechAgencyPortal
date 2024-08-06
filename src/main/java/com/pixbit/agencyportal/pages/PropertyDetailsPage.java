package com.pixbit.agencyportal.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pixbit.agencyportal.reusefiles.Components;

public class PropertyDetailsPage extends Components{
	
	WebDriver driver;
	
	public PropertyDetailsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Change Status']")
	WebElement changeStatusButton;
	
	@FindBy(xpath = "//div[@class='mt-1']//textarea")
	WebElement commentField;
	
	public void change_status(String sub_status_1,String sub_status_2) throws InterruptedException {
		List<String> sub_status_list = Arrays.asList(sub_status_1, sub_status_2);
		for (String sub_status : sub_status_list) {
			Thread.sleep(2000);
			changeStatusButton.click();
			driver.findElement(By.xpath("//div[@class=' css-13cymwt-control']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='"+sub_status+"']")).click();
			commentField.sendKeys("Test"+sub_status);
			clickSave();
			clickDone();
			Thread.sleep(3000);
		}
	}
	
	public void verify_developer_name(String expected_developer_name) {
		String acutal_developer_name = driver.findElement(By.xpath("//h6")).getText();
		Assert.assertEquals(acutal_developer_name,expected_developer_name);
	}
	
	public void verify_project_name(String expected_project_name) {
		String actual_project_name=driver.findElement(By.xpath("(//p[@class='fw-semibold'])[1]")).getText();
		Assert.assertEquals(actual_project_name, expected_project_name);
	}

}
