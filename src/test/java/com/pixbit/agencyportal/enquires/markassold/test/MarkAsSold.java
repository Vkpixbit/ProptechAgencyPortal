package com.pixbit.agencyportal.enquires.markassold.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.pixbit.agencyportal.globalfiles.GlobalData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.pixbit.agencyportal.pages.DeveloperEnqueryPage;
import com.pixbit.agencyportal.pages.HomePage;

public class MarkAsSold extends GlobalData {
	
	@Test(dataProvider = "developer_underconstruction_mark_as_sold")
	public void mark_as_sold_developer_underconstruction(HashMap<String, String>input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		DeveloperEnqueryPage DeveloperEnqueryPage = HomePage.developerEnqueryPage();
		DeveloperEnqueryPage.openEnquiryDetailsPage(input.get("enqueried_person"));
		DeveloperEnqueryPage.changeStatusComplete();
		
	}
	
	@DataProvider
	public Object[][] developer_underconstruction_mark_as_sold() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				System.getProperty("user.dir") + "/src/test/java/com/pixbit/agency/enquery/sold/data/developer_underconstruction.json");
		return new Object[][] { { value.get(0) } };
	}
	
	@Test(enabled = false)
	public void mark_as_sold_developer_ready(HashMap<String, String>input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		DeveloperEnqueryPage DeveloperEnqueryPage = HomePage.developerEnqueryPage();
		DeveloperEnqueryPage.openEnquiryDetailsPage(input.get("enqueried_person"));
		DeveloperEnqueryPage.changeStatusComplete();
	}
	

}
