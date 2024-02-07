package AgencyPortal;

import java.awt.AWTException;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

	@FindBy(xpath = "//input[@id='number_of_unit']")
	WebElement unitNumberField;

	@FindBy(xpath = "//button[@class='btn btn-outline-primary']")
	WebElement chooseTeamButton;

	@FindBy(xpath = "//button[@class='accordion-button collapsed']")
	List<WebElement> listOfPsTeam;

	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> listOfCheckbox;

	@FindBy(xpath = "//div[@id='property_type_id']")
	WebElement propertyTypeDropdwon;

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
	public WebElement builtupArea;

	@FindBy(id = "totalArea")
	public WebElement totalArea;

	@FindBy(id = "suitArea")
	public WebElement suiteAreaField;

	@FindBy(id = "commonArea")
	public WebElement commonAreaField;

	@FindBy(id = "balconyArea")
	public WebElement balconyAreaField;

	@FindBy(xpath = "//label[text()='Trakheesi*']")
	WebElement trakheesiHeading;

	@FindBy(xpath = "//input[@class='form-control flex-1']")
	WebElement nearByAttractionSearch;

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

	@FindBy(xpath = "//input[@id='maintanceFee']")
	WebElement mainantenaceFee;

	@FindBy(xpath = "//button[text()='Choose Payment Plan']")
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

	/*
	 * Click save button
	 */
	public void clickSaveButton() throws InterruptedException {
		clickSave();
	}

	/*
	 * click done buttton
	 */
	public void clickDoneButton() throws InterruptedException {
		clickDone();
	}

	/*
	 * Scroll down to save button
	 */
	public void scrollToSave() {
		scrollToElement(save);
	}

	/*
	 * Select the project from dropdown
	 */
	public void selectProject(String property_project) throws InterruptedException {
		projectDropdown.click();
		Thread.sleep(2000);
		WebElement requiredProject = driver.findElement(By.xpath("//div[text()='" + property_project + "']"));
		requiredProject.click();

	}

	/*
	 * select the phase from dropdown
	 */
	public void selectPhase(String property_phase) throws InterruptedException {
		phaseDropdown.click();
		Thread.sleep(3000);

		List<WebElement> listofElement = driver.findElements(By.xpath("//div[text()='" + property_phase + "']"));
		System.out.println(listofElement.size());
		
		if(listofElement.size() > 2)
			for(WebElement element:listofElement) {
				if(element.getText().contains(property_phase)) {
					driver.findElement(By.xpath("//div[text()='" + property_phase + "']")).click();
					System.out.println("5");
				}	
			}
		else {
		}
	}

	/*
	 * Enter Unit count
	 */
	public void enterNumberOfUnit(String unit_number) {
		unitNumberField.sendKeys(unit_number);
	}

	/*
	 * Select Property Specialist Team
	 */
	public void selectPropertySpecalist(String ps_team_name) throws InterruptedException {
		chooseTeamButton.click();
		Thread.sleep(2000);
		for (WebElement team : listOfPsTeam) {
			if (team.getText().contains(ps_team_name)) {
				team.click();
				Thread.sleep(2000);
				for (WebElement requiredTeam : listOfCheckbox) {
					if (requiredTeam.isDisplayed()) {
						requiredTeam.click();
					}
				}
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	/*
	 * Enter Property titile
	 */
	public void enterPropertyTitle(String title) throws InterruptedException {
		Thread.sleep(2000);
		titleField.sendKeys(title);
	}

	/*
	 * Update Property Description
	 */
	public void updatePropertyDescription(String description) {
		if (descriptionField.getText().isEmpty()) {
			descriptionField.sendKeys(description);
		} else {
			clearDataInField(descriptionField);
			descriptionField.sendKeys(description);
		}

	}

	/*
	 * Select Category Residential,Commerical
	 */
	public void selectCategory(String property_category) {
		WebElement requiredCategory = driver.findElement(
				By.xpath("//label[@class='form-check-label' and contains(text(),'" + property_category + "')]"));
		requiredCategory.click();
	}

	/*
	 * Select Property status as Ready
	 */
	public void ready() {
		driver.findElement(By.xpath("//label[@class='form-check-label' and contains(text(),'Ready')]")).click();
	}

	/*
	 * Select property status as Underconstruction
	 */
	public void underconstruction() {
		driver.findElement(By.xpath("//label[@class='form-check-label' and contains(text(),'Under Construction')]"))
				.click();
	}

	/*
	 * Select Apartment
	 */
	public void apartment() throws InterruptedException {
		propertyTypeDropdwon.click();
		Thread.sleep(2000);
		WebElement requiredPropertyType = driver.findElement(By.xpath("//div[text()='Apartment']"));
		requiredPropertyType.click();
	}

	/*
	 * Select Townhouse
	 */
	public void townhouse() throws InterruptedException {
		propertyTypeDropdwon.click();
		Thread.sleep(2000);
		WebElement requiredPropertyType = driver.findElement(By.xpath("//div[text()='Townhouse']"));
		requiredPropertyType.click();
	}

	/*
	 * Select Villa
	 */
	public void villa() throws InterruptedException {
		propertyTypeDropdwon.click();
		Thread.sleep(2000);
		WebElement requiredPropertyType = driver.findElement(By.xpath("//div[text()='Villa']"));
		requiredPropertyType.click();
	}

	/*
	 * Select Office
	 */
	public void office() throws InterruptedException {
		propertyTypeDropdwon.click();
		Thread.sleep(2000);
		WebElement requiredPropertyType = driver.findElement(By.xpath("//div[text()='Office']"));
		requiredPropertyType.click();
	}

	/*
	 * Select service apartment
	 */
	public void serviceApartment() throws InterruptedException {
		propertyTypeDropdwon.click();
		Thread.sleep(2000);
		WebElement requiredPropertyType = driver.findElement(By.xpath("//div[text()='Service Apartment']"));
		requiredPropertyType.click();
	}

	/*
	 * Enter Age of property
	 */
	public void ageOfPropertyEnter(String age_of_property) {
		ageOfProperty.sendKeys(age_of_property);
	}

	/*
	 * Upload title deed document
	 */
	public void uploadTitleDeed(String title_deed_document) throws AWTException {
		titleDeedField.sendKeys("/Users/vk14/Downloads/" + title_deed_document);
	}

	/*
	 * Select Furnishing status
	 */
	public void selectFurnishingStatus(String furnishing_status) {
		WebElement requiredFurnishingStatus = driver.findElement(
				By.xpath("//label[@class='form-check-label' and contains(text(),'" + furnishing_status + "')]"));
		requiredFurnishingStatus.click();
	}

	/*
	 * select the Emirate
	 */
	public void selectEmirate(String emirate) throws InterruptedException {
		scrollToElement(emirateDropdown);
		Thread.sleep(2000);
		emirateDropdown.click();
		Thread.sleep(2000);
		WebElement requiredDropdown = driver.findElement(By.xpath("//div[text()='" + emirate + "']"));
		requiredDropdown.click();
	}

	/*
	 * Select google map location
	 */
	public void selectMapLocation(String map_search, String selected_map) throws InterruptedException {
		mapOpenClick.click();
		Thread.sleep(2000);
		mapSearchField.sendKeys(map_search);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + selected_map + "']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	/*
	 * select the location
	 */
	public void selectLocation(String location) throws InterruptedException {
		locationDropdown.click();
		Thread.sleep(2000);
		WebElement requiredLocation = driver.findElement(By.xpath("//div[text()='" + location + "']"));
		requiredLocation.click();
	}

	/*
	 * Select the sub location
	 */
	public void selectSubLocation(String sub_location) throws InterruptedException {
		subLocationDropdown.click();
		Thread.sleep(2000);
		WebElement requiredSubLocation = driver.findElement(By.xpath("//div[text()='" + sub_location + "']"));
		requiredSubLocation.click();
	}

	/*
	 * Enter bedroom count
	 */
	public void enterBedroomCabinCount(String bedroom_cabin_count) throws InterruptedException {
		Thread.sleep(2000);
		scrollToElement(bedroomCabinManualButton);
		Thread.sleep(2000);
		bedroomCabinManualButton.click();
		Thread.sleep(2000);
		clearDataInField(bedroomCabinManualField);
		Thread.sleep(2000);
		bedroomCabinManualField.sendKeys(bedroom_cabin_count);
	}

	/*
	 * Enter Bathroom count
	 */
	public void enterBathroomCount(String bathroom_count) throws InterruptedException {
		Thread.sleep(2000);
		bathroomManualButton.click();
		Thread.sleep(2000);
		clearDataInField(bathroomManualField);
		Thread.sleep(2000);
		bathroomManualField.sendKeys(bathroom_count);
	}

	/*
	 * Enter kitchen/Pantry count
	 */
	public void enterKitchenPantryCount(String kitchen_pantry_count) throws InterruptedException {
		Thread.sleep(2000);
		scrollToElement(kitchenPantryManualButton);
		Thread.sleep(2000);
		kitchenPantryManualButton.click();
		Thread.sleep(2000);
		clearDataInField(kitchenPantryManualField);
		Thread.sleep(2000);
		kitchenPantryManualField.sendKeys(kitchen_pantry_count);
	}

	/*
	 * Enter Balcony count
	 */
	public void enterBalconyCount(String balcony_count) throws InterruptedException {
		Thread.sleep(2000);
		balconyManualButton.click();
		Thread.sleep(2000);
		clearDataInField(balconyManualField);
		Thread.sleep(2000);
		balconyManualField.sendKeys(balcony_count);
	}

	// Enter Parking count
	public void enterParkingsCount(String parking_count) throws InterruptedException {
		Thread.sleep(2000);
		scrollToElement(parkingManualButton);
		parkingManualButton.click();
		Thread.sleep(2000);
		clearDataInField(parkingManualField);
		Thread.sleep(2000);
		parkingManualField.sendKeys(parking_count);
	}

	/*
	 * Select Trakheesi status as "Yes"
	 */
	public void trakheesiYes(String trakheesi_number, String rera_transaction_number) throws InterruptedException {
		waitForElementToBeClickable(trakheesiNumberField);
		trakheesiNumberField.sendKeys(trakheesi_number);
		reraNumberField.sendKeys(rera_transaction_number);
		Thread.sleep(2000);
	}

	/*
	 * Select trakheesi status as "No"
	 */
	public void trakheesiNo() throws InterruptedException {
		WebElement trakheesiNoStatusField = driver
				.findElement(By.xpath("(//label[@class='form-check-label' and contains(text(),'No')])[2]"));
		scrollToElement(trakheesiNoStatusField);
		waitForElementToBeClickable(trakheesiNoStatusField);
		Thread.sleep(2000);
		trakheesiNoStatusField.click();
		Thread.sleep(2000);

	}

	/*
	 * Select amenities
	 */
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
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

	/*
	 * Select near by attractions
	 */
	public void selectNearByAttractions(String attraction_1, String attraction_2, String attraction_3,String attraction_4)
			throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add Nearby Attractions']")).click();
		Thread.sleep(2000);
		List<String> targetAttractionText = Arrays.asList(attraction_1, attraction_2, attraction_3);
		for (String target : targetAttractionText) {
			nearByAttractionSearch.sendKeys(target);
			nearByAttractionSearch.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='ms-2 pb-3 form-check']")).click();
			clearDataInField(nearByAttractionSearch);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

	/*
	 * Enter Price ranges and price details
	 */
	public void enterPriceDetails(String price_from, String price_to, String listing_price)
			throws InterruptedException {
		Thread.sleep(2000);
		priceFrom.sendKeys(price_from);
		priceTo.sendKeys(price_to);
		listingPrice.sendKeys(listing_price);
		Thread.sleep(3000);
	}

	/*
	 * Enter Maintenance Fee/Service charge
	 */
	public void enterMaintenanceFee(String mainteance_fee) throws InterruptedException {
		Thread.sleep(2000);
		mainantenaceFee.sendKeys(mainteance_fee);
	}

	/*
	 * Choosing Payment Plans
	 */
	public void choosePaymentPlan(String payment_plan) throws InterruptedException {
		scrollToElement(paymentPlanButton);
		Thread.sleep(2000);
		paymentPlanButton.click();
		Thread.sleep(2000);
		WebElement selectedPaymentPlan = driver.findElement(By.xpath("//button[contains(.,'" + payment_plan + "')]"));
		selectedPaymentPlan.click();
		Thread.sleep(2000);
		for (WebElement plancheck : listOfCheckbox) {
			if (plancheck.isDisplayed()) {
				plancheck.click();
			}
		}
		clickDone();
	}

	/*
	 * Add rental Details as "Yes" with "Dewa Number"
	 */
	public void rentalYesWithDewa(String rented_at, String rented_until, String contract_amount, String dewa_number)
			throws InterruptedException {
		scrollToElement(paymentPlanButton);
		WebElement selectedRentalStatus = driver
				.findElement(By.xpath("(//label[@class='form-check-label' and contains(text(),'Yes')])[2]"));
		scrollToElement(selectedRentalStatus);
		selectedRentalStatus.click();
		Thread.sleep(2000);
		rentedAtField.sendKeys(rented_at);
		rentedUntilField.sendKeys(rented_until);
		contractAmount.sendKeys(contract_amount);
		dewaNumberField.sendKeys(dewa_number);
	}

	/*
	 * Add rental Details as "Yes" with "Dewa Number"
	 */
	public void rentalYesWithOutDewa(String rented_at, String rented_until, String contract_amount)
			throws InterruptedException {
		scrollToElement(paymentPlanButton);
		WebElement selectedRentalStatus = driver
				.findElement(By.xpath("(//label[@class='form-check-label' and contains(text(),'Yes')])[2]"));
		scrollToElement(selectedRentalStatus);
		selectedRentalStatus.click();
		Thread.sleep(2000);
		rentedAtField.sendKeys(rented_at);
		rentedUntilField.sendKeys(rented_until);
		contractAmount.sendKeys(contract_amount);
	}

	/*
	 * Add rental Details as "No"
	 */
	public void rentalNo() throws InterruptedException {
		WebElement selectedRentalStatus = driver
				.findElement(By.xpath("(//label[@class='form-check-label' and contains(text(),'No')])[3]"));
		visbilityOfElement(selectedRentalStatus);
		selectedRentalStatus.click();
	}

	/*
	 * Upload files for apartment
	 */
	public void addFilesApartment(String thumbnail, String other_images, String plan_image, String video_file) {
		thumbnailUpload.sendKeys("/Users/vk14/Downloads/property_images/apartment/" + thumbnail);
		addMoreImages.sendKeys("/Users/vk14/Downloads/property_images/other images/" + other_images);
		planImageField.sendKeys("/Users/vk14/Downloads/property_images/plan/" + plan_image);
		videoUpload.sendKeys("/Users/vk14/Downloads/" + video_file);
	}

	/*
	 * Upload files for Villa
	 */
	public void addFilesVilla(String thumbnail, String other_images, String plan_image, String video_file) {
		thumbnailUpload.sendKeys("/Users/vk14/Downloads/property_images/villa/" + thumbnail);
		addMoreImages.sendKeys("/Users/vk14/Downloads/property_images/other images/" + other_images);
		planImageField.sendKeys("/Users/vk14/Downloads/property_images/plan/" + plan_image);
		videoUpload.sendKeys("/Users/vk14/Downloads/" + video_file);
	}

	/*
	 * Enter URL details
	 */
	public void enterUrlDetails(String virtual_tour_url, String video_tour_url, String youtube_url, String brochure)
			throws InterruptedException {
		virtualtourUrlField.sendKeys(virtual_tour_url);
		videtourUrlField.sendKeys(video_tour_url);
		youtubeUrlField.sendKeys(youtube_url);
		waitForElementToBeClickable(brochureUpload);
		brochureUpload.sendKeys("/Users/vk14/Downloads/" + brochure);

	}

	/*
	 * Upload Property Brochure
	 */
	public void uploadBrochure(String brochure) throws InterruptedException {
		waitForElementToBeClickable(brochureUpload);
		brochureUpload.sendKeys("/Users/vk14/Downloads/" + brochure);
		Thread.sleep(2000);
	}

}
