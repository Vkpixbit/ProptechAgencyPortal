package agencyusers;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import AgencyPortal.UserAdminCreatePage;
import AgencyPortal.HomePage;
import AgencyPortal.UserAdminPage;
import globalfiles.GlobalData;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAgencyUsersAdmins extends GlobalData {
	
	public WebDriver driver;
	
	@Given("I open login page and login {String} and {String} then open UserAdmin page and click Add User Admin")
	public void openUserAdminCreatePage(String email, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://139.59.35.179:310/");
		HomePage HomePage=LoginPage.login(email, password);
		UserAdminPage UserPage=HomePage.openUsers();
		UserPage.openAddUser();
		
	}
	
	
	@Given("^I enter (.+), (.+), (.+), (.+) and click Save & Continue$")
	public void VerifyCreateUser_Active_NoCountryCodeChange_DeveloperUserAdmin(String name,String email,String mobile_number,String address) {
		UserAdminCreatePage CreateUserPage=new UserAdminCreatePage(driver);
		//CreateUserPage.createNewUser_Active_NoCountryCodeChange_DeveloperAdmin(name,email,mobile_number,address);
		
	}
	/*@DataProvider
	public Object[][] userCreateData_1() throws IOException {
		List<HashMap<String, String>>value=getJsondata("/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] {{value.get(0)}};
	}*/
	
	
	
	@Test(enabled = false)
	public void VerifyCreateUser_Inactive_NoCountryChange(HashMap<String, String>input) {
		UserAdminCreatePage CreateUserPage=new UserAdminCreatePage(driver);
		//CreateUserPage.createNewUser_Inactive_NoCountryCodeChange_SecondaryAdmin(input.get("new_name"),input.get("new_email"),input.get("new_mobile"),input.get("new_address"));
	}
	@DataProvider
	public Object[][] userCreateData_2() throws IOException {
		List<HashMap<String, String>>value=getJsondata("/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] {{value.get(1)}};
	}
	
	
	
	@Test(enabled = false)
	public void VerifyCreateUser_Active_ChangeCountryCode(HashMap<String, String>input) {
		UserAdminCreatePage CreateUserPage=new UserAdminCreatePage(driver);
		//CreateUserPage.createNewUser_Active_ChangeCountryCode_TrakheesiAdmin(input.get("new_name"),input.get("new_email"),input.get("country"),input.get("new_mobile"),input.get("new_address"));
	}
	@DataProvider
	public Object[][] userCreateData_3() throws IOException {
		List<HashMap<String, String>>value=getJsondata("/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] {{value.get(2)}};
	}
	
	
	
	@Test(enabled = false)
	public void VerifyCreateUser_Inactive_NoCountryCodeChange(HashMap<String, String>input) {
		UserAdminCreatePage CreateUserPage=new UserAdminCreatePage(driver);
		//CreateUserPage.createNewuser_Inactive_ChangeCountryCode_PropertiesSpecailist(input.get("new_name"),input.get("new_email"),input.get("country"),input.get("new_mobile"),input.get("new_address"));
	}
	@DataProvider
	public Object[][] userCreateData_4() throws IOException {
		List<HashMap<String, String>>value=getJsondata("/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] {{value.get(3)}};
	}
	
	
	
	@Test(dataProvider = "userCreateData_5",groups = "UAT Change")
	public void verifyUserAddWithoutAddress(HashMap<String, String>input) throws InterruptedException {
		HomePage HomePage=LoginPage.login(input.get("email_id"),input.get("password"));
		UserAdminPage UserPage=HomePage.openUsers();
		UserAdminCreatePage CreateUserPage=UserPage.openAddUser();
		CreateUserPage.createUserWithoutAddress(input.get("new_name"),input.get("new_email"),input.get("country"),input.get("new_mobile"));
		CreateUserPage.verifySucessMessage();
	}
	@DataProvider
	public Object[][] userCreateData_5() throws IOException {
		List<HashMap<String, String>>value=getJsondata("/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] {{value.get(4)}};
	}
}