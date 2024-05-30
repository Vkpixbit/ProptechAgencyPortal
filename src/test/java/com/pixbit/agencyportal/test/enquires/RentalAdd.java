package com.pixbit.agencyportal.test.enquires;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pixbit.agencyportal.globalfiles.GlobalData;
import com.pixbit.agencyportal.pages.HomePage;
import com.pixbit.agencyportal.pages.RentalAddPage;
import com.pixbit.agencyportal.pages.SecondaryEnqueryPage;

public class RentalAdd extends GlobalData {

	@Test(dataProvider = "rental_contract_data")
	public void secondary_underconstruction(HashMap<String, String> input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		SecondaryEnqueryPage SecondaryEnqueryPage = HomePage.openSecondaryEnquery();
		SecondaryEnqueryPage.openSecRentalEnq();
		SecondaryEnqueryPage.openEnqueryDetailsPage(input.get("enqueried_person"));
		RentalAddPage RentalAddPage = SecondaryEnqueryPage.openAddRental();
		RentalAddPage.uploadEjariTenancy(input.get("ejari_document"), input.get("tenancy_document"));
		RentalAddPage.enterEjariNumber(input.get("ejari_contract_number"));
		RentalAddPage.tenancyContractDate(input.get("tenancy_contract_date"));
		RentalAddPage.ejariRegistrationDate(input.get("ejari_registration_date"));
		RentalAddPage.tenancyContractNumber(input.get("tenancy_contract_number"));

	}

	@DataProvider
	public Object[][] rental_contract_data() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				System.getProperty("user.dir") + "/src/test/java/com/pixbit/agencyportal/enquires/RentalAdd_Data.json");
		return new Object[][] { { value.get(0) } };
	}

}
