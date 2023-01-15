package com.qa.opencart.tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.Utils.AppConstants;
import com.qa.opencart.Utils.AppErrors;
import com.qa.opencart.base.BeseTest;

public class AccountPageTest extends BeseTest {

	
	@BeforeClass
	public void accountsetup() {
	accPage=loginpage.doLogin("asif01@gmail.com","Asif@123");
	}
	
	
	@Test
	public void accPageTitleTest() {
		String actTitle=accPage.getAccountPageTitle();
		Assert.assertEquals(actTitle,AppConstants.ACCOUNT_PAGE_TITLE);
	}
	
	@Test
	public void accPageUrlTest() {
	String actURL=accPage.getAccountPageUrl();
	System.out.println(actURL);
	Assert.assertTrue(actURL.contains(AppConstants.ACC_PAGE_FRACTIONAL_URL),AppErrors.NO_URL_MATCHED);
	}
	
	@Test
	public void searchExistTest() {
	Assert.assertTrue(accPage.isSearchExist());
	}
	
	@Test
	public void LogOutExistTest() {
		Assert.assertTrue(accPage.isLogOutExist());
	}
	
	@Test
	public void accountPageHeaderTest() {
	List<String> actHeaderList=	accPage.getAccountPageSectionsHeaders();
	Assert.assertEquals(actHeaderList, AppConstants.EXPECTED_ACC_HEADER_LIST);
	
	}
	
}
