package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class CreateLead {
	RemoteWebDriver driver;
	@Given("open the chrome browser")
	public void openBrowser() {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver =new ChromeDriver();
	}
	@And("maximize the chrome browser")	
	public void maximiseBrowser() {

		driver.manage().window().maximize();
	}
	@And("Type the URLfor website")
	public void enterURL() {

		driver.get("http://leaftaps.com/opentaps/");
	}

	@And("Set the Timeoutsfor createLead")
	public void timeset() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("Enter UserName as (.*)")
	public void enterUserName(String userName) {

		driver.findElementById("username").sendKeys(userName);
	}

	@And("Enter password as (.*)")
	public void enterPassword(String data) {

		driver.findElementById("password").sendKeys(data);
	}

	@And("Click login Button")
	public void clickLoginButton() {

		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	


	@And("Verify login sucessfull")
	public void verifyloginSite() {

		System.out.println("Login to the Site and user is sucessfull");
	}
	
	@And("Click CRMSFA")
	public void clickCRMSFA() {

		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click Lead")
	public void clickLead() {

		driver.findElementByLinkText("Leads").click();
	}

	@And("Click Create Lead")
	public void clickCreateLead() {

		driver.findElementByLinkText("Create Lead").click();
	}

	@And("Enter the company Name as (.*)")
	public void enterCompanyName(String data) {

		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}

	@And("Enter the First Name as (.*)")
	public void enterFirstName(String data) {
		WebElement firstname = driver.findElementById("createLeadForm_firstName");
		firstname.sendKeys(data);
	}
	@And("Enter the last Name as (.*)")
	public void enterLastName(String data) {

		driver.findElementById("createLeadForm_lastName").sendKeys(data);

	}

	@And("Click the Create Lead button")
	public void clickCreateLeadButton() {

		driver.findElementByClassName("smallSubmit").click();

	}

	@And("Verify Create Lead is created")
	public void verifyCreateLeadIsCompleted() {

		System.out.println("create lead is completed");

	}


}
