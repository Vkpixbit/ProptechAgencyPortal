package com.pixbit.agencyportal.smoketesting;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pixbit.agencyportal.globalfiles.GlobalData;
import com.pixbit.agencyportal.pages.DeveloperListingPage;
import com.pixbit.agencyportal.pages.HomePage;
import com.pixbit.agencyportal.pages.PropertyCreatePage;
import com.pixbit.agencyportal.pages.PropertyDetailsPage;

public class SmokeTestingCases extends GlobalData {
	
	/*
	 * When add developer property add with All details without trakheesi
	 * Then property added user change sub status of draft
	 * Then property added user sent that property to trakheesi
	 * Then trakheesi user change trakheesi to initited 
	 * then trakheesi user change that property to trakheesi approved
	 * then property user admin sent property super admin approval
	 * then user admin change substatus of prosper approval
	 * then super admin sent property to prosper admin approval
	 * then prosper admin publish that property
	 */
	
	@Test(enabled = false)
	public void add_property(HashMap<String, String>input) throws InterruptedException, AWTException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		DeveloperListingPage DeveloperListingPage = HomePage.openDeveloperListingPage();
		PropertyCreatePage PropertyCreatePage = DeveloperListingPage.openAddProperty();
		PropertyCreatePage.selectProject(input.get("property_project"));
		PropertyCreatePage.selectPhase(input.get("property_phase"));
		PropertyCreatePage.enterNumberOfUnit(input.get("unit_number"));
		PropertyCreatePage.selectPropertySpecalist(input.get("ps_team_name"));
		PropertyCreatePage.enterPropertyTitle(input.get("title"));
		PropertyCreatePage.updatePropertyDescription(input.get("description"));
		PropertyCreatePage.selectCategory(input.get("property_category"));
		PropertyCreatePage.ready();
		PropertyCreatePage.apartment();
		PropertyCreatePage.ageOfPropertyEnter(input.get("age_of_property"));
		PropertyCreatePage.uploadTitleDeed(input.get("title_deed_document"));
		PropertyCreatePage.selectFurnishingStatus(input.get("furnishing_status"));
		PropertyCreatePage.selectEmirate(input.get("emirate"));
		PropertyCreatePage.selectMapLocation(input.get("map_search"), input.get("selected_map"));
		PropertyCreatePage.selectLocation(input.get("location"));
		PropertyCreatePage.selectSubLocation(input.get("sub_location"));
		PropertyCreatePage.enterBedroomCabinCount(input.get("bedroom_cabin_count"));
		PropertyCreatePage.enterBathroomCount(input.get("bathroom_count"));
		PropertyCreatePage.enterKitchenPantryCount(input.get("kitchen_pantry_count"));
		PropertyCreatePage.enterBalconyCount(input.get("balcony_count"));
		PropertyCreatePage.enterParkingsCount(input.get("parking_count"));
		PropertyCreatePage.trakheesiYes(input.get("trakheesi_number"), input.get("rera_transaction_number"));
		PropertyCreatePage.builtupArea.sendKeys(input.get("builtup_area_sqft"));
		PropertyCreatePage.totalArea.sendKeys(input.get("total_area_sqft"));
		PropertyCreatePage.suiteAreaField.sendKeys(input.get("suite_area_sqm"));
		PropertyCreatePage.commonAreaField.sendKeys(input.get("common_area_sqm"));
		PropertyCreatePage.balconyAreaField.sendKeys(input.get("balcony_area_sqm"));
		PropertyCreatePage.selectAmenities(input.get("amenities_1"), input.get("amenities_2"),
				input.get("amenities_3"),input.get("amenities_4"));
		PropertyCreatePage.selectNearByAttractions(input.get("attraction_1"), input.get("attraction_2"),
				input.get("attraction_3"), input.get("attraction_4"));
		PropertyCreatePage.enterPriceDetails(input.get("price_from"), input.get("price_to"),
				input.get("listing_price"));
		PropertyCreatePage.enterMaintenanceFee(input.get("mainteance_fee"));
		PropertyCreatePage.choosePaymentPlan(input.get("payment_plan"));
		PropertyCreatePage.rentalYesWithDewa(input.get("rented_at"), input.get("rented_until"),
				input.get("contract_amount"), input.get("dewa_number"));
		PropertyCreatePage.addFilesApartment(input.get("thumbnail"), input.get("other_images"), input.get("plan_image"),
				input.get("video_file"));
		PropertyCreatePage.enterUrlDetails(input.get("virtual_tour_url"), input.get("video_tour_url"),
				input.get("youtube_url"), input.get("brochure"));
		PropertyCreatePage.clickSave();
		PropertyCreatePage.clickDone();
	}
	
	@DataProvider
	public Object[][]  property_add_data() throws IOException {
		List<HashMap<String, String>> value = getJsondata(System.getProperty("user.dir")
				+ "/src/test/java/com/pixbit/agencyportal/smoketesting/SmokeTestingData.json");
		return new Object[][] { { value.get(0) } };
	}
	
	
	@Test(dataProvider = "change_property_sub_status")
	public void change_sub_status_property(HashMap<String, String>input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		DeveloperListingPage DeveloperListingPage = HomePage.openDeveloperListingPage();
		PropertyDetailsPage PropertyDetailsPage =DeveloperListingPage.openPropertyDetails();
		PropertyDetailsPage.change_status(input.get("sub_status_1"),input.get("sub_status_2"));
		
	}
	
	@DataProvider
	public Object[][] change_property_sub_status() throws IOException {
		List<HashMap<String, String>> value = getJsondata(System.getProperty("user.dir")
				+ "/src/test/java/com/pixbit/agencyportal/smoketesting/SmokeTestingData.json");
		return new Object[][] { { value.get(1) } };
	}
	
	@Test
	public void property_sent_trakheesi(HashMap<String, String>input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		DeveloperListingPage DeveloperListingPage = HomePage.openDeveloperListingPage();
		PropertyDetailsPage PropertyDetailsPage =DeveloperListingPage.openPropertyDetails();
	}
}
