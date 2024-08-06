package com.pixbit.agencyportal.developer.property.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.pixbit.agencyportal.globalfiles.GlobalData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pixbit.agencyportal.pages.DeveloperListingPage;
import com.pixbit.agencyportal.pages.HomePage;

public class PropertyDetailVerification extends GlobalData {

	@Test(dataProvider = "verification_property")
	public void verify_property_details(HashMap<String, String> input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		DeveloperListingPage DeveloperListingPage = HomePage.openDeveloperListingPage();
		//PropertyDetailsPage PropertyDetailsPage = DeveloperListingPage.openPropertiesFromDraft();
		//PropertyDetailsPage.verify_project_name(input.get("property_project"));
	}

	@DataProvider
	public Object[][] verification_property() throws IOException {
		List<HashMap<String, String>> value = getJsondata(System.getProperty("user.dir")
				+ "/src/test/java/com/pixbit/agencyportal/developer/property/data/property_data_with_all_fields.json");
		return new Object[][] {{value.get(0)}};
	}
}
