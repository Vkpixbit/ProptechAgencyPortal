package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusefiles.Components;

public class ProjectPage extends Components {

	WebDriver driver;

	public ProjectPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Add a Project']")
	WebElement addProject;

	@FindBy(xpath = "//h5")
	List<WebElement> projectList;

	public ProjectCreatePage openAddProject() {
		
		addProject.click();
		return new ProjectCreatePage(driver);
	}

	public ProjectShowPage openAddedProject(String project_name) throws InterruptedException {
		for (WebElement project : projectList) {
			if (project.getText().equalsIgnoreCase(project_name)) {
				project.click();
				Thread.sleep(2000);
			}
		}
		return new ProjectShowPage(driver);
	}
	
}
