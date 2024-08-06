package com.pixbit.agencyportal.propertyspecialist.test;

import com.pixbit.agencyportal.globalfiles.GlobalData;
import org.testng.annotations.Test;

import com.pixbit.agencyportal.pages.HomePage;

public class PropertySpecalistTeam  extends GlobalData {

	@Test
	public void openPropertySpecalistTeamPage() throws InterruptedException {
		HomePage HomePage=LoginPage.login("vishnudas@pixbitsolutions.com","Prosper@1lE6w");
		//HomePage.PropertySpecalistPage();
	}
}
