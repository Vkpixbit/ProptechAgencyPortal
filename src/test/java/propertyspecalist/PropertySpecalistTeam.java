package propertyspecalist;

import org.testng.annotations.Test;

import globalfiles.GlobalData;
import pages.HomePage;

public class PropertySpecalistTeam  extends GlobalData {

	@Test
	public void openPropertySpecalistTeamPage() throws InterruptedException {
		HomePage HomePage=LoginPage.login("vishnudas@pixbitsolutions.com","Prosper@1lE6w");
		HomePage.PropertySpecalistPage();
	}
}
