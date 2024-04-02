package com.pixbit.agencyportal.test.developers.property.add;

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
 
public class CreateProperty extends GlobalData {

	/*
	 * Property Add with Apartment with Ready and enter trakheesi details
	 */
	@Test(dataProvider = "apartment_ready_fill_all_fields_data")
	public void apartment_ready_fill_all_fields(HashMap<String, String> input)
			throws InterruptedException, AWTException {
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
	public Object[][] apartment_ready_fill_all_fields_data() throws IOException {
		List<HashMap<String, String>> value = getJsondata(System.getProperty("user.dir")
				+ "/src/test/java/com/pixbit/agencyportal/developer/property/data/property_data_with_all_fields.json");
		return new Object[][] { { value.get(0) } };
	}

	/*
	 * Adding developer Property with fall required and optional details trakheesi
	 * yes and enter details select Ready and Villa Select rental as Yes add details
	 */
	@Test(dataProvider = "villa_property_ready_with_allfields")
	public void developer_property_adding_with_ready_villa_allfields(HashMap<String, String> input)
			throws InterruptedException, AWTException {
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
		PropertyCreatePage.villa();
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
	public Object[][] villa_property_ready_with_allfields() throws IOException {
		List<HashMap<String, String>> value = getJsondata(System.getProperty("user.dir")
				+ "/src/test/java/com/pixbit/agencyportal/developer/property/data/property_data_with_all_fields.json");
		return new Object[][] { { value.get(1) } };
	}

	/*
	 * office Property with Ready status Enter Trakheesi as Yes and Rental as Yes
	 */
	@Test(dataProvider = "office_property_ready_with_allfields")
	public void developer_property_adding_with_ready_office__allfields(HashMap<String, String> input)
			throws InterruptedException, AWTException {
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
		PropertyCreatePage.office();
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
	public Object[][] office_property_ready_with_allfields() throws IOException {
		List<HashMap<String, String>> value = getJsondata(System.getProperty("user.dir")
				+ "/src/test/java/com/pixbit/agencyportal/developer/property/data/property_data_with_all_fields.json");
		return new Object[][] { { value.get(2) } };
	}

	/*
	 * Service apartment property with underconstruction Select trakheesi Yes and
	 * Rental as Yes,Enter details
	 */
	@Test(dataProvider = "serviceapartment_property_underconstruction_with_allfields")
	public void developer_property_adding_with_underconstruction_serviceapartment_with_allfields(
			HashMap<String, String> input) throws InterruptedException, AWTException {
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
		PropertyCreatePage.underconstruction();
		PropertyCreatePage.serviceApartment();
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
	public Object[][] serviceapartment_property_underconstruction_with_allfields() throws IOException {
		List<HashMap<String, String>> value = getJsondata(System.getProperty("user.dir")
				+ "/src/test/java/com/pixbit/agencyportal/developer/property/data/property_data_with_all_fields.json");
		return new Object[][] { { value.get(3) } };
	}

	/*
	 * Townhouse property with underconstruction Select trakheesi Yes and Rental as
	 * Yes,Enter details
	 */
	@Test(dataProvider = "townhouse_property_underconstruction_with_allfields")
	public void developer_property_adding_with_underconstruction_townhouse_with_allfields(HashMap<String, String> input)
			throws InterruptedException, AWTException {
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
		PropertyCreatePage.underconstruction();
		PropertyCreatePage.townhouse();
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
	public Object[][] townhouse_property_underconstruction_with_allfields() throws IOException {
		List<HashMap<String, String>> value = getJsondata(System.getProperty("user.dir")+
				"/src/test/java/com/pixbit/agencyportal/developer/property/data/property_data_with_all_fields.json");
		return new Object[][] { { value.get(4) } };
	}

	/*
	 * apartment property with underconstruction trakheesi details as no Rental as
	 * No
	 */
	@Test(dataProvider = "apartment_property_underconstruction_without_trakheesi_rental")
	public void developer_property_adding_apartment_underconstruction_without_trakheesi_and_rent_fillotherfields(
			HashMap<String, String> input) throws InterruptedException, AWTException {
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
		PropertyCreatePage.underconstruction();
		PropertyCreatePage.apartment();
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
		PropertyCreatePage.trakheesiNo();
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
		PropertyCreatePage.rentalNo();
		PropertyCreatePage.addFilesApartment(input.get("thumbnail"), input.get("other_images"), input.get("plan_image"),
				input.get("video_file"));
		PropertyCreatePage.enterUrlDetails(input.get("virtual_tour_url"), input.get("video_tour_url"),
				input.get("youtube_url"), input.get("brochure"));
		PropertyCreatePage.saveAndInitateTrakheesi();
		PropertyCreatePage.clickDone();
	}

	@DataProvider
	public Object[][] apartment_property_underconstruction_without_trakheesi_rental() throws IOException {
		List<HashMap<String, String>> value = getJsondata(System.getProperty("user.dir")
				+ "/src/test/java/com/pixbit/agencyportal/developer/property/data/property_add_with_all_data_except_trakheesi_details.json");
		return new Object[][] { { value.get(0) } };
	}

	/*
	 * villa property with underconstruction Trakheesi as No
	 */
	@Test(dataProvider = "villa_property_underconstruction_without_rental_rental")
	public void developer_property_adding_villa_underconstruction_without_trakheesi_otherallfields(
			HashMap<String, String> input) throws InterruptedException, AWTException {
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
		PropertyCreatePage.underconstruction();
		PropertyCreatePage.villa();
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
		PropertyCreatePage.trakheesiNo();
		PropertyCreatePage.builtupArea.sendKeys(input.get("builtup_area_sqft"));
		PropertyCreatePage.totalArea.sendKeys(input.get("total_area_sqft"));
		PropertyCreatePage.selectAmenities(input.get("amenities_1"), input.get("amenities_2"),
				input.get("amenities_3"),input.get("amenities_4"));
		PropertyCreatePage.selectNearByAttractions(input.get("attraction_1"), input.get("attraction_2"),
				input.get("attraction_3"), input.get("attraction_4"));
		PropertyCreatePage.enterPriceDetails(input.get("price_from"), input.get("price_to"),
				input.get("listing_price"));
		PropertyCreatePage.enterMaintenanceFee(input.get("mainteance_fee"));
		PropertyCreatePage.choosePaymentPlan(input.get("payment_plan"));
		PropertyCreatePage.rentalNo();
		PropertyCreatePage.addFilesApartment(input.get("thumbnail"), input.get("other_images"), input.get("plan_image"),
				input.get("video_file"));
		PropertyCreatePage.enterUrlDetails(input.get("virtual_tour_url"), input.get("video_tour_url"),
				input.get("youtube_url"), input.get("brochure"));
		PropertyCreatePage.saveAndInitateTrakheesi();
		PropertyCreatePage.clickDone();
	}

	@DataProvider
	public Object[][] villa_property_underconstruction_without_rental_rental() throws IOException {
		List<HashMap<String, String>> value = getJsondata(System.getProperty("user.dir")
				+ "/src/test/java/com/pixbit/agencyportal/developer/property/data/property_add_with_all_data_except_trakheesi_details.json");
		return new Object[][] { { value.get(1) } };
	}

	/*
	 * Office property with Ready status Trakheesi as No Only Add required fields
	 */
	@Test(dataProvider = "office_property_ready_without_trakheesi")
	public void developer_property_adding_office_ready_without_trakheesi_only_requiredfields(
			HashMap<String, String> input) throws InterruptedException, AWTException {
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
		PropertyCreatePage.office();
		PropertyCreatePage.uploadTitleDeed(input.get("title_deed_document"));
		PropertyCreatePage.selectFurnishingStatus(input.get("furnishing_status"));
		PropertyCreatePage.selectEmirate(input.get("emirate"));
		PropertyCreatePage.selectMapLocation(input.get("map_search"), input.get("selected_map"));
		PropertyCreatePage.selectLocation(input.get("location"));
		PropertyCreatePage.enterBedroomCabinCount(input.get("bedroom_cabin_count"));
		PropertyCreatePage.enterBathroomCount(input.get("bathroom_count"));
		PropertyCreatePage.enterKitchenPantryCount(input.get("kitchen_pantry_count"));
		PropertyCreatePage.enterBalconyCount(input.get("balcony_count"));
		PropertyCreatePage.enterParkingsCount(input.get("parking_count"));
		PropertyCreatePage.trakheesiNo();
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
		// PropertyCreatePage.choosePaymentPlan(input.get("payment_plan"));
		PropertyCreatePage.rentalYesWithOutDewa(input.get("rented_at"), input.get("rented_until"),
				input.get("contract_amount"));
		PropertyCreatePage.addFilesApartment(input.get("thumbnail"), input.get("other_images"), input.get("plan_image"),
				input.get("video_file"));
		// PropertyCreatePage.uploadBrochure(input.get("brochure"));
		PropertyCreatePage.saveAndInitateTrakheesi();
		PropertyCreatePage.clickDone();
	}

	@DataProvider
	public Object[][] office_property_ready_without_trakheesi() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/property_add_with_all_data_except_trakheesi_details.json");
		return new Object[][] { { value.get(2) } };
	}

	/*
	 * property with ready status Add trakheesi details Commerical property Not
	 * furnished Bedroom,Bathroom,Kitchen,balcony - 1
	 */
	@Test(dataProvider = "property_with_ready_commerical_notfurnished")
	public void developer_property_adding_ready_with_trakheesi_and_autofill(HashMap<String, String> input)
			throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		DeveloperListingPage DeveloperListingPage = HomePage.openDeveloperListingPage();
		PropertyCreatePage PropertyCreatePage = DeveloperListingPage.openAddProperty();
		PropertyCreatePage.selectCategory("Commercial");
		PropertyCreatePage.ready();
		PropertyCreatePage.selectFurnishingStatus("Not Furnished");
		PropertyCreatePage.trakheesiYes(input.get("trakheesi_number"), input.get("rera_transaction_number"));
		PropertyCreatePage.clickSave();
		PropertyCreatePage.clickDone();
	}

	@DataProvider
	public Object[][] property_with_ready_commerical_notfurnished() throws IOException {
		List<HashMap<String, String>> value = getJsondata(System.getProperty("user.dir")
				+ "/src/test/java/com/pixbit/agencyportal/developer/property/data/developer_property_with_trakheesi_and_other_autoselecting.json");
		return new Object[][] { { value.get(0) } };
	}

	/*
	 * property with underconstruction Add trakheesi details Residential category
	 * Semi Furnished Update Counts
	 */
	@Test(dataProvider = "property_with_underconstruction_residential_semifurnished")
	public void developer_property_adding_underconstruction_with_trakheesi_and_updatecount_autofill(
			HashMap<String, String> input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		DeveloperListingPage DeveloperListingPage = HomePage.openDeveloperListingPage();
		PropertyCreatePage PropertyCreatePage = DeveloperListingPage.openAddProperty();
		PropertyCreatePage.selectCategory("Residential");
		PropertyCreatePage.underconstruction();
		PropertyCreatePage.selectFurnishingStatus("Semi Furnished");
		PropertyCreatePage.enterBedroomCabinCount(input.get("bedroom_cabin_count"));
		PropertyCreatePage.enterBathroomCount(input.get("bathroom_count"));
		PropertyCreatePage.enterKitchenPantryCount(input.get("kitchen_pantry_count"));
		PropertyCreatePage.enterBalconyCount(input.get("balcony_count"));
		PropertyCreatePage.enterParkingsCount(input.get("parking_count"));
		PropertyCreatePage.trakheesiYes(input.get("trakheesi_number"), input.get("rera_transaction_number"));
		PropertyCreatePage.clickSave();
		PropertyCreatePage.clickDone();
	}

	@DataProvider
	public Object[][] property_with_underconstruction_residential_semifurnished() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/developer_property_with_trakheesi_and_other_autoselecting.json");
		return new Object[][] { { value.get(1) } };
	}

	/*
	 * property with office and ready status and Commercial category White goods
	 * Update all count
	 */
	@Test(dataProvider = "property_with_office_underconstruction_commericial_whitegoods")
	public void developer_property_adding_ready_with_trakheesi(HashMap<String, String> input)
			throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		DeveloperListingPage DeveloperListingPage = HomePage.openDeveloperListingPage();
		PropertyCreatePage PropertyCreatePage = DeveloperListingPage.openAddProperty();
		PropertyCreatePage.selectCategory("Commercial");
		PropertyCreatePage.underconstruction();
		PropertyCreatePage.selectFurnishingStatus("White Goods");
		PropertyCreatePage.office();
		PropertyCreatePage.enterBedroomCabinCount(input.get("bedroom_cabin_count"));
		PropertyCreatePage.enterBathroomCount(input.get("bathroom_count"));
		PropertyCreatePage.enterKitchenPantryCount(input.get("kitchen_pantry_count"));
		PropertyCreatePage.enterBalconyCount(input.get("balcony_count"));
		PropertyCreatePage.enterParkingsCount(input.get("parking_count"));
		PropertyCreatePage.trakheesiYes(input.get("trakheesi_number"), input.get("rera_transaction_number"));
		PropertyCreatePage.clickSave();
		PropertyCreatePage.clickDone();
	}

	@DataProvider
	public Object[][] property_with_office_underconstruction_commericial_whitegoods() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/developer_property_with_trakheesi_and_other_autoselecting.json");
		return new Object[][] { { value.get(2) } };
	}

