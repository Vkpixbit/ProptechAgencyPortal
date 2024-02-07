package project;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import AgencyPortal.HomePage;
import AgencyPortal.ProjectCreatePage;
import AgencyPortal.ProjectPage;
import AgencyPortal.ProjectShowPage;
import globalfiles.GlobalData;
import io.cucumber.java.hu.Ha.Has;
import io.cucumber.java.it.Data;

public class CreateProject extends GlobalData {

	/*
	 * Create project as "Ready" Unit with "Yes" in Post Handover 1 Phase, 1 Payment
	 * Plan and 1 Payment shedule
	 */
	@Test(dataProvider = "projectCreateData_1", enabled = true)
	public void singlePhaseReadyYesPosthandover_1(HashMap<String, String> input)
			throws InterruptedException, AWTException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		ProjectPage ProjectPage = HomePage.openProjects();
		ProjectCreatePage ProjectCreatePage = ProjectPage.openAddProject();
		ProjectCreatePage.selectDeveloperAndStatus(input.get("project_developer"), input.get("project_status"));
		ProjectCreatePage.enterProjectDetails(input.get("project_name"), input.get("project_number"),
				input.get("project_description"), input.get("escrow_number"));
		ProjectCreatePage.readyUnitYesPostHandover_1(input.get("phase_name"), input.get("noc_document"),
				input.get("unit_status"), input.get("post_handover_status"), input.get("payment_name"),
				input.get("date"), input.get("particular_value"), input.get("period"), input.get("booking_amount"));
	}

	@DataProvider
	public Object[][] projectCreateData_1() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/ProjectDetails_1.json");
		return new Object[][] { { value.get(0) } };
	}

	// Create project as "Ready" Unit with "No" Post handover
	// No phase show we select post handover as "No"
	@Test(dataProvider = "projectCreateData_2", enabled = false)
	public void singlePhaseReadyNoPosthandover_1(HashMap<String, String> input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		ProjectPage ProjectPage = HomePage.openProjects();
		ProjectCreatePage ProjectCreatePage = ProjectPage.openAddProject();
		ProjectCreatePage.selectDeveloperAndStatus(input.get("project_developer"), input.get("project_status"));
		ProjectCreatePage.enterProjectDetails(input.get("project_name"), input.get("project_number"),
				input.get("project_description"), input.get("escrow_number"));
		ProjectCreatePage.readyUnitNoPostHandover(input.get("phase_name"), input.get("noc_document"));
		ProjectShowPage ProjectShowPage = ProjectPage.openAddedProject(input.get("project_name"));
		ProjectShowPage.verifyProjectReadyUnitNoPostHandover(input.get("project_developer"),
				input.get("project_status"), input.get("project_name"), input.get("project_number"),
				input.get("project_description"), input.get("escrow_number"), input.get("phase_name"));

	}

	@DataProvider
	public Object[][] projectCreateData_2() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/ProjectDetails_1.json");
		return new Object[][] { { value.get(1) } };
	}

	// Create Project as "Under construction" Unit
	// 1 Phase, 1 Payment Plan and 1 Payment shedule
	@Test(dataProvider = "projectCreateData_3")
	public void singlePhaseUnderconstruction_1(HashMap<String, String> input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		ProjectPage ProjectPage = HomePage.openProjects();
		ProjectCreatePage ProjectCreatePage = ProjectPage.openAddProject();
		ProjectCreatePage.selectDeveloperAndStatus(input.get("project_developer"), input.get("project_status"));
		ProjectCreatePage.enterProjectDetails(input.get("project_name"), input.get("project_number"),
				input.get("project_description"), input.get("escrow_number"));
		ProjectCreatePage.underconstructionUnit(input.get("phase_name"), input.get("noc_document"),
				input.get("payment_name"), input.get("date"), input.get("particular_value"), input.get("period"),
				input.get("booking_amount"));
	}

	@DataProvider
	public Object[][] projectCreateData_3() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/ProjectDetails_1.json");
		return new Object[][] { { value.get(2) } };
	}

	// Create Project as "Ready" unit
	// 1 phase 2 payment plan first plan contain 3 shedules and second plan contain
	// 2 shedules
	@Test(dataProvider = "projectCreateData_4")
	public void singlePhaseReadyYesPosthandover_2(HashMap<String, String> input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		ProjectPage ProjectPage = HomePage.openProjects();
		ProjectCreatePage ProjectCreatePage = ProjectPage.openAddProject();
		ProjectCreatePage.selectDeveloperAndStatus(input.get("project_developer"), input.get("project_status"));
		ProjectCreatePage.enterProjectDetails(input.get("project_name"), input.get("project_number"),
				input.get("project_description"), input.get("escrow_number"));
		ProjectCreatePage.readyUnitYesPostHandover_2(input.get("phase_name"), input.get("noc_document"),
				input.get("payment_name_1"), input.get("date_1"), input.get("particular_value_1"),
				input.get("period_1"), input.get("booking_amount_1"), input.get("date_2"),
				input.get("particular_value_2"), input.get("period_2"), input.get("booking_amount_2"),
				input.get("payment_name_2"), input.get("date_3"), input.get("particular_value_3"),
				input.get("period_3"), input.get("booking_amount_3"), input.get("date_4"),
				input.get("particular_value_4"), input.get("period_4"), input.get("booking_amount_4"),
				input.get("date_5"), input.get("particular_value_5"), input.get("period_5"),
				input.get("booking_amount_5"));
	}

	@DataProvider
	public Object[][] projectCreateData_4() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/ProjectDetails_2.json");
		return new Object[][] { { value.get(0) } };
	}

	// Create project with Under construction status
	// 1 phase 2 payment plan first plan contain 2 shedules and second plan contains
	// 3 shedules
	@Test(dataProvider = "projectCreateData_5")
	public void singlePhaseUnderconstruction_2(HashMap<String, String> input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		ProjectPage ProjectPage = HomePage.openProjects();
		ProjectCreatePage ProjectCreatePage = ProjectPage.openAddProject();
		ProjectCreatePage.selectDeveloperAndStatus(input.get("project_developer"), input.get("project_status"));
		ProjectCreatePage.enterProjectDetails(input.get("project_name"), input.get("project_number"),
				input.get("project_description"), input.get("escrow_number"));
		ProjectCreatePage.underConstructionUnit2(input.get("phase_name"), input.get("noc_document"),
				input.get("payment_name_1"), input.get("date_1"), input.get("particular_value_1"),
				input.get("period_1"), input.get("booking_amount_1"), input.get("date_2"),
				input.get("particular_value_2"), input.get("period_2"), input.get("booking_amount_2"),
				input.get("payment_name_2"), input.get("date_3"), input.get("particular_value_3"),
				input.get("period_3"), input.get("booking_amount_3"), input.get("date_4"),
				input.get("particular_value_4"), input.get("period_4"), input.get("booking_amount_4"),
				input.get("date_5"), input.get("particular_value_5"), input.get("period_5"),
				input.get("booking_amount_5"));
	}

	@DataProvider
	public Object[][] projectCreateData_5() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/ProjectDetails_2.json");
		return new Object[][] { { value.get(1) } };
	}

	/*
	 * Create Project with Ready unit status and Post Handover as "No"
	 */
	@Test(dataProvider = "project_create_with_ready_posthandover_no")
	public void projectWithReadyAndPosthandoverNo(HashMap<String, String> input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		ProjectPage ProjectPage = HomePage.openProjects();
		ProjectCreatePage ProjectCreatePage = ProjectPage.openAddProject();
		ProjectCreatePage.selectDeveloperAndStatus(input.get("project_developer"), input.get("project_status"));
		ProjectCreatePage.enterProjectDetails(input.get("project_name"), input.get("project_number"),
				input.get("project_description"), input.get("escrow_number"));
		ProjectCreatePage.readyUnitNoPostHandover(input.get("phase_name_1"), input.get("noc_document"));
	}

	@DataProvider
	public Object[][] project_create_with_ready_posthandover_no() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				System.getProperty("user.dir") + "/src/test/java/data/ProjectDetails_1.json");
		return new Object[][] { { value.get(1) } };
	}

	/*
	 * Create Project with Ready unit and Under construction 2 phases first phase 2
	 * payment plan first plan 3 shedules and second plan two shedules second phase
	 * 2 payment plan first plan contain 2 shedules and second plan contains 2
	 * shedule
	 */
	@Test(dataProvider = "projectCreateData_6")
	public void twoPhaseReadyAndUnderConstruction_1(HashMap<String, String> input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		ProjectPage ProjectPage = HomePage.openProjects();
		ProjectCreatePage ProjectCreatePage = ProjectPage.openAddProject();
		ProjectCreatePage.selectDeveloperAndStatus(input.get("project_developer"), input.get("project_status"));
		ProjectCreatePage.enterProjectDetails(input.get("project_name"), input.get("project_number"),
				input.get("project_description"), input.get("escrow_number"));
		ProjectCreatePage.ReadyAndUnderconstructionCases(input.get("phase_name_1"), input.get("noc_document"),
				input.get("payment_name_1"), input.get("date_1"), input.get("particular_value_1"),
				input.get("period_1"), input.get("booking_amount_1"), input.get("date_2"),
				input.get("particular_value_2"), input.get("period_2"), input.get("booking_amount_2"),
				input.get("payment_name_2"), input.get("date_3"), input.get("particular_value_3"),
				input.get("period_3"), input.get("booking_amount_3"), input.get("date_4"),
				input.get("particular_value_4"), input.get("period_4"), input.get("booking_amount_4"),
				input.get("date_5"), input.get("particular_value_5"), input.get("period_5"),
				input.get("booking_amount_5"), input.get("phase_name_2"), input.get("payment_name_2_1"),
				input.get("date2_1"), input.get("particular_2_1"), input.get("period_2_1"),
				input.get("booking_amount_2_1"), input.get("date_2_2"), input.get("particular_value_2_2"),
				input.get("period_2_2"), input.get("booking_amount_2_2"), input.get("payment_name_2_2"),
				input.get("date_2_3"), input.get("particular_value_2_3"), input.get("period_2_3"),
				input.get("booking_amount_2_3"), input.get("date_2_4"), input.get("particular_value_2_4"),
				input.get("period_2_4"), input.get("booking_amount_2_4"));
		ProjectCreatePage.projectSave();
	}

	@DataProvider
	public Object[][] projectCreateData_6() throws IOException {
		List<HashMap<String, String>> value = getJsondata(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/data/ProjectDetails_3.json");
		return new Object[][] { { value.get(0) } };
	}

	/*
	 * Create Project with Under construction and Ready, Ready First phase Ready
	 * contain 1 payment plan 2 shedules second phase Underconstruction contain 2
	 * payment plan first plan 1 shedule and second plan 2 shedule third phase
	 * contain 1 payment plan 1 shedule
	 */
	public void threePhaseTwoReadyOneUnderConstruction(HashMap<String, String> input) throws InterruptedException {
		HomePage HomePage = LoginPage.login(input.get("email_id"), input.get("password"));
		ProjectPage ProjectPage = HomePage.openProjects();
		ProjectCreatePage ProjectCreatePage = ProjectPage.openAddProject();
		ProjectCreatePage.enterProjectDetails(input.get("project_name"), input.get("project_number"),
				input.get("project_description"), input.get("escrow_number"));

	}
}
