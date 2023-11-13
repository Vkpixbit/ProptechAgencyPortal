package agencyusers;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import AgencyPortal.UserCreatePage;
import AgencyPortal.HomePage;
import AgencyPortal.UserPage;
import globalfiles.GlobalData;

public class CreateAgencyUsers extends GlobalData {
	
	@Test(enabled = false)
	public void VerifyCreateUser_Active_NoCountryCodeChange(HashMap<String, String>input) {
		UserCreatePage CreateUserPage=new UserCreatePage(driver);
		CreateUserPage.createNewUser_Active_NoCountryCodeChange(input.get("new_name"),input.get("new_email"),input.get("new_mobile"),input.get("new_address"));
		
	}
	@DataProvider
	public Object[][] userCreateData_1() throws IOException {
		List<HashMap<String, String>>value=getJsondata("/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] {{value.get(0)}};
	}
	
	
	
	@Test(enabled = false)
	public void VerifyCreateUser_Inactive_NoCountryChange(HashMap<String, String>input) {
		UserCreatePage CreateUserPage=new UserCreatePage(driver);
		CreateUserPage.createNewUser_Inactive_NoCountryCodeChange(input.get("new_name"),input.get("new_email"),input.get("new_mobile"),input.get("new_address"));
	}
	@DataProvider
	public Object[][] userCreateData_2() throws IOException {
		List<HashMap<String, String>>value=getJsondata("/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] {{value.get(1)}};
	}
	
	
	
	@Test(enabled = false)
	public void VerifyCreateUser_Active_ChangeCountryCode(HashMap<String, String>input) {
		UserCreatePage CreateUserPage=new UserCreatePage(driver);
		CreateUserPage.createNewUser_Active_ChangeCountryCode(input.get("new_name"),input.get("new_email"),input.get("country"),input.get("new_mobile"),input.get("new_address"));
	}
	@DataProvider
	public Object[][] userCreateData_3() throws IOException {
		List<HashMap<String, String>>value=getJsondata("/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] {{value.get(2)}};
	}
	
	
	
	@Test(enabled = false)
	public void VerifyCreateUser_Inactive_NoCountryCodeChange(HashMap<String, String>input) {
		UserCreatePage CreateUserPage=new UserCreatePage(driver);
		CreateUserPage.createNewuser_Inactive_ChangeCountryCode(input.get("new_name"),input.get("new_email"),input.get("country"),input.get("new_mobile"),input.get("new_address"));
	}
	@DataProvider
	public Object[][] userCreateData_4() throws IOException {
		List<HashMap<String, String>>value=getJsondata("/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] {{value.get(3)}};
	}
	
	
	
	@Test(dataProvider = "userCreateData_5",groups = "UAT Change")
	public void verifyUserAddWithoutAddress(HashMap<String, String>input) throws InterruptedException {
		HomePage HomePage=LoginPage.login(input.get("email_id"),input.get("password"));
		UserPage UserPage=HomePage.openUsers();
		UserCreatePage CreateUserPage=UserPage.openAddUser();
		CreateUserPage.createUserWithoutAddress(input.get("new_name"),input.get("new_email"),input.get("country"),input.get("new_mobile"));
		CreateUserPage.verifySucessMessage();
	}
	@DataProvider
	public Object[][] userCreateData_5() throws IOException {
		List<HashMap<String, String>>value=getJsondata("/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/UserDetails.json");
		return new Object[][] {{value.get(4)}};
	}
}