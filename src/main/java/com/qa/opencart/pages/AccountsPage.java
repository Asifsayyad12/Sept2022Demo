package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.Utils.AppConstants;
import com.qa.opencart.Utils.ElementUtil;
import com.qa.opencart.Utils.TimeUtil;

public class AccountsPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	private By search=By.name("search");
	private By searchIcon =By.cssSelector("div#search button");
	private By logoutLink=By.linkText("Logout");
	private By accSearchHeader =By .cssSelector("div#content h2");
	
	
	public AccountsPage(WebDriver driver) {
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	
	}
	
	
	public String getAccountPageTitle() {
		return eleUtil.waitForTitleIs(AppConstants.ACCOUNT_PAGE_TITLE,TimeUtil.DEFAULT_TIME_OUT);
			
	}
	
	public String getAccountPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public boolean isSearchExist() {
		return eleUtil.waitForElementsVisible(search,TimeUtil.DEFAULT_TIME_OUT).isDisplayed();
	}

	public boolean isLogOutExist() {
		return eleUtil.waitForElementsVisible(logoutLink, TimeUtil.DEFAULT_TIME_OUT).isDisplayed();
	}
	
	public List<String> getAccountPageSectionsHeaders() {
		//List<WebElement> secHeaderList=driver.findElements(accSearchHeader);
		List<WebElement> secHeaderList=eleUtil.waitForElementsVisible(accSearchHeader, TimeUtil.DEFAULT_TIME_OUT,2);
		
		List<String> secHeaderValList=new ArrayList<String>();
		
		for(WebElement e:secHeaderList) {
			String text=e.getText();
			secHeaderValList.add(text);
		}
		return secHeaderValList;
		
	}
	
	
	
	
}
