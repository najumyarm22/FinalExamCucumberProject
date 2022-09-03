package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.junit.Assert;

public class FinalExamPage {

	WebDriver driver;
	String actualBlueButtonName;
	String expectedBlueButtonName;
	String actualWhiteButtonName;
	String expectedWhiteButtonName;

	public FinalExamPage(WebDriver driver) {
		driver = this.driver;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Set SkyBlue Background']") WebElement BLUE_BACKGROUND_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[text()='Set White Background']") WebElement WHITE_BACKGROUND_ELEMENT;

	public void validateSetSkyBlueBackgroundButtonExists() {
		expectedBlueButtonName = "Set SkyBlue Background";
		actualBlueButtonName = BLUE_BACKGROUND_ELEMENT.getText();
		Assert.assertEquals(expectedBlueButtonName, actualBlueButtonName);
	}

	public void clickOnSetSkyBlueBackgroundButton() {			
			BLUE_BACKGROUND_ELEMENT.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

	public void validateBackgroundColorChangedToBluSky() {
		Assert.assertTrue("SkyBlue Button is not enabled.", BLUE_BACKGROUND_ELEMENT.isEnabled());
	}
	
//=============================================================================================
	
	public void validateSetWhiteBackgroundButtonExists() {
		expectedWhiteButtonName = "Set White Background";
		actualWhiteButtonName = WHITE_BACKGROUND_ELEMENT.getText();
		Assert.assertEquals(expectedWhiteButtonName, actualWhiteButtonName);
	}
	
	public void clickOnSetWhiteBackgroundButton() {
		WHITE_BACKGROUND_ELEMENT.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void validateBackgroundColorChangedToWhite() {
		Assert.assertTrue("White Button is not enabled.", WHITE_BACKGROUND_ELEMENT.isEnabled());
	}
}
