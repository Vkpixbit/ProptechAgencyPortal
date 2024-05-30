package com.pixbit.agencyportal.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusefiles.Components;

public class DeveloperEnqueryPage extends Components {

	WebDriver driver;

	public DeveloperEnqueryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@aria-hidden,'true')]")
	WebElement statusChangeDropdown;

	@FindBy(xpath = "//div[@class=' css-1dimb5e-singleValue']")
	WebElement statusView;

	@FindBy(xpath = "//button[text()='Change Status']")
	WebElement statusChangeClick;
	
	@FindBy(xpath = "//button[text()='Mark As Sold']")
	WebElement markasSoldButton;

	// "+enqueried_person+"

	public void openEnquiryDetailsPage(String enquiredPerson) throws InterruptedException {
	    Thread.sleep(3000);

	    List<WebElement> rows = driver.findElements(By.xpath("//tr[td[text()='" + enquiredPerson + "']]"));
	    //System.out.println(rows.size());

	    for (WebElement row : rows) {
	       
	        WebElement statusElement = row.findElement(By.xpath("td[8]")); 
	        String statusText = statusElement.getText();
	        if (statusText.equalsIgnoreCase("Pending")) {
	            row.findElement(By.xpath("td[9]")).click();
	            Thread.sleep(3000);
	            //break;
	        }
	        //System.out.println("Item Not Get!");
	    }
	}

	public void statusChange(List<String> statuses) throws InterruptedException {
		for (String status : statuses) {
			Thread.sleep(4000);
			// System.out.println("Testing");
			statusChangeClick.click();
			statusChangeDropdown.click();

			String xpath = "//div[text()='" + status + "']";

			WebElement statusElement = driver.findElement(By.xpath(xpath));

			statusElement.click();

			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Test_" + status);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Done']")).click();

			if (status.equals("Completed")) {
				break;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void changeStatusComplete() throws InterruptedException {
		List<String> statuses = Arrays.asList("Reviewing", "Rejected", "Completed");

		// Call the method to change status to "Completed"
		statusChange(statuses);
	}
	
	public MarkAsSoldPage markAsSOld() {
		markasSoldButton.click();
		return new MarkAsSoldPage(driver);
	}

}
