package com.pixbit.agencyportal.propertyspecialist.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.pixbit.agencyportal.globalfiles.GlobalData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pixbit.agencyportal.pages.HomePage;
import com.pixbit.agencyportal.pages.PropertySpecalistCreationPage;
import com.pixbit.agencyportal.pages.PropertySpecalistPage;

public class PropertySpecalistCreation extends GlobalData {
	
	
	
	@BeforeMethod
	public void openPropertySpecalistPage() throws InterruptedException {
		//LoginPage LoginPage= new LoginPage(driver);
		HomePage HomePage=LoginPage.login("vishnudas@pixbitsolutions.com","Qapixbit@14");
		HomePage.openPropertySpecalistPage();
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
		List<HashMap<String, String>> value = getJsondata(System.getProperty("user.dir")+
				"/src/test/java/com/pixbit/agencyportal/ps/data/ps_creation_required_field.json");
		return new Object[][] {{value.get(0)},{value.get(1)},{value.get(2)},{value.get(3)}};
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