	/*
	 * developer property with out trakheesi and other auto selected fields office
	 * property underconstruction status
	 */
	@Test(dataProvider = "property_add_without_trakheesi_office")
	public void developer_property_adding_office_without_trakheesi_and_autofill_data(HashMap<String, String> input)
			throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		DeveloperListingPage DeveloperListingPage = HomePage.openDeveloperListingPage();
		PropertyCreatePage PropertyCreatePage = DeveloperListingPage.openAddProperty();
		PropertyCreatePage.selectCategory(input.get("property_category"));
		PropertyCreatePage.underconstruction();
		PropertyCreatePage.selectFurnishingStatus(input.get("furnishing_status"));
		PropertyCreatePage.office();
		PropertyCreatePage.trakheesiNo();
		PropertyCreatePage.saveAndInitateTrakheesi();
		PropertyCreatePage.clickDone();
	}

	@DataProvider
	public Object[][] property_add_without_trakheesi_office() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/property_data_with_autoselected_fields_trakheesi_no.json");
		return new Object[][] { { value.get(0) } };
	}

	/*
	 * developer property with out trakheesi and other auto selected fields villa
	 * property ready status
	 */
	@Test
	public void developer_property_adding_villa_without_trakheesi(HashMap<String, String> input)
			throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		DeveloperListingPage DeveloperListingPage = HomePage.openDeveloperListingPage();
		PropertyCreatePage PropertyCreatePage = DeveloperListingPage.openAddProperty();
		PropertyCreatePage.selectCategory(input.get("property_category"));
		PropertyCreatePage.ready();
		PropertyCreatePage.selectFurnishingStatus(input.get("furnishing_status"));
		PropertyCreatePage.villa();
		PropertyCreatePage.trakheesiNo();
		PropertyCreatePage.saveAndInitateTrakheesi();
		PropertyCreatePage.clickDone();
	}

	@DataProvider
	public Object[][] property_add_without_trakheesi_villa() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/property_data_with_autoselected_fields_trakheesi_no.json");
		return new Object[][] { { value.get(1) } };
	}
	


}
