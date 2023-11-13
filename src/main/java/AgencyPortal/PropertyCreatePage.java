package AgencyPortal;

import java.awt.AWTException;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusefiles.Components;

public class PropertyCreatePage extends Components {

	WebDriver driver;

	public PropertyCreatePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='project_id']")
	WebElement projectDropdown;

	@FindBy(xpath = "//div[@id='phase_id']")
	WebElement phaseDropdown;

	@FindBy(xpath = "//div[@id='property_type_id']")
	WebElement propertyTypeDropdwon;

	@FindBy(xpath = "//input[@id='number_of_unit']")
	WebElement unitNumberField;

	@FindBy(xpath = "//input[@id='title']")
	WebElement titleField;

	@FindBy(xpath = "//textarea[@id='description']")
	WebElement descriptionField;

	@FindBy(xpath = "//input[@name='property_category_type']")
	List<WebElement> propertyCategories;

	@FindBy(id = "ageOfProperty")
	WebElement ageOfProperty;

	@FindBy(id = "titleDeedUpload")
	WebElement titleDeedField;

	@FindBy(xpath = "//div[@id='emirateId']")
	WebElement emirateDropdown;

	@FindBy(xpath = "//button[text()='Mark on maps']")
	WebElement mapOpenClick;

	@FindBy(xpath = "//input[@class='form-control flex-1']")
	WebElement mapSearchField;

	@FindBy(xpath = "//div[@id='locationId']")
	WebElement locationDropdown;

	@FindBy(xpath = "//div[@id='subLocationId']")
	WebElement subLocationDropdown;

	@FindBy(xpath = "(//button[text()='5+'])[1]")
	WebElement bedroomCabinManualButton;

	@FindBy(id = "bedrooms")
	WebElement bedroomCabinManualField;

	@FindBy(xpath = "(//button[text()='5+'])[2]")
	WebElement bathroomManualButton;

	@FindBy(id = "bathrooms")
	WebElement bathroomManualField;

	@FindBy(xpath = "(//button[text()='5+'])[3]")
	WebElement kitchenPantryManualButton;

	@FindBy(id = "kitchens")
	WebElement kitchenPantryManualField;

	@FindBy(xpath = "(//button[text()='5+'])[4]")
	WebElement balconyManualButton;

	@FindBy(id = "balconies")
	WebElement balconyManualField;

	@FindBy(xpath = "(//button[text()='5+'])[5]")
	WebElement parkingManualButton;

	@FindBy(id = "parkings")
	WebElement parkingManualField;

	@FindBy(id = "terkeeziNumber")
	WebElement trakheesiNumberField;

	@FindBy(id = "reraTransactionNumber")
	WebElement reraNumberField;

	@FindBy(id = "buildUpArea")
	WebElement builtupArea;

	@FindBy(id = "totalArea")
	WebElement totalArea;

	@FindBy(id = "suitArea")
	WebElement suiteAreaField;

	@FindBy(id = "commonArea")
	WebElement commonAreaField;

	@FindBy(id = "balconyArea")
	WebElement balconyAreaField;

	@FindBy(xpath = "//label[text()='Trakheesi*']")
	WebElement trakheesiHeading;

	@FindBy(id = "virtualTourUrl")
	WebElement virtualtourUrlField;

	@FindBy(id = "videoTourUrl")
	WebElement videtourUrlField;

	@FindBy(id = "youtubeVideoUrl")
	WebElement youtubeUrlField;

	@FindBy(xpath = "(//button[text()='5+'])[3]")
	WebElement kitchen_pantry_click;

	@FindBy(id = "priceFrom")
	WebElement priceFrom;

	@FindBy(id = "priceTo")
	WebElement priceTo;

	@FindBy(id = "listingPrice")
	WebElement listingPrice;

	@FindBy(xpath = "//button[text()='  Choose Payment Plan']")
	WebElement paymentPlanButton;

	@FindBy(xpath = "//h2[@class='accordion-header']")
	List<WebElement> paymentPlanList;

	@FindBy(id = "thumbnail")
	WebElement thumbnailUpload;

	@FindBy(id = "images")
	WebElement addMoreImages;

	@FindBy(id = "addFloorImage")
	WebElement planImageField;

	@FindBy(id = "video")
	WebElement videoUpload;

	@FindBy(id = "yes_teneted")
	WebElement rentYes;

	@FindBy(id = "rentedAt")
	WebElement rentedAtField;

	@FindBy(id = "rentedUntill")
	WebElement rentedUntilField;

	@FindBy(id = "rentalContractAmount")
	WebElement contractAmount;

	@FindBy(id = "dewaPremiseNumber")
	WebElement dewaNumberField;

	@FindBy(id = "brochure")
	WebElement brochureUpload;

	// Select the project from dropdown
	public void selectProject(String property_project) throws InterruptedException {
		projectDropdown.click();
		Thread.sleep(2000);
		WebElement requiredProject = driver.findElement(By.xpath("//div[text()='" + property_project + "']"));
		requiredProject.click();

	}

	// select the phase from dropdown
	/*
	 * public void selectPhase(String property_phase) throws InterruptedException {
	 * phaseDropdown.click(); Thread.sleep(2000); WebElement requiredPhase =
	 * driver.findElement(By.xpath("//div[text()='" + property_phase + "']"));
	 * requiredPhase.click(); }
	 */

	// Select Category Residential,Commerical
	public void selectCategory(String property_category) {
		WebElement requiredCategory = driver.findElement(
				By.xpath("//label[@class='form-check-label' and contains(text(),'" + property_category + "')]"));
		requiredCategory.click();
	}

	public void ready() {
		driver.findElement(By.xpath("//label[@class='form-check-label' and contains(text(),'Ready')]")).click();
	}

	public void underconstruction() {
		driver.findElement(By.xpath("//label[@class='form-check-label' and contains(text(),'Under Construction')]"))
				.click();
	}

	// Select Apartment
	public void apartment() throws InterruptedException {
		propertyTypeDropdwon.click();
		Thread.sleep(2000);
		WebElement requiredPropertyType = driver.findElement(By.xpath("//div[text()='Apartment']"));
		requiredPropertyType.click();
	}

	// Select Townhouse
	public void townhouse() throws InterruptedException {
		propertyTypeDropdwon.click();
		Thread.sleep(2000);
		WebElement requiredPropertyType = driver.findElement(By.xpath("//div[text()='Townhouse']"));
		requiredPropertyType.click();
	}

	// Select Villa
	public void villa() throws InterruptedException {
		propertyTypeDropdwon.click();
		Thread.sleep(2000);
		WebElement requiredPropertyType = driver.findElement(By.xpath("//div[text()='Villa']"));
		requiredPropertyType.click();
	}

	// Select Office
	public void office() throws InterruptedException {
		propertyTypeDropdwon.click();
		Thread.sleep(2000);
		WebElement requiredPropertyType = driver.findElement(By.xpath("//div[text()='office']"));
		requiredPropertyType.click();
	}

	// Select service apartment
	public void serviceApartment() throws InterruptedException {
		propertyTypeDropdwon.click();
		Thread.sleep(2000);
		WebElement requiredPropertyType = driver.findElement(By.xpath("//div[text()='Service Apartment']"));
		requiredPropertyType.click();
	}

	// Enter age of property
	public void ageOfPropertyEnter(String age_of_property) {
		ageOfProperty.sendKeys(age_of_property);
	}

	// select the Emirate
	public void selectEmirate(String emirate) throws InterruptedException {
		emirateDropdown.click();
		Thread.sleep(2000);
		WebElement requiredDropdown = driver.findElement(By.xpath("//div[text()='" + emirate + "']"));
		requiredDropdown.click();
	}

	// Upload title deed document
	public void uploadTitleDeed(String title_deed_document) throws AWTException {
		titleDeedField.sendKeys("/Users/vk14/Downloads/" + title_deed_document);

	}

	// select the furnishing status
	public void selectFurnishingStatus(String furnishing_status) {
		WebElement requiredFurnishingStatus = driver.findElement(
				By.xpath("//label[@class='form-check-label' and contains(text(),'" + furnishing_status + "')]"));
		requiredFurnishingStatus.click();
	}

	// Select google map location
	public void selectMapLocation(String map_search, String selected_map) throws InterruptedException {
		mapOpenClick.click();
		Thread.sleep(2000);
		mapSearchField.sendKeys(map_search);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + selected_map + "']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	// select the location
	public void selectLocation(String location) throws InterruptedException {
		locationDropdown.click();
		Thread.sleep(2000);
		WebElement requiredLocation = driver.findElement(By.xpath("//div[text()='" + location + "']"));
		requiredLocation.click();
	}

	// Select the sub location
	public void selectSubLocation(String sub_location) throws InterruptedException {
		subLocationDropdown.click();
		Thread.sleep(2000);
		WebElement requiredSubLocation = driver.findElement(By.xpath("//div[text()='" + sub_location + "']"));
		requiredSubLocation.click();
	}

	// Enter bedroom count
	public void enterBedroomCabinCount(String bedroom_cabin_count) throws InterruptedException {
		Thread.sleep(2000);
		bedroomCabinManualButton.click();
		Thread.sleep(2000);
		bedroomCabinManualField.clear();
		Thread.sleep(2000);
		bedroomCabinManualField.sendKeys(bedroom_cabin_count);
	}

	// Enter Bathroom count
	public void enterBathroomCount(String bathroom_count) throws InterruptedException {
		Thread.sleep(2000);
		bathroomManualButton.click();
		Thread.sleep(2000);
		bathroomManualField.clear();
		Thread.sleep(2000);
		bathroomManualField.sendKeys(bathroom_count);
	}

	// Enter kitchen count
	public void enterKitchenPantryCount(String kitchen_pantry_count) throws InterruptedException {
		Thread.sleep(2000);
		kitchenPantryManualButton.click();
		Thread.sleep(2000);
		kitchenPantryManualField.clear();
		Thread.sleep(2000);
		kitchenPantryManualField.sendKeys(kitchen_pantry_count);
	}

	// Enter Balcony count
	public void enterBalconyCount(String balcony_count) throws InterruptedException {
		Thread.sleep(2000);
		balconyManualButton.click();
		Thread.sleep(2000);
		balconyManualField.clear();
		Thread.sleep(2000);
		balconyManualField.sendKeys(balcony_count);
	}

	// Enter Parking count
	public void enterParkingsCount(String parking_count) throws InterruptedException {
		Thread.sleep(2000);
		parkingManualButton.click();
		Thread.sleep(2000);
		parkingManualField.clear();
		Thread.sleep(2000);
		parkingManualField.sendKeys(parking_count);
	}

	// Select trakheesi status as "Yes"
	public void trakheesiYes(String trakheesi_number, String rera_transaction_number) throws InterruptedException {
		WebElement trakheesiStatusField = driver
				.findElement(By.xpath("//label[text()='Yes']/preceding-sibling::input"));
		trakheesiStatusField.click();
		trakheesiNumberField.sendKeys(trakheesi_number);
		reraNumberField.sendKeys(rera_transaction_number);
	}

	// Select trakheesi status as "No"
	public void trakheesiNo() throws InterruptedException {
		WebElement trakheesiStatusField = driver.findElement(By.xpath("//label[text()='No']/preceding-sibling::input"));
		trakheesiStatusField.click();
	}

	// Checking property type condtion and enter value in suite area,common area and
	// balcony area
	/*
	 * public void enterSuiteCommonBalconyArea(String property_type, String
	 * suite_area, String common_area, String balcony_area) { if
	 * ("Apartment".equalsIgnoreCase(property_type) ||
	 * "Office".equalsIgnoreCase(property_type) ||
	 * "Service Apartment".equalsIgnoreCase(property_type)) {
	 * suiteAreaField.sendKeys(suite_area); commonAreaField.sendKeys(common_area);
	 * balconyAreaField.sendKeys(balcony_area); } }
	 */

	// Select amenities
	public void selectAmenities(String amenities_1, String amenities_2, String amenities_3)
			throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Choose Amenities']")).click();
		List<WebElement> amenitiesButtons = driver.findElements(By.xpath("//button[@class='ms-2 mt-3 btn border ']"));
		List<String> targetAmenitiesTexts = Arrays.asList(amenities_1, amenities_2, amenities_3);

		for (String targetButtonText : targetAmenitiesTexts) {
			for (WebElement button1 : amenitiesButtons) {
				if (button1.getText().equals(targetButtonText)) {
					Thread.sleep(2000);
					button1.click();
				}
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	// Select near by attractions
	public void selectNearByAttractions(String attraction_1, String attraction_2, String attraction_3)
			throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Add Nearby Attractions']")).click();
		List<WebElement> nearByAttractionList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		List<String> targetAttractionText = Arrays.asList(attraction_1, attraction_2, attraction_3);

		for (String targetButtonText : targetAttractionText) {
			for (WebElement button2 : nearByAttractionList) {
				if (button2.getAttribute("name").equalsIgnoreCase(targetButtonText)) {
					Thread.sleep(2000);
					button2.click();
				}
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	// Enter Price Details
	public void enterPriceDetails(String price_from, String price_to, String listing_price)
			throws InterruptedException {
		// scrollToElement(paymentPlanButton);
		Thread.sleep(2000);
		priceFrom.sendKeys(price_from);
		priceTo.sendKeys(price_to);
		listingPrice.sendKeys(listing_price);
		Thread.sleep(2000);
	}

	// Choosing Payment Plans
	public void choosePaymentPlan(String payment_plan) throws InterruptedException {
		visbilityOfElement(paymentPlanButton);
		paymentPlanButton.click();
		Thread.sleep(2000);
		WebElement selectedPaymentPlan = driver.findElement(By.xpath("//button[contains(.,'" + payment_plan + "')]"));
		selectedPaymentPlan.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='3'])[1]")).click();
		clickDone();
	}

	// Add rental Details as "Yes" with "Dewa Number"
	public void rentalYesWithDewa(String rented_at, String rented_until, String contract_amount, String dewa_number)
			throws InterruptedException {
		WebElement selectedRentalStatus = driver
				.findElement(By.xpath("//label[@class='form-check-label' and contains(text(),'Yes')]"));
		visbilityOfElement(selectedRentalStatus);
		selectedRentalStatus.click();
		Thread.sleep(2000);
		rentedAtField.sendKeys(rented_at);
		rentedUntilField.sendKeys(rented_until);
		contractAmount.sendKeys(contract_amount);
		dewaNumberField.sendKeys(dewa_number);
	}

	// Add rental Details as "Yes" with "Dewa Number"
	public void rentalYesWithOutDewa(String rented_at, String rented_until, String contract_amount)
			throws InterruptedException {
		WebElement selectedRentalStatus = driver
				.findElement(By.xpath("//label[@class='form-check-label' and contains(text(),'Yes')]"));
		visbilityOfElement(selectedRentalStatus);
		selectedRentalStatus.click();
		Thread.sleep(2000);
		rentedAtField.sendKeys(rented_at);
		rentedUntilField.sendKeys(rented_until);
		contractAmount.sendKeys(contract_amount);
	}

	// Add rental Details as "No"
	public void rentalNo() throws InterruptedException {
		WebElement selectedRentalStatus = driver
				.findElement(By.xpath("//label[@class='form-check-label' and contains(text(),'No')]"));
		visbilityOfElement(selectedRentalStatus);
		selectedRentalStatus.click();
	}

	// Upload files for apartment
	public void addFilesApartment(String thumbnail, String other_images, String plan_image, String video_file) {
		thumbnailUpload.sendKeys("/Users/vk14/Downloads/property_images/apartment/" + thumbnail);
		addMoreImages.sendKeys("/Users/vk14/Downloads/property_images/other images/" + other_images);
		planImageField.sendKeys("/Users/vk14/Downloads/property_images/plan/" + plan_image);
		videoUpload.sendKeys("/Users/vk14/Downloads/" + video_file);
	}
	
	// Upload files for apartment
		public void addFilesVilla(String thumbnail, String other_images, String plan_image, String video_file) {
			thumbnailUpload.sendKeys("/Users/vk14/Downloads/property_images/villa/" + thumbnail);
			addMoreImages.sendKeys("/Users/vk14/Downloads/property_images/other images/" + other_images);
			planImageField.sendKeys("/Users/vk14/Downloads/property_images/plan/" + plan_image);
			videoUpload.sendKeys("/Users/vk14/Downloads/" + video_file);
		}
		

	// Enter URL details
	public void enterUrlDetails(String virtual_tour_url, String video_tour_url, String youtube_url, String brochure) {
		virtualtourUrlField.sendKeys(virtual_tour_url);
		videtourUrlField.sendKeys(video_tour_url);
		youtubeUrlField.sendKeys(youtube_url);
		brochureUpload.sendKeys("/Users/vk14/Downloads/" + brochure);
	}

	// Add property with "Ready" property status,"apartment" property type and add
	// sublocation and add video file , enter all URL's
	// we select project with one phase no payment plans
	// Trakheesi selected as "Yes" and Rental selected as "Yes" and Dewa
	public void apartmentPropertyWithReadyStatus(String property_project, String unit_number, String title,
			String description, String property_category, String age_of_property, String title_deed_document,
			String furnishing_status, String emirate, String map_search, String selected_map, String location,
			String sub_location, String bedroom_cabin_count, String bathroom_count, String kitchen_pantry_count,
			String balcony_count, String parking_count, String trakheesi_number, String rera_transaction_number,
			String builtup_area, String total_area, String suite_area, String common_area, String balcony_area,
			String amenities_1, String amenities_2, String amenities_3, String amenities_4, String attraction_1,
			String attraction_2, String attraction_3, String price_from, String price_to, String listing_price,
			String rented_at, String rented_until, String contract_amount, String dewa_number, String thumbnail,
			String other_images, String plan_image, String video_file, String virtual_tour_url, String video_tour_url,
			String youtube_url, String brochure) throws InterruptedException, AWTException {
		selectProject(property_project);
		unitNumberField.sendKeys(unit_number);
		titleField.sendKeys(title);
		descriptionField.sendKeys(description);
		selectCategory(property_category);
		ready();
		apartment();
		ageOfPropertyEnter(age_of_property);
		uploadTitleDeed(title_deed_document);
		selectCategory(furnishing_status);
		selectEmirate(emirate);
		selectMapLocation(map_search, selected_map);
		selectLocation(location);
		selectSubLocation(sub_location);
		enterBedroomCabinCount(bedroom_cabin_count);
		enterBathroomCount(bathroom_count);
		scrollToElement(kitchen_pantry_click);
		enterKitchenPantryCount(kitchen_pantry_count);
		enterBalconyCount(balcony_count);
		enterParkingsCount(parking_count);
		trakheesiYes(trakheesi_number, rera_transaction_number);
		builtupArea.sendKeys(builtup_area);
		totalArea.sendKeys(total_area);
		suiteAreaField.sendKeys(suite_area);
		commonAreaField.sendKeys(common_area);
		balconyAreaField.sendKeys(balcony_area);
		selectAmenities(amenities_1, amenities_2, amenities_3);
		selectNearByAttractions(attraction_1, attraction_2, attraction_3);
		enterPriceDetails(price_from, price_to, listing_price);
		rentalYesWithDewa(rented_at, rented_until, contract_amount, dewa_number);
		addFilesApartment(thumbnail, other_images, plan_image, video_file);
		enterUrlDetails(virtual_tour_url, video_tour_url, youtube_url, brochure);
		scrollToElement(driver.findElement(By.xpath("//button[text()='Save']")));
		clickSave();
		waitForElementToBeClickable(driver.findElement(By.xpath("//button[text()='Done']")));
		clickDone();
	}

	// Add property with "Ready" property status,"villa" property type and add
	// sublocation and add video file , enter all URL's
	// we select project with one phase no payment plans
	// Trakheesi selected as "Yes" and Rental selected as "No"
	public void villaPropertyWithReadyStatus(String property_project, String unit_number, String title,
			String description, String property_category, String age_of_property, String title_deed_document,
			String furnishing_status, String emirate, String map_search, String selected_map, String location,
			String sub_location, String bedroom_cabin_count, String bathroom_count, String kitchen_pantry_count,
			String balcony_count, String parking_count, String trakheesi_number, String rera_transaction_number,
			String builtup_area, String total_area, String amenities_1, String amenities_2, String amenities_3,
			String amenities_4, String attraction_1, String attraction_2, String attraction_3, String price_from,
			String price_to, String listing_price, String rented_at, String rented_until, String contract_amount,
			String dewa_number, String thumbnail, String other_images, String plan_image, String video_file,
			String virtual_tour_url, String video_tour_url, String youtube_url, String brochure)
			throws InterruptedException, AWTException {
		selectProject(property_project);
		unitNumberField.sendKeys(unit_number);
		titleField.sendKeys(title);
		descriptionField.sendKeys(description);
		selectCategory(property_category);
		ready();
		villa();
		ageOfPropertyEnter(age_of_property);
		uploadTitleDeed(title_deed_document);
		selectCategory(furnishing_status);
		selectEmirate(emirate);
		selectMapLocation(map_search, selected_map);
		selectLocation(location);
		selectSubLocation(sub_location);
		enterBedroomCabinCount(bedroom_cabin_count);
		enterBathroomCount(bathroom_count);
		scrollToElement(kitchen_pantry_click);
		enterKitchenPantryCount(kitchen_pantry_count);
		enterBalconyCount(balcony_count);
		enterParkingsCount(parking_count);
		trakheesiYes(trakheesi_number, rera_transaction_number);
		builtupArea.sendKeys(builtup_area);
		totalArea.sendKeys(total_area);
		selectAmenities(amenities_1, amenities_2, amenities_3);
		selectNearByAttractions(attraction_1, attraction_2, attraction_3);
		enterPriceDetails(price_from, price_to, listing_price);
		rentalYesWithDewa(rented_at, rented_until, contract_amount, dewa_number);
		addFilesVilla(thumbnail, other_images, plan_image, video_file);
		enterUrlDetails(virtual_tour_url, video_tour_url, youtube_url, brochure);
		scrollToElement(driver.findElement(By.xpath("//button[text()='Save']")));
		clickSave();
		waitForElementToBeClickable(driver.findElement(By.xpath("//button[text()='Done']")));
		clickDone();
	}

	// Add property with "Ready" property status,"townhouse" property type and add
	// sublocation and add video file , enter all URL's
	// we select project with one phase no payment plans
	// Trakheesi selected as "Yes" and Rental selected as "No"
	public void townhousePropertyWithReadyStatus(String property_project, String unit_number, String title,
			String description, String property_category, String age_of_property, String title_deed_document,
			String furnishing_status, String emirate, String map_search, String selected_map, String location,
			String sub_location, String bedroom_cabin_count, String bathroom_count, String kitchen_pantry_count,
			String balcony_count, String parking_count, String trakheesi_number, String rera_transaction_number,
			String builtup_area, String total_area, String amenities_1, String amenities_2, String amenities_3,
			String amenities_4, String attraction_1, String attraction_2, String attraction_3, String price_from,
			String price_to, String listing_price, String rented_at, String rented_until, String contract_amount,
			String dewa_number, String thumbnail, String other_images, String plan_image, String video_file,
			String virtual_tour_url, String video_tour_url, String youtube_url, String brochure)
			throws InterruptedException, AWTException {
		selectProject(property_project);
		unitNumberField.sendKeys(unit_number);
		titleField.sendKeys(title);
		descriptionField.sendKeys(description);
		selectCategory(property_category);
		ready();
		townhouse();
		ageOfPropertyEnter(age_of_property);
		uploadTitleDeed(title_deed_document);
		selectCategory(furnishing_status);
		selectEmirate(emirate);
		selectMapLocation(map_search, selected_map);
		selectLocation(location);
		selectSubLocation(sub_location);
		enterBedroomCabinCount(bedroom_cabin_count);
		enterBathroomCount(bathroom_count);
		scrollToElement(kitchen_pantry_click);
		enterKitchenPantryCount(kitchen_pantry_count);
		enterBalconyCount(balcony_count);
		enterParkingsCount(parking_count);
		trakheesiYes(trakheesi_number, rera_transaction_number);
		builtupArea.sendKeys(builtup_area);
		totalArea.sendKeys(total_area);
		selectAmenities(amenities_1, amenities_2, amenities_3);
		selectNearByAttractions(attraction_1, attraction_2, attraction_3);
		enterPriceDetails(price_from, price_to, listing_price);
		rentalYesWithDewa(rented_at, rented_until, contract_amount, dewa_number);
		addFiles(thumbnail, other_images, plan_image, video_file);
		enterUrlDetails(virtual_tour_url, video_tour_url, youtube_url, brochure);
		scrollToElement(driver.findElement(By.xpath("//button[text()='Save']")));
		clickSave();
		waitForElementToBeClickable(driver.findElement(By.xpath("//button[text()='Done']")));
		clickDone();
	}

	// Add property with "Ready" property status,"office" property type and add
	// sublocation and add video file , enter all URL's
	// we select project with one phase no payment plans
	// Trakheesi selected as "Yes" and Rental selected as "No"
	public void officePropertyWithReadyStatus(String property_project, String unit_number, String title,
			String description, String property_category, String age_of_property, String title_deed_document,
			String furnishing_status, String emirate, String map_search, String selected_map, String location,
			String sub_location, String bedroom_cabin_count, String bathroom_count, String kitchen_pantry_count,
			String balcony_count, String parking_count, String trakheesi_number, String rera_transaction_number,
			String builtup_area, String total_area, String suite_area, String common_area, String balcony_area,
			String amenities_1, String amenities_2, String amenities_3, String amenities_4, String attraction_1,
			String attraction_2, String attraction_3, String price_from, String price_to, String listing_price,
			String rented_at, String rented_until, String contract_amount, String dewa_number, String thumbnail,
			String other_images, String plan_image, String video_file, String virtual_tour_url, String video_tour_url,
			String youtube_url, String brochure) throws InterruptedException, AWTException {
		selectProject(property_project);
		unitNumberField.sendKeys(unit_number);
		titleField.sendKeys(title);
		descriptionField.sendKeys(description);
		selectCategory(property_category);
		ready();
		office();
		ageOfPropertyEnter(age_of_property);
		uploadTitleDeed(title_deed_document);
		selectCategory(furnishing_status);
		selectEmirate(emirate);
		selectMapLocation(map_search, selected_map);
		selectLocation(location);
		selectSubLocation(sub_location);
		enterBedroomCabinCount(bedroom_cabin_count);
		enterBathroomCount(bathroom_count);
		scrollToElement(kitchen_pantry_click);
		enterKitchenPantryCount(kitchen_pantry_count);
		enterBalconyCount(balcony_count);
		enterParkingsCount(parking_count);
		trakheesiYes(trakheesi_number, rera_transaction_number);
		builtupArea.sendKeys(builtup_area);
		totalArea.sendKeys(total_area);
		suiteAreaField.sendKeys(suite_area);
		commonAreaField.sendKeys(common_area);
		balconyAreaField.sendKeys(balcony_area);
		selectAmenities(amenities_1, amenities_2, amenities_3);
		selectNearByAttractions(attraction_1, attraction_2, attraction_3);
		enterPriceDetails(price_from, price_to, listing_price);
		rentalYesWithDewa(rented_at, rented_until, contract_amount, dewa_number);
		addFiles(thumbnail, other_images, plan_image, video_file);
		enterUrlDetails(virtual_tour_url, video_tour_url, youtube_url, brochure);
		scrollToElement(driver.findElement(By.xpath("//button[text()='Save']")));
		clickSave();
		waitForElementToBeClickable(driver.findElement(By.xpath("//button[text()='Done']")));
		clickDone();
	}

	// Add property as service apartment with "Ready" status
	// Add the sub location,url fields and upload video
	// we select project with one phase no payment plans
	// Trakheesi selected as "Yes" and Rental selected as "Yes"
	public void serviceApartmentPropertyWithReadyStatus(String property_project, String unit_number, String title,
			String description, String property_category, String age_of_property, String title_deed_document,
			String furnishing_status, String emirate, String map_search, String selected_map, String location,
			String sub_location, String bedroom_cabin_count, String bathroom_count, String kitchen_pantry_count,
			String balcony_count, String parking_count, String trakheesi_number, String rera_transaction_number,
			String builtup_area, String total_area, String suite_area, String common_area, String balcony_area,
			String amenities_1, String amenities_2, String amenities_3, String amenities_4, String attraction_1,
			String attraction_2, String attraction_3, String price_from, String price_to, String listing_price,
			String rented_at, String rented_until, String contract_amount, String dewa_number, String thumbnail,
			String other_images, String plan_image, String video_file, String virtual_tour_url, String video_tour_url,
			String youtube_url, String brochure) throws InterruptedException, AWTException {
		selectProject(property_project);
		unitNumberField.sendKeys(unit_number);
		titleField.sendKeys(title);
		descriptionField.sendKeys(description);
		selectCategory(property_category);
		ready();
		serviceApartment();
		ageOfPropertyEnter(age_of_property);
		uploadTitleDeed(title_deed_document);
		selectCategory(furnishing_status);
		selectEmirate(emirate);
		selectMapLocation(map_search, selected_map);
		selectLocation(location);
		selectSubLocation(sub_location);
		enterBedroomCabinCount(bedroom_cabin_count);
		enterBathroomCount(bathroom_count);
		scrollToElement(kitchen_pantry_click);
		enterKitchenPantryCount(kitchen_pantry_count);
		enterBalconyCount(balcony_count);
		enterParkingsCount(parking_count);
		trakheesiYes(trakheesi_number, rera_transaction_number);
		builtupArea.sendKeys(builtup_area);
		totalArea.sendKeys(total_area);
		suiteAreaField.sendKeys(suite_area);
		commonAreaField.sendKeys(common_area);
		balconyAreaField.sendKeys(balcony_area);
		selectAmenities(amenities_1, amenities_2, amenities_3);
		selectNearByAttractions(attraction_1, attraction_2, attraction_3);
		enterPriceDetails(price_from, price_to, listing_price);
		rentalYesWithDewa(rented_at, rented_until, contract_amount, dewa_number);
		addFiles(thumbnail, other_images, plan_image, video_file);
		enterUrlDetails(virtual_tour_url, video_tour_url, youtube_url, brochure);
		scrollToElement(driver.findElement(By.xpath("//button[text()='Save']")));
		clickSave();
		waitForElementToBeClickable(driver.findElement(By.xpath("//button[text()='Done']")));
		clickDone();
	}

	// Property type as "Apartment" with "Under construction" status
	// sub location and urls and video files are uploading
	// Trkheesi as "No" and Rental as "Rental with Dewa"
	// Select project with payment plans
	public void apartmentPropertyWithUnderConstructionStatus(String property_project, String unit_number, String title,
			String description, String property_category, String age_of_property, String title_deed_document,
			String furnishing_status, String emirate, String map_search, String selected_map, String location,
			String sub_location, String bedroom_cabin_count, String bathroom_count, String kitchen_pantry_count,
			String balcony_count, String parking_count, String builtup_area, String total_area, String suite_area,
			String common_area, String balcony_area, String amenities_1, String amenities_2, String amenities_3,
			String amenities_4, String attraction_1, String attraction_2, String attraction_3, String price_from,
			String price_to, String listing_price,String payment_plan,String rented_at, String rented_until, String contract_amount,
			String thumbnail, String other_images, String plan_image, String video_file,
			String virtual_tour_url, String video_tour_url, String youtube_url, String brochure) throws InterruptedException {
		selectProject(property_project);
		unitNumberField.sendKeys(unit_number);
		titleField.sendKeys(title);
		descriptionField.sendKeys(description);
		selectCategory(property_category);
		underconstruction();
		apartment();
		selectCategory(furnishing_status);
		selectEmirate(emirate);
		selectMapLocation(map_search, selected_map);
		selectLocation(location);
		selectSubLocation(sub_location);
		enterBedroomCabinCount(bedroom_cabin_count);
		enterBathroomCount(bathroom_count);
		scrollToElement(kitchen_pantry_click);
		enterKitchenPantryCount(kitchen_pantry_count);
		enterBalconyCount(balcony_count);
		enterParkingsCount(parking_count);
		trakheesiNo();
		builtupArea.sendKeys(builtup_area);
		totalArea.sendKeys(total_area);
		suiteAreaField.sendKeys(suite_area);
		commonAreaField.sendKeys(common_area);
		balconyAreaField.sendKeys(balcony_area);
		selectAmenities(amenities_1, amenities_2, amenities_3);
		selectNearByAttractions(attraction_1, attraction_2, attraction_3);
		enterPriceDetails(price_from, price_to, listing_price);
		choosePaymentPlan(payment_plan);
		rentalYesWithOutDewa(rented_at, rented_until, contract_amount);
		addFiles(thumbnail, other_images, plan_image, video_file);
		enterUrlDetails(virtual_tour_url, video_tour_url, youtube_url, brochure);
		scrollToElement(driver.findElement(By.xpath("//button[text()='Save']")));
		clickSave();
		waitForElementToBeClickable(driver.findElement(By.xpath("//button[text()='Done']")));
		clickDone();
	}
}
