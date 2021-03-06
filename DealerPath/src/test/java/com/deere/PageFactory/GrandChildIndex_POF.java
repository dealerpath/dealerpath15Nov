package com.deere.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.deere.Helpers.BaseClass;
import com.deere.Helpers.WaitFactory;

public class GrandChildIndex_POF  extends BaseClass {
	public static WebDriver grandChildIndexDriver;
	public GrandChildIndex_POF(WebDriver driver) {
		this.grandChildIndexDriver = driver;
	}
	
	@FindBy(how = How.ID, using = "preference-cancel")
	static WebElement wbelMyPreferenceModalCancelButton;

	
	@FindBy(how = How.XPATH, using = "//*[@type='radio']")
	static List<WebElement> wbelMyPreferenceModalTheme;
	
	@FindBy(how = How.XPATH, using = "//*[@class='section-title']")
	static WebElement wbelHomeFav;
	
	@FindBy(how = How.XPATH, using = "//span[@class='primary-caret spr']")
	static WebElement wbelMyPreferenceUtilityMenu;
	
	@FindBy(how = How.XPATH, using = "//a[@id='preferences']")
	static WebElement wbelMyPreference;
	
	
	
	public static void navigateToHomepage() throws Exception {
		WaitFactory.implicitWaitInSeconds(5);
		Thread.sleep(500);
		wbelMyPreferenceModalCancelButton.click();

		grandChildIndexDriver.switchTo().defaultContent();
		WaitFactory.waitForElement(wbelHomeFav);
	}

	public static void navigateToMyPreferences() throws Exception {

		WaitFactory.waitForElement(wbelMyPreferenceUtilityMenu);
		wbelMyPreferenceUtilityMenu.click();
		Thread.sleep(500);
		WaitFactory.waitForElement(wbelMyPreference);
		wbelMyPreference.click();
		Thread.sleep(500);
		grandChildIndexDriver.switchTo().activeElement();
		WaitFactory.waitForPageLoaded();

	}
}


