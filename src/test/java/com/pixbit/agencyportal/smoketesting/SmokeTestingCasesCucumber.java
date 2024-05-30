package com.pixbit.agencyportal.smoketesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.pixbit.agencyportal.globalfiles.GlobalData;
import com.pixbit.agencyportal.pages.HomePage;
import com.pixbit.agencyportal.pages.LoginPage;
import com.pixbit.agencyportal.pages.UserAdminCreatePage;
import com.pixbit.agencyportal.pages.UserAdminPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SmokeTestingCasesCucumber extends GlobalData {

	
public WebDriver driver;
	
	@Given("^I enter (.+), (.+), (.+), (.+) and click Save & Send Password$")
	@Then("Verify created user admin details")
	public void createAndVerifyUserAdmin(String name, String email,String mobile_number,String address) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://prosper.agency.pixbit.in/login");
		LoginPage LoginPage=new LoginPage(driver);
		HomePage HomePage=LoginPage.login("vishnudas@pixbitsolutions.com", "Prosper@1lE6w");
		UserAdminPage UserAdminPage=HomePage.openUserAdmin();
		UserAdminCreatePage UserAdminCreatePage =UserAdminPage.openAddUser();
		/*UserAdminCreatePage.createNewUserAdmin_Active_NoCountryCodeChange_DeveloperAdmin(name,email,mobile_number,address);
		UserAdminPage.verifyUserAdmin(name, email, mobile_number, address);
		driver.quit();*/
	}
	
	
}
