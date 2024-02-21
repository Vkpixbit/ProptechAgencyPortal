package propertyspecalist;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import globalfiles.GlobalData;
import pages.HomePage;
import pages.PropertySpecalistCreationPage;
import pages.PropertySpecalistPage;

public class PropertySpecalistCreation extends GlobalData {

	
	@BeforeClass
	public void openPropertySpecalistPage() throws InterruptedException {
		HomePage HomePage=LoginPage.login("vishnudas@pixbitsolutions.com","Prosper@1lE6w");
		HomePage.PropertySpecalistPage();
	}
	
	
	
	@Test(dataProvider = "ps_creation_required_only_1",enabled = true)
	public void create_property_specalist_required_only(HashMap<String, String>input) throws InterruptedException {
		PropertySpecalistPage PropertySpecalistPage = new PropertySpecalistPage(driver);
		PropertySpecalistCreationPage PropertySpecalistCreationPage =PropertySpecalistPage.openPropertySpecalistCreationPage();
		PropertySpecalistCreationPage.psName.sendKeys(input.get("ps_name"));
		PropertySpecalistCreationPage.psEmail.sendKeys(input.get("ps_email"));
		PropertySpecalistCreationPage.psMobile.sendKeys(input.get("ps_mobile"));
		PropertySpecalistCreationPage.selectStatus(input.get("ps_status"));
		PropertySpecalistCreationPage.saveAndSendPassword();
	}
	
	@DataProvider
	public Object[][] ps_creation_required_only_1() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/ps_creation_data/ps_creation_required_field.json");
		return new Object[][] {{value.get(2)}};
	}
	
	
	
	
	
	
	@Test(dataProvider = "ps_creation_with_all_details_1",enabled = false)
	public void create_property_specalist_with_all_details_1(HashMap<String, String>input) throws InterruptedException {
		PropertySpecalistPage PropertySpecalistPage = new PropertySpecalistPage(driver);
		PropertySpecalistCreationPage PropertySpecalistCreationPage =PropertySpecalistPage.openPropertySpecalistCreationPage();
		PropertySpecalistCreationPage.uploadImage(input.get("ps_profile_photo"));
		PropertySpecalistCreationPage.psName.sendKeys(input.get("ps_name"));
		PropertySpecalistCreationPage.psEmail.sendKeys(input.get("ps_email"));
		PropertySpecalistCreationPage.psMobile.sendKeys(input.get("ps_mobile"));
		PropertySpecalistCreationPage.selectStatus(input.get("ps_status"));
		PropertySpecalistCreationPage.psAddress.sendKeys(input.get("ps_address"));
		PropertySpecalistCreationPage.uploadBrokerCardImage(input.get("broker_card_image"));
		PropertySpecalistCreationPage.saveAndSendPassword();
		
	}
	
	@DataProvider
	public Object[][] ps_creation_with_all_details_1() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/ps_creation_data/ps_creation_required_field.json");
		return new Object[][] { { value.get(0) } };
	}
	
	
	
	
	
}