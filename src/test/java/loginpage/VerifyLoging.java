package loginpage;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;

import globalfiles.GlobalData;
import pages.HomePage;

public class VerifyLoging extends GlobalData {

	@Test(dataProvider = "validEmailPassword")
	public void login_with_valid_email_password(HashMap<String, String> input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		Thread.sleep(2000);
		HomePage.loginVerification();
	}

	@DataProvider
	public Object[][] validEmailPassword() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/LoginDetails.json");
		return new Object[][] { { value.get(0) } };
	}

	@Test(dataProvider = "validEmailInvalidPassword")
	public void login_with_valid_email_invalid_password(HashMap<String, String> input) throws InterruptedException {
		LoginPage.login(input.get("email_id"), input.get("password"));
		Thread.sleep(2000);
		LoginPage.passwordErrorMessage();
	}

	@DataProvider
	public Object[][] validEmailInvalidPassword() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/LoginDetails.json");
		return new Object[][] { { value.get(1) } };
	}

	@Test(dataProvider = "invalidEmailValidPassword")
	public void login_with_invalid_email_valid_password(HashMap<String, String> input) throws InterruptedException {
		LoginPage.login(input.get("email_id"), input.get("password"));
		Thread.sleep(2000);
		LoginPage.emailErrorMessage();
	}

	@DataProvider
	public Object[][] invalidEmailValidPassword() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/LoginDetails.json");
		return new Object[][] { { value.get(2) } };
	}

}
