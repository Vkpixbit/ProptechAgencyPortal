package com.pixbit.agencyportal.useradmin.test;

import com.pixbit.agencyportal.globalfiles.GlobalData;
import org.testng.annotations.Test;

import com.pixbit.agencyportal.pages.HomePage;
import com.pixbit.agencyportal.pages.UserAdminCreatePage;
import com.pixbit.agencyportal.pages.UserAdminPage;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAgencyUsersAdmins extends GlobalData {

	public WebDriver driver;

	// @Given("I open login page and login {String} and {String} then open UserAdmin
	// page and click Add User Admin")
	@Test
	public void openUserAdminCreatePage(String email, String password, String user_name, String user_email,
			String country_code, String mobile_number, String address, String role) throws InterruptedException {
		HomePage HomePage = LoginPage.login(email, password);
		UserAdminPage UserAdminPage = HomePage.openUserAdmin();
		UserAdminCreatePage useradmincreatepage = UserAdminPage.openAddUser();
		useradmincreatepage.createNewUserAdminActive(user_name, user_email, country_code, mobile_number, address, role);
	}
	
	
	

	//@Given("^I enter (.+), (.+), (.+), (.+) and click Save & Continue$")
	public void VerifyCreateUser_Active_NoCountryCodeChange_DeveloperUserAdmin(String user_name, String user_email,
			String country_code, String mobile_number, String address, String role) throws InterruptedException {
		UserAdminCreatePage useradmincreatepage = new UserAdminCreatePage(driver);
		useradmincreatepage.createNewUserAdminActive(user_name, user_email, country_code, mobile_number, address, role);

	}

	@Test(enabled = false)
	public void VerifyCreateUser_Inactive_NoCountryChange(HashMap<String, String> input) {
		UserAdminCreatePage CreateUserPage = new UserAdminCreatePage(driver);
		// CreateUserPage.createNewUser_Inactive_NoCountryCodeChange_SecondaryAdmin(input.get("new_name"),input.get("new_email"),input.get("new_mobile"),input.get("new_address"));
	}

	@DataProvider
	public Object[][] userCreateData_2() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] { { value.get(1) } };
	}

	@Test(enabled = false)
	public void VerifyCreateUser_Active_ChangeCountryCode(HashMap<String, String> input) {
		UserAdminCreatePage CreateUserPage = new UserAdminCreatePage(driver);
		// CreateUserPage.createNewUser_Active_ChangeCountryCode_TrakheesiAdmin(input.get("new_name"),input.get("new_email"),input.get("country"),input.get("new_mobile"),input.get("new_address"));
	}

	@DataProvider
	public Object[][] userCreateData_3() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] { { value.get(2) } };
	}

	@Test(enabled = false)
	public void VerifyCreateUser_Inactive_NoCountryCodeChange(HashMap<String, String> input) {
		UserAdminCreatePage CreateUserPage = new UserAdminCreatePage(driver);
		// CreateUserPage.createNewuser_Inactive_ChangeCountryCode_PropertiesSpecailist(input.get("new_name"),input.get("new_email"),input.get("country"),input.get("new_mobile"),input.get("new_address"));
	}

	@DataProvider
	public Object[][] userCreateData_4() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] { { value.get(3) } };
	}

	@Test(dataProvider = "userCreateData_5", groups = "UAT Change")
	public void verifyUserAddWithoutAddress(HashMap<String, String> input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		UserAdminPage UserPage = HomePage.openUserAdmin();
		UserAdminCreatePage CreateUserPage = UserPage.openAddUser();
		CreateUserPage.createUserWithoutAddress(input.get("new_name"), input.get("new_email"), input.get("country"),
				input.get("new_mobile"));
		CreateUserPage.verifySucessMessage();
	}

	@DataProvider
	public Object[][] userCreateData_5() throws IOException {
		List<HashMap<String, String>>value=getJsondata("/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] {{value.get(4)}};
	}
}