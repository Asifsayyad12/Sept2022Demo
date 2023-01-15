package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.Utils.AppConstants;
import com.qa.opencart.Utils.ElementUtil;
import com.qa.opencart.Utils.TimeUtil;


public class LoginPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//1.Private By locator:
	
	private By emailId=By.id("input-email");
	private By password=By.id("input-password");
	private By loginBtn=By.xpath("//input[@value='Login']");
	private By forgotPwLink=By.linkText("Forgotten Password");
	
	//2.Page constructor:
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}
	
	//3.page actions:
	
	public String getLoginPageTitle() {
		return eleUtil.waitForTitleIs(AppConstants.LOGIN_PAGE_TITLE	,TimeUtil.DEFAULT_TIME_OUT);
	}
	 
	public String getLoginPageUrl() {
		return eleUtil.waitForUrlContains(AppConstants.LOGIN_PAGE_FRACTION_URL, TimeUtil.DEFAULT_TIME_OUT);
	}
	
	public boolean isforgotPWdLinkExist() {
		return eleUtil.doISDisplayed(forgotPwLink);
	}
	
	public AccountsPage doLogin(String un,String pwd) {
		System.out.println("Credential are..."+ un + "  " +pwd);
		eleUtil.waitForElementsVisible(emailId, TimeUtil.DEFAULT_TIME_OUT);
		
		
//		driver.findElement(emailId).sendKeys(un);
//		driver.findElement(password).sendKeys(pwd);
//		driver.findElement(loginBtn).click();
		//return driver.findElement(By.linkText("Logout")).isDisplayed();
		
		return new AccountsPage(driver);
		
	}
	
	
	

}
