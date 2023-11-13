package allproperties;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import AgencyPortal.AllPropertiesPage;
import AgencyPortal.HomePage;
import AgencyPortal.PropertyCreatePage;
import globalfiles.GlobalData;

public class CreateProperty extends GlobalData {

	@Test(dataProvider = "apartmentPropertyData_1")
	public void verifyPropertyAdd_1(HashMap<String, String> input) throws InterruptedException, AWTException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		AllPropertiesPage AllPropertiesPage = HomePage.openAllProperties();
		PropertyCreatePage PropertyCreatePage = AllPropertiesPage.openAddProperty();
		PropertyCreatePage.apartmentPropertyWithReadyStatus(input.get("property_project"), input.get("unit_number"),
				input.get("title"), input.get("description"), input.get("property_category"),
				input.get("age_of_property"), input.get("title_deed_document"), input.get("furnishing_status"),
				input.get("emirate"), input.get("map_search"), input.get("selected_map"), input.get("location"),
				input.get("sub_location"), input.get("bedroom_cabin_count"), input.get("bathroom_count"),
				input.get("kitchen_pantry_count"), input.get("balcony_count"), input.get("parking_count"),
				input.get("trakheesi_number"), input.get("rera_transaction_number"), input.get("builtup_area"),
				input.get("total_area"), input.get("suite_area"), input.get("common_area"), input.get("balcony_area"),
				input.get("amenities_1"), input.get("amenities_2"), input.get("amenities_3"), input.get("amenities_4"),
				input.get("attraction_1"), input.get("attraction_2"), input.get("attraction_3"),
				input.get("price_from"), input.get("price_to"), input.get("listing_price"), input.get("rented_at"),
				input.get("rented_until"), input.get("contract_amount"), input.get("dewa_number"),
				input.get("thumbnail"), input.get("other_images"), input.get("plan_image"), input.get("video_file"),
				input.get("virtual_tour_url"), input.get("video_tour_url"), input.get("youtube_url"),
				input.get("brochure"));
	}

	@DataProvider
	public Object[][] apartmentPropertyData_1() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/ApartmentPropertyDetails.json");
		return new Object[][] { { value.get(0) } };
	}

	@Test(dataProvider = "villaPropertyData_1")
	public void verifyPropertyAdd_2(HashMap<String, String> input) throws InterruptedException, AWTException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		AllPropertiesPage AllPropertiesPage = HomePage.openAllProperties();
		PropertyCreatePage PropertyCreatePage = AllPropertiesPage.openAddProperty();
		PropertyCreatePage.villaPropertyWithReadyStatus(input.get("property_project"), input.get("unit_number"),
				input.get("title"), input.get("description"), input.get("property_category"),
				input.get("age_of_property"), input.get("title_deed_document"), input.get("furnishing_status"),
				input.get("emirate"), input.get("map_search"), input.get("selected_map"), input.get("location"),
				input.get("sub_location"), input.get("bedroom_cabin_count"), input.get("bathroom_count"),
				input.get("kitchen_pantry_count"), input.get("balcony_count"), input.get("parking_count"),
				input.get("trakheesi_number"), input.get("rera_transaction_number"), input.get("builtup_area"),
				input.get("total_area"), input.get("amenities_1"), input.get("amenities_2"), input.get("amenities_3"),
				input.get("amenities_4"), input.get("attraction_1"), input.get("attraction_2"),
				input.get("attraction_3"), input.get("price_from"), input.get("price_to"), input.get("listing_price"),
				input.get("rented_at"), input.get("rented_until"), input.get("contract_amount"),
				input.get("dewa_number"), input.get("thumbnail"), input.get("other_images"), input.get("plan_image"),
				input.get("video_file"), input.get("virtual_tour_url"), input.get("video_tour_url"),
				input.get("youtube_url"), input.get("brochure"));
	}

	@DataProvider
	public Object[][] villaPropertyData_1() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/VillaPropertyDetails.json");
		return new Object[][] { { value.get(0) } };
	}
}
