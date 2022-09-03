package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FinalExamPage;
import pages.TestBase;

public class FinalExamStepDefinition extends TestBase{
	
	FinalExamPage finalExamPage;
	WebElement actualWhiteButtonName;
	String expectedWhiteButtonName;
	
	
	@Before
	public void openUrl() {
		initDriver();
		finalExamPage=PageFactory.initElements(driver, FinalExamPage.class);
	}
	
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() {		
		finalExamPage.validateSetSkyBlueBackgroundButtonExists();
	}

	@When("^I click on the Set SkyBlue button$")
	public void i_click_on_the_Set_SkyBlue_button() {
		finalExamPage.clickOnSetSkyBlueBackgroundButton();
	}
	
	@Then("^The background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		finalExamPage.validateBackgroundColorChangedToBluSky();
	}

	//================================================================================
	
	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() {
		finalExamPage.validateSetWhiteBackgroundButtonExists();
		finalExamPage.clickOnSetSkyBlueBackgroundButton();
	}

	@When("^I click on the Set White Backgroung button$")
	public void i_click_on_the_Set_White_Backgroung_button() {
		finalExamPage.clickOnSetWhiteBackgroundButton();
	}

	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white() {
		finalExamPage.validateBackgroundColorChangedToWhite();
	}

	
	@After
	public void closeBrowser() {
		tearDown();
	}
}
