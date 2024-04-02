package com.pixbit.agencyportal.test.developers.property.add;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pixbit.agencyportal.globalfiles.GlobalData;
import com.pixbit.agencyportal.pages.DeveloperListingPage;
import com.pixbit.agencyportal.pages.HomePage;
import com.pixbit.agencyportal.pages.PropertyPageValidations;

public class PropertyAddValidations extends GlobalData {

	@BeforeMethod
	public void openPropertyAddPage() throws InterruptedException {
		HomePage HomePage = LoginPage.login("sarath@pixbitsolutions.com","Prosper@1gxKW");
		DeveloperListingPage AllPropertiesPage = HomePage.openAllProperties();
		PropertyPageValidations PropertyPageValidations=AllPropertiesPage.openAddPropertyValidations();
	}
	
	@Test
	public void verifyProjectFieldErrorMessage() throws InterruptedException {
		PropertyPageValidations PropertyPageValidations=new PropertyPageValidations(driver);
		PropertyPageValidations.verifyProjectError();
	}
}
