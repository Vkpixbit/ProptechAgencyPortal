package com.pixbit.agencyportal.reusefiles;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Components {

	WebDriver driver;
	
	public Components(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement nextClick;
	
	@FindBy(xpath = "//div[text()='Save']")
	public  WebElement save;
	
	@FindBy(xpath = "//div[text()='Done']")
	WebElement done;
	
	@FindBy(xpath = "//button[text()='Save & Initiate Trakheesi']")
	WebElement saveAndInitate;
	
	@FindBy(xpath = "//button[text()='Save & Send Password']")
	WebElement saveSendPassword;
	
	

	public void clickNext() throws InterruptedException {
		Thread.sleep(2000);
		nextClick.click();
		Thread.sleep(10000);
	}
	
	public void scrollUpToText(String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", text);
	}
	
	public void saveAndInitateTrakheesi() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", saveAndInitate);
	}
	
	public void clickSave() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", save);
	}
	
	public void clickDone() throws InterruptedException {
		Thread.sleep(2000);
		waitForElementToBeClickable(done);
		done.click();
		Thread.sleep(2000);
	}
	
	public void saveAndSendPassword() throws InterruptedException {
		saveSendPassword.click();
	}
	
	public void scrollToElement(WebElement elementToScrollTo) {
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	}
	
	public void waitForElementToBeClickable(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void visbilityOfElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void selectFromDropdown(WebElement element,String country) {
		Select select=new Select(element);
		select.selectByVisibleText(country);
	}
	
	public void clearDataInField(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", element);
	}
	
	public boolean isElementClickable(WebElement webElement) {
        try {
        	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
            return element != null && element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


}
