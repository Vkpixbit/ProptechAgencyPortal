package globalfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class GlobalData {

	public WebDriver driver;
	public LoginPage LoginPage;

	public WebDriver initalizedriver() throws IOException {
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"/Users/vk14/eclipse-workspace/AgencyPortal/src/main/java/resources/globaldata.properties");
		pro.load(fis);
		String browsername = pro.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	
	@BeforeClass(alwaysRun = true)
	public LoginPage openAgencyPortal() throws IOException {
		driver=initalizedriver();
		LoginPage =new LoginPage(driver);
		LoginPage.openLink();
		return LoginPage;
	}


	@AfterClass(alwaysRun = true)
	public void close() {
		driver.close();
	}
	
	public void getScreenshot() {
		
	}
	
	
	public List<HashMap<String, String>> getJsondata(String filepath) throws IOException {
		String jsoncontent = FileUtils.readFileToString(new File(filepath), StandardCharsets.UTF_8);
		ObjectMapper map = new ObjectMapper();
		List<HashMap<String, String>> data = map.readValue(jsoncontent,
				new TypeReference<List<HashMap<String, String>>>() {
				});
		return data;
	}
	
	@FindBy(xpath = "//button[text()='Done']")
	WebElement done;
	
	public void clickDone() {
		done.click();
	}
	
}
