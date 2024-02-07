package developers;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import AgencyPortal.DeveloperListingPage;
import AgencyPortal.HomePage;
import AgencyPortal.PropertyPageValidations;
import globalfiles.GlobalData;

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
