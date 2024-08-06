package com.pixbit.agencyportal.developer.property.test;

import com.pixbit.agencyportal.globalfiles.GlobalData;
import com.pixbit.agencyportal.pages.PropertyPageValidations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.pixbit.agencyportal.pages.DeveloperListingPage;
import com.pixbit.agencyportal.pages.HomePage;


public class TestPropertyAddValidations extends GlobalData {

	PropertyPageValidations propertypagevalidations;

	@BeforeMethod
	public void openPropertyAddPage() throws InterruptedException {
		HomePage HomePage = LoginPage.login("sarath@pixbitsolutions.com","Prosper@1gxKW");
		DeveloperListingPage developerlistingpage = HomePage.openAllProperties();
		propertypagevalidations=developerlistingpage.openAddPropertyValidations();
	}
	
	@Test
	public void verifyProjectFieldErrorMessage() throws InterruptedException {
		// propertypagevalidations=new PropertyPageValidations(driver);
		propertypagevalidations.verifyProjectError();
	}
}